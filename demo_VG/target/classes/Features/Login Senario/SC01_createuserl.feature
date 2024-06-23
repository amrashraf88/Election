@Regression
Feature: Verify login Functionality

  Scenario Outline: User could log in with valid email and password
    And user open login form
    And user enter valid email GM"<email>"
    And user enter valid password GM"<password>"
    And user click on login GM
    And user enter otp
    And user send request
    Examples:
         |email|password|
    |1007079831|it2@gmail.com|
    |1056481177|it2@gmail.com|
    |1003243506|it2@gmail.com|
    |1055668329|it2@gmail.com|
    |1071671836|it2@gmail.com|
    |1039770217|it2@gmail.com|
    |1029282701|it2@gmail.com|
    |1067769669|it2@gmail.com|
    |1006647034|it2@gmail.com|
    |1006647026|it2@gmail.com|
    |1137294201|it2@gmail.com|
    |1091248631|it2@gmail.com|
    |1061250922|it2@gmail.com|
    |1053786198|it2@gmail.com|
    |1108806611|it2@gmail.com|