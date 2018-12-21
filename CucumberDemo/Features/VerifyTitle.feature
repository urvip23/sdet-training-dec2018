Feature: Verify the Title of our web application
	As Acceptance tests we want to verify the title of our Home Page
 

Scenario: Verify the Title of the Home Page
	Given User is on the landing page
	When User checks the title
	Then It must say "Facebook - Log In or Sign Up"