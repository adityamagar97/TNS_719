
Feature: add user 
 

  
  Scenario: adding user to the system
    Given chrome browser should open
    When enter username
    And enter mobileno
    And enter email
    And enter subject
    And select gender 
    And select state
    And enter password
    And press submit
    Then press ok
  

