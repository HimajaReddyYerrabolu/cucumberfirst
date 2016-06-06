#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios 
#<> (placeholder)
#""
## (Comments)

#Sample Feature Definition Template

Feature: kexim login 


Scenario: login with valid user name and password

Given user in Kexim Home page

When user entered valid user name and valid password

And user clicked on login button

Then user get Admin home page with welcome to admin message




Scenario: login with valid user name and invalid password

Given user is in Kexim Home page

When user entered valid username

But user entered invalid password

And user click on login button

Then user get an alert message as invalid username/password 

#Examples:
    #| name  |value | status |
    #| name1 |  5   | success|
    #| name2 |  7   | Fail   |
