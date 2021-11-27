
Feature: Test the amazon application

//In features file we can give different scenarios using @Sc1 @Sc2 like this 
//@Sc1
Scenario: Test the login page of amazon application
Given Open chrome browser and url of the appln
When  Enter username and password
Then  login success



