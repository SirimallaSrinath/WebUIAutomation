Feature: Orange HRM Application Login and Logout

Scenario: HRM Application Login Logout Functionality
Given launch Browser and enter HRM Application URL
When  enter Username Password and click login
Then  verify Homepage Title
When  click Profile Icon and Logout
And   close the Browser 

