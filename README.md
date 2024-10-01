

<h1 align="center">QKart Application-HybridFramework Project</h1>

<h2 align="center">Introduction to Selenium Hybrid Project for "QKart" Demo Site.</h2>

Overview
------------
The **QKart Hybrid Framework** is designed for automated testing of web applications, particularly for the **QKart e-commerce platform**. It combines the strengths of both the Data-Driven and Keyword-Driven frameworks, allowing for flexible and efficient test case management.

Objectives
------------

- To create a scalable and maintainable test automation framework.
- To enable easy integration of various testing strategies (data-driven and keyword-driven).
- To enhance test execution speed and accuracy while reducing manual effort.
- To provide detailed reports for test execution results.

Tools and Technologies
-----------------------
- **Java:** The primary programming language used for writing test scripts.

- **Selenium WebDriver:** A browser automation tool that enables interaction with the web application's user interface. It supports multiple browsers and provides a robust framework for automating web application tests.
  
- **TestNG:** For test management, including annotations, assertions, and reporting.
  
- **Maven:** Build automation tools that manage project dependencies and build processes.
  
- **Gherkin:** The language used by Cucumber to write test scenarios in a Given-When-Then format.
  
- **Apache POI:** For reading/writing data from Excel files.

- **Log4j:** For logging and monitoring test execution.
  
- **GitHub:** For version control.


Project Structure
------------------

<img width="570" alt="Screenshot 2024-10-01 at 11 13 41 PM" src="https://github.com/user-attachments/assets/ca6cc17c-6535-4e2b-9637-27e3853c9dee">


Example Scenarios
------------------

**User Login :** 

- **Valid Credentials:** Test logging in with valid credentials and verify that the user is redirected to the appropriate page, such as the dashboard or homepage.

- **Invalid Credentials:** Test logging in with incorrect credentials to ensure that the system displays an appropriate error message and does not grant access.

- **Empty Fields:** Ensure that the system handles cases where the login form is submitted with empty fields.


**User Registration:** 

- **Successful Registration:** Test registering a new user with valid details and confirm that the user receives a confirmation message and can log in using the new credentials.

- **Duplicate Registration:** Verify that the system handles attempts to register with an email address that is already in use.

- **Invalid Input:** Ensure that the system validates user input correctly, such as requiring a valid email format and strong password requirements.


**Search Product:** 

- **Search Valid Product:** Validate that the search functionality returns the correct product(s) when a valid product name is entered. The product(s) returned should match the search query precisely.

- **Search Invalid Product:** Validate that the search functionality returns the appropriate warning message to the user when an invalid product name is entered.

- **Search Invalid Product:** Validate that the search functionality displays an appropriate error message or prompt to the user, preventing the search action from being executed.

Benefits
---------

- **Scalability:** The hybrid approach allows for easy expansion of test cases without significant rework.

- **Maintainability:** Clear separation of test logic and test data makes the framework easier to maintain.
  
- **Flexibility:** Supports both data-driven and keyword-driven testing, making it adaptable to various testing needs.
  
- **Efficient Reporting:** TestNG provides detailed reports that help in quickly identifying failures and their causes.
  
Questions / Contact / Contribute
---------------------------------
Feel free to fork this repo, add to it, and create a pull request if you like to contribute.  

If you have any questions, you can contact me via email: `thorata89@gmail.com`




