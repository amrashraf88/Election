@Regression
Feature: Verify login Functionality

  Scenario Outline: User could log in with valid email and password
    And user enter valid gmail GM4"<email>"
    And user enter valid password GM4"<password>"
    And user click on login GM4
    And user enter otp4
    And user upload member4
    And user accept member4"<morash>"
    And user accept member5
    And user accept member6
    And user accept member7
    And user accept member8
    And user accept member9
   And user accept president


    Examples:
         |email|password|morash|
         |1108806611|it2@gmail.com|1007079831|
