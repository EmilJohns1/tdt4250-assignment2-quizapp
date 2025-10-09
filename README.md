# TDT4250 – Assignment 2: Quiz Application Ecore Model

## Overview
This repository contains the Ecore-based domain model for a configurable **Quiz Application**.  
The goal of the assignment is to model and implement one key variability aspect of the system:  
the distinction between **Guest Users** and **Logged-In Users**.

This variability determines which features are available to each type of user.  
Guest users can only attempt existing quizzes, while logged-in users can create, comment on, and manage their own quizzes.

The metamodel represents this variability at the domain level and supports configuration of different product variants within a software product line (SPL).

---

## Repository Structure

├── no.ntnu.tdt4250.spl/ # Model project (Ecore, generated Java code, constraints, derived features)
│ ├── model/ # Ecore, genmodel definitions, example instance
│ ├── src-gen/ # Automatically generated EMF code
│ ├── test/ # JUnit tests for constraints and derived features
│ ├── META-INF/ # Plugin metadata
│   └── MANIFEST.MF
│ └── build.properties, plugin.properties, plugin.xml
│
├── no.ntnu.tdt4250.spl.edit/ # Edit plugin
├── no.ntnu.tdt4250.spl.editor/ # Editor plugin
├── no.ntnu.tdt4250.spl.example # Example instances of the Ecore model
│
├── README.md # Project description and instructions
└──  quizapp-ecore-diagram.jpg # Ecore class diagram


---

## Domain Description
The **Quiz Application** domain supports the creation, participation, and interaction around quizzes.  
The main entities are:

- **QuizApp** – the root container of the application that holds all users, quizzes, and comments.  
- **User (abstract)** – represents a general user of the system.
  - **GuestUser** – can only attempt quizzes created by others.
  - **LoggedInUser** – can create quizzes, comment, and track activity.
- **Quiz** – created by a logged-in user, can be attempted by users, and can have comments.
- **Comment** – written by a logged-in user and linked to a specific quiz.

This structure models the **variability point** between guest and logged-in users and allows both use modes to coexist within one configurable SPL product.

---

## Ecore Model Diagram
The following image shows the structure of the Ecore metamodel:

![QuizApp Ecore Diagram](quizapp-ecore-diagram.jpg)

---

## Key Features

### Derived Feature
**`QuizApp.totalQuizzes`**  
A derived integer property that computes the total number of `Quiz` elements contained in the application.  
This value is automatically updated based on the model contents.

### Constraint
**`commentAuthorMustHaveCompletedQuizToComment`**  
A cross-class constraint that ensures a user can only comment on a quiz that they have already attempted.  
This is implemented in Java using an overridden validation method in `SplValidator.java`.

---

## Example Instances
Representative model instances are provided in the `no.ntnu.tdt4250.spl.example` folder.  
The `.spl` file represents a valid configuration of the metamodel, illustrating different combinations of user types and quiz data.

Example:  
- `SecondQuizApplication.spl` – an instance including both a guest and a logged-in user interacting with quizzes.

---

## Running and Testing

### Importing the Projects
1. Clone or download the repository.
2. In **Eclipse Modeling Tools**, select:  
   **File → Import → Existing Projects into Workspace → Select root directory → Choose the repository folder.**
3. Ensure all three plugin projects (`.spl`, `.edit`, `.editor`) are imported.

### Configuring Java Version
The project requires **Java 17**.  
To configure this in Eclipse:
1. Right-click the project → **Properties → Java Compiler**
2. Enable **Project Specific Settings**
3. Set **Compiler compliance level: 17**

Alternatively, ensure that the workspace JRE is set to a Java 17 JDK under:  
**Window → Preferences → Java → Installed JREs**

### Generating the Code
If regeneration is needed:
1. Open `spl.genmodel` from the `model` folder.
2. Right-click the root element → **Generate All**.

### Running the EMF Editor
1. Right-click the editor project → **Run As → Eclipse Application**.
2. In the runtime workspace, create a new model instance using the generated model wizard.

### Running the Tests
The unit tests for the constraint and derived feature are located in: `no.ntnu.tdt4250.spl/test/no/ntnu/tdt4250/spl/tests/QuizAppValidationTest.java`


To execute:
- Right-click the file → **Run As → JUnit Test**

Expected results:
- The constraint should produce an error when a user comments without attempting a quiz.
- The derived feature should return the total number of quizzes in the app.

---

## Implementation Notes
- All custom logic is implemented using the `@generated NOT` annotation within the generated model classes.  
- The model and plugins were generated using **Eclipse Modeling Tools**.
- The project is designed to compile and run on **JavaSE-17**.
- Opposite references (e.g., between `Quiz.attemptedBy` and `User.attemptedQuizzes`) are set to maintain bidirectional consistency.
- Non-null attributes such as `createdDate` and `timestamp` are required to satisfy EMF validation.

---

## References
- TDT4250 - Assignment 1 Report

---

## Author
**Emil Johnsen**  
NTNU – TDT4250 Model-Driven Software Engineering
Autumn 2025

