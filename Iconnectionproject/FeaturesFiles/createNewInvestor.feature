#Author: Akash R
Feature: Create new Investor

  Scenario: Create a new investor succefully
    Given User is in Investors table page
    And user needs to click on Add investor button
    When user navigate to Investor KYC screen
    And user needs to input all the data to respected fields
    And user needs to click continue button
    Then user navigate to wiring details screen
    And user click on cancel button
    And user click on leavepage button
    And User back to Investors table page
    
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
