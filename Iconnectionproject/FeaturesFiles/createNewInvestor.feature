#Author: Akash R
Feature: Create new Investor

  Scenario: Create a new investor succefully
    Given User needs to navigate to Investors table page
    And user needs to enter the inputs(User: "akashr+11@engineersmind.com", Pass: "Password`1234")
    When user needs to click on Add investor button
    And user navigate to Investor KYC screen
    And user needs to input all the data to respected fields
    And user needs to click continue button
    Then user navigate to wiring details screen
    And user click on cancel button
    And user click on leavepage button
    And User back to Investors table page
    And user needs to logout from the application
    
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
