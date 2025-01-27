

# Eldermark Automation Framework

## Project Overview
This project demonstrates an automated testing framework for Eldermark's web application, specifically focusing on the Contact Us functionality. It's designed to showcase best practices in test automation, including the use of Behavior-Driven Development (BDD) with Cucumber, Selenium WebDriver for browser automation, and a robust, maintainable code structure.

## Key Features
- BDD approach using Cucumber for clear, business-readable test scenarios
- Page Object Model (POM) design pattern for improved maintainability
- Thread-safe WebDriver management for potential parallel test execution
- Integration with Faker library for dynamic test data generation
- Configurable browser selection (Chrome, Firefox, Edge, Headless Chrome)
- Detailed reporting capabilities

## Technology Stack
- Java 8+
- Selenium WebDriver
- Cucumber
- JUnit
- Maven
- JavaFaker

## Project Structure
```
EldermarkFramework/
│
├── src/
│   └── test/
│       ├── java/
│       │   └── com/
│       │       └── project/
│       │           ├── pages/
│       │           │   └── ContactUsPage.java
│       │           ├── step_definitions/
│       │           │   └── EldermarkContactUsStepDefinitions.java
│       │           └── utilities/
│       │               └── Driver.java
│       └── resources/
│           └── features/
│               └── contact_us.feature
│
├── configuration.properties
├── pom.xml
└── README.md
```

## Setup Instructions
1. Ensure you have Java JDK 8 or higher installed
2. Install Maven
3. Clone the repository:
   ```
   git clone https://github.com/yourusername/EldermarkFramework.git

4. Navigate to the project directory:
   ```
   cd EldermarkFramework
   ```
5. Install dependencies:
   ```
   mvn clean install
   ```

## Configuration
- Browser selection and other configurations can be modified in `configuration.properties`
- Supported browsers: chrome, firefox, edge, headless-chrome

## Running Tests
Execute tests using Maven:
```
mvn clean test
```

## Key Components

### Driver Class (Driver.java)
- Implements Singleton pattern with ThreadLocal for thread-safe WebDriver management
- Supports multiple browser types
- Configurable through `configuration.properties`

### Page Objects (e.g., ContactUsPage.java)
- Encapsulates page elements and actions
- Improves test maintainability and readability

### Step Definitions (EldermarkContactUsStepDefinitions.java)
- Implements Cucumber step definitions
- Utilizes Page Object Model for interactions
- Incorporates JavaFaker for dynamic test data generation

### Feature Files (contact_us.feature)
- Written in Gherkin syntax
- Describes test scenarios in business-readable language

## Demonstrated Best Practices
1. **BDD Approach**: Enhances collaboration between technical and non-technical team members
2. **Page Object Model**: Improves test maintenance and reusability
3. **Singleton Pattern**: Ensures efficient resource management
4. **Dynamic Data Generation**: Increases test robustness with JavaFaker
5. **Configurable Setup**: Allows easy switching between browsers and environments
6. **Wait Strategies**: Implements explicit waits for improved test reliability

## Potential Enhancements
- Integration with CI/CD pipelines (e.g., Jenkins, GitLab CI)
- Extended reporting with Allure or Extent Reports
- Cross-browser testing capabilities
- API testing integration
- Performance testing considerations

## Challenges Addressed
- Handling dynamic web elements
- Implementing robust wait strategies
- Managing WebDriver instances efficiently
- Creating maintainable and scalable test architecture

## Conclusion
This framework demonstrates a comprehensive approach to web application testing, showcasing skills in test automation, software design patterns, and best practices in quality assurance. It's designed to be scalable, maintainable, and adaptable to various testing needs within the Eldermark application ecosystem.

