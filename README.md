# 📚 E-Learning Platform Automation Testing 🖥️

Welcome to the **E-Learning Platform Automation Testing** project! This project automates the testing of an e-learning platform using **Selenium WebDriver**. It is built to showcase a robust automation framework with the ability to perform data-driven, keyword-driven, and parallel testing.

---

## 🌟 Project Overview

This project demonstrates automation testing on an e-learning platform, utilizing:
- **Selenium WebDriver**
- **TestNG**
- **Apache POI**
- **Jenkins** (Continuous Integration)

It automates core functionalities of a typical e-learning platform such as logging in, navigating courses, and validating user interactions.

---

## 🚀 Features and Highlights

| **Feature**                                   | **Description**                                                                                                                                   |
|-----------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------|
| **Framework Architecture**                    | Data-driven, keyword-driven, and Page Object Model (POM) framework with Page Factory.                                                              |
| **Maven Project Structure**                   | Utilizes Maven for project management, with dependencies managed via `pom.xml`.                                                                    |
| **Data-driven Testing**                       | Reads test data from Excel using Apache POI, and executes tests with different data sets using TestNG Data Provider.                               |
| **Screenshots & Reporting**                   | Automatically captures screenshots upon test failure and generates detailed TestNG reports using Listeners.                                         |
| **Parallel Testing**                          | Runs multiple test suites and performs parallel testing using `testng.xml`.                                                                        |
| **Continuous Integration**                    | Integrated with Jenkins for Continuous Integration, ensuring that tests run automatically with every code update.                                   |

---

## 🧱 Detailed Structure and Plan

### 1. 📝 **Introduction to the Project**
   - Overview of **Maven** project structure and dependencies management using `pom.xml`.

### 2. 🏗️ **Automation Framework Architecture**
   - **Data-driven Testing**: Reading from Excel sheets using **Apache POI**.
   - **Keyword-driven Testing**: Creating reusable keyword actions for test cases.

### 3. 🧩 **Page Factory Design Pattern**
   - **Page Object Model (POM)** with Page Factory for creating object repositories, ensuring maintainability and reusability of code.

### 4. 📊 **Data-driven Testing**
   - Running tests with multiple sets of data using **Data Provider** in TestNG.

### 5. 📸 **Screenshot Capture**
   - Automatically captures screenshots upon test failures for easy debugging.

### 6. 📑 **TestNG Reports**
   - Generates detailed reports using **TestNG Listeners** and organizes them by test cases, including success/failure results.

### 7. 🔄 **Parallel Testing**
   - Configuring `testng.xml` to run tests in parallel, increasing test efficiency and speed.

### 8. 🔗 **Version Control and CI**
   - **GitHub Integration**: All project files and test results are stored and tracked via GitHub.
   - **Jenkins Integration**: Automated test execution through Jenkins CI pipelines.

---

## 🛠️ Tools and Technologies Used

| **Tool**                | **Purpose**                                               |
|-------------------------|-----------------------------------------------------------|
| **Selenium WebDriver**   | For automating web browser interactions.                  |
| **TestNG**               | Testing framework for running test cases and generating reports. |
| **Apache POI**           | To read data from Excel files for data-driven testing.     |
| **Maven**                | Dependency management and project build tool.             |
| **Jenkins**              | Continuous integration tool for automating test executions.|
| **GitHub**               | Version control for source code and project files.        |

---

## 📦 Project Structure

```bash
├── src
│   ├── main
│   │   └── java
│   └── test
│       └── java
├── testng.xml
├── pom.xml
└── README.md
