# ByteCraft
# Test Automation Assessment

## Overview
This project demonstrates a modular approach to test automation using Selenium WebDriver with the Page Object Model (POM) design pattern. It also incorporates ExtentReports for detailed test execution reports.

The project is divided into two main sections:
1. Web GUI Test Automation
2. API Test Automation

## Features
- Modular design with the Page Object Model (POM).
- Organized structure for test cases and classes.
- Automated test execution with TestNG.
- Detailed HTML reports generated using ExtentReports.
- Screenshots attached for GUI test results.
- Supports Maven for dependency management and build.

## Project Structure
```
src
 └── test
      └── java
           ├── base
           │    └── BaseTests.java
           ├── pages
           │    ├── GoogleHomePage.java
           │    ├── FileUploadPage.java
           │    ├── DynamicLoadingPage.java
           │    └── HerokuAppHomePage.java
           └── testcases
                ├── FirstTest.java
                ├── SecondTest.java
                └── ThirdTest.java
```

### Components
1. **BaseTests.java**: Contains setup and teardown methods for WebDriver and ExtentReports.
2. **Pages**: Each page is represented as a class with locators and actions.
   - `GoogleHomePage.java`: Encapsulates actions for the Google homepage.
   - `FileUploadPage.java`: Handles file upload functionality on HerokuApp.
   - `DynamicLoadingPage.java`: Manages dynamic loading elements on HerokuApp.
3. **Test Cases**: Each test case is written in its own class for better readability and modularity.
   - `FirstTest.java`: Tests Google search functionality.
   - `SecondTest.java`: Tests file upload functionality.
   - `ThirdTest.java`: Tests dynamic loading functionality.

## Requirements
- Java 8 or later
- Maven
- Selenium WebDriver
- ChromeDriver
- TestNG
- ExtentReports

## Setup Instructions
1. Clone the repository:
   ```bash
   git clone <repository-url>
   ```

2. Navigate to the project directory:
   ```bash
   cd test-automation-assessment
   ```

3. Install dependencies:
   ```bash
   mvn clean install
   ```

4. Update the `chromedriver` path in `BaseTests.java`:
   ```java
   System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
   ```

## How to Execute Tests
1. Run all tests using Maven:
   ```bash
   mvn test
   ```

2. To execute a specific test, configure your `TestNG` XML or run directly from your IDE.

## Test Details
### Web GUI Test Automation
#### First Test
- Navigate to `https://www.google.com/ncr`.
- Search for `selenium webdriver`.
- Verify that the third result contains the text "What is Selenium WebDriver?".

#### Second Test
- Navigate to `https://the-internet.herokuapp.com/`.
- Click on `File Upload`.
- Upload a file and verify successful upload.

#### Third Test
- Navigate to `https://the-internet.herokuapp.com/`.
- Click on `Dynamic Loading` > `Example 2`.
- Start the loading process and verify that "Hello World!" is displayed.

### API Test Automation
#### Test Steps
1. Navigate to `https://alexwohlbruck.github.io/cat-facts/`.
2. Fetch a random cat fact using the relevant API endpoint.
3. Verify that the response `text` is not empty.

## Reporting
- An HTML report (`extent-report.html`) is generated in the project root after test execution.
- The report includes detailed test logs, statuses, and screenshots (for GUI tests).

## Bonus Features
- Externalized test data (if applicable).
- Clear documentation for easy understanding and usage.
- Modular and scalable test design.

## Submission
The project can be submitted as:
1. An archived file (e.g., ZIP) uploaded to a file-sharing service.
2. A GitHub repository for version control and collaboration.

## Author
- [Eslam]

---
Feel free to reach out for further assistance or queries!
