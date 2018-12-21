Feature: DDT Testing of the Login Functionality of the application with Invalid credentials

Scenario Outline: To test login functionality of the application with invalid credentials

Given A User is on the Login Page
When User enters an invalid "<UserName>"
And enters an invalid "<Password>"
And User clicks on the Sign in button
Then User must not be able to log in to the application


    Examples: 
      | UserName            | Password  | status  |
      | username1@gmail.com | Password1 | Fail    |
      | username2@gmail.com | Password2 | Fail    |