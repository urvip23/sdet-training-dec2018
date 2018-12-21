Feature: To Test the Login Functionality

Background: the user has browser invoked
Given the user is on landing page
When User clicks on the login button
Then User is navigated to login page

Scenario: To test login functionality of the application with valid credentials
Given User types UserName
And Usertypes Password
When User clicks on the submit button
Then User must log in successfully

Scenario: To test login functionality of the application with invalid credentials
Given User types invalidUserName
And Usertypes invalidPassword
When User clicks on the submit button
Then User must log in successfully