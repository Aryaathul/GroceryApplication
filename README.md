# 🛒 Grocery Application Automation Testing Framework

A Selenium Automation Testing Framework developed for a Grocery Management Application to automate  functional testing using
**Java**
**Selenium WebDriver**
**TestNG**

The framework follows the **Page Object Model (POM)** design pattern to ensure code reusability, maintainability, and scalability. It supports parallel execution, cross-browser testing, reporting, screenshot capture, and continuous integration with Jenkins.

## 🚀 Technologies Used

- Java
- Selenium WebDriver
- TestNG
- Maven
- Page Object Model (POM)
- Jenkins
- Git & GitHub
- Extent Reports

## Framework Features

 Page Object Model (POM) architecture
✔ Functional end-to-end automation
✔ Cross-browser testing
✔ Parallel test execution using TestNG
✔ Test grouping with TestNG
✔ Maven dependency management
✔ Jenkins integration for automated execution
✔ Extent HTML Reports
✔ Automatic screenshot capture for failed test cases
✔ Excel utility for test data handling
✔ Configurable framework using `config.properties`
✔ Reusable utility classes for waits, screenshots, reporting, and random data generation

## Project Structure

```text
GroceryApplication
│
├── src
│   ├── main
│   │   ├── java
│   │   │   ├── constant
│   │   │   ├── pages
│   │   │   │   ├── LoginPage.java
│   │   │   │   ├── HomePage.java
│   │   │   │   ├── AdminUsersPage.java
│   │   │   │   ├── ManageContactPage.java
│   │   │   │   ├── ManageDeliveryBoyPage.java
│   │   │   │   └── ManageNewsPage.java
│   │   │   └── utility
│   │   │       ├── ExcelUtility.java
│   │   │       ├── ExtentReportUtility.java
│   │   │       ├── PageUtility.java
│   │   │       ├── RandomDataUtility.java
│   │   │       ├── ScreenshotUtility.java
│   │   │       └── WaitUtility.java
│   │   └── resources
│   │       └── config.properties
│   │
│   └── test
│       ├── java
│       │   ├── project
│       │   ├── reportGeneration
│       │   ├── retry
│       │   └── testscripts
│       │       ├── LoginTest.java
│       │       ├── HomeTest.java
│       │       ├── AdminUsersTest.java
│       │       ├── ManageContactTest.java
│       │       ├── ManageDeliveryBoyTest.java
│       │       └── ManageNewsTest.java
│       └── resources
│
├── OutputScreenShot
├── extent-reports
├── test-output
├── pom.xml
├── testng.xml
├── parallel.xml
├── crossbrowser.xml
├── multibrowser.xml
└── grouping.xml
```

## Automated Test Modules

- Login
- Home
- Admin Users
- Manage Contacts
- Manage Delivery Boy
- Manage News

### How to run the project
1. Clone the repository:
git clone https://github.com/Aryaathul/GroceryApplication
2. Install Maven dependencies
3. Run the TestNG test suite

## Test Execution
The test cases can be executed:

* Locally using TestNG
* Through Jenkins for automated execution

## Skills Demonstrated

- Selenium WebDriver
- Java
- TestNG
- Maven
- Page Object Model (POM)
- Automation Framework Development
- Cross-Browser Testing
- Parallel Execution
- TestNG Grouping
- Jenkins
- Git & GitHub
- Extent Reports
- Excel Data Utility
- Reusable Utility Classes

##  Author

**Arya Anilkumar Leena**

- LinkedIn: https://www.linkedin.com/in/aryaathul08/
- GitHub: https://github.com/Aryaathul
