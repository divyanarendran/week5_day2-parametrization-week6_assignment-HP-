Feature: Login functionality of leaftaps application

@smoke @sanity
Scenario Outline: TC001 Test login with valid credentials
And enter the username as <username>
And enter the password as <password>
When click login button
Then Homepage should be displayed  
Examples:
|username|password|
|DemoCSR|crmsfa|

@regression
Scenario: TC002 Test login with invalid credentials

And enter the username as Demosalesmanager
And enter the password as crmsfa
When click login button
But Error message    
