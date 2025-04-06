Feature: Login Functionality 

Scenario: Validate login page with valid credentials 
Given User should open chrome browser 
When user enter username
And user enter password 
And click on login button 
Then page should navigate to home page 
And close the browser 