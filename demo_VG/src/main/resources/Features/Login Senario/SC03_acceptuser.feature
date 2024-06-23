@Regression
Feature: Verify login Functionality

  Scenario Outline: User could log in with valid email and password
    And user enter valid gmail GM2"<email>"
    And user enter valid password GM2"<password>"
    And user click on login GM2
    And user enter otp2
    And user accept member 1
    And user accept member 2
    And user accept member 3
    And user accept member 4
    And user accept member 5
    And user accept member 6
    And user accept member 7
    And user accept member 8
    And user accept member 9
    And user accept member 10

    Examples:
      |email     |password     |
      |1028331781|it2@gmail.com|
