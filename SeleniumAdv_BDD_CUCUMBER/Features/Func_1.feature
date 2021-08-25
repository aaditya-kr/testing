Feature:To test the iTime application
@validDetails
Scenario:to test the login page of iTime with valid details
Given open chrome browser and url of the application
When enter valid username and password
Then Login successfull

@invalidDetails
Scenario:to test the login page of iTime with invalid details
Given open chrome browser and url of the application
When enter invalid username and password
Then Login Unsuccessfull