#Author: Akash R
Feature: User login

 Scenario: user needs to login Succefully  
 Given User is in the iconnection login page
 When the user needs to enter the credentials to respective fields(USN: "akashr+11@engineersmind.com", PWD: "Password`1234")
 And the user needs to enter OTP
 And user needs to click on continue button
 Then user is re-directed to InvestorPortal page
 And user needs to logout
