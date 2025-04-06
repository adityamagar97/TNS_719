
Feature: Register new user
 
Scenario: Create a new user on register page
    Given register page should open
    When  user enter name 
    And user enter mobile no
    And user enter email id
    And user enter password
    Then user should be registered
    And click on alert


