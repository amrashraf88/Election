@Regression
Feature: Verify login Functionality

  Scenario Outline: User could log in with valid email and password
    And user enter valid gmail GM3"<email>"
    And user enter valid password GM3"<password>"
    And user click on login GM3
    And user enter otp3
    And user upload member
    And user accept member

    Examples:
         |email|password|
    |1108806611|it2@gmail.com|
