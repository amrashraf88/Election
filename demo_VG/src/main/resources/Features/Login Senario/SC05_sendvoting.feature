@Regression
Feature: Verify login Functionality

  Scenario Outline: User could  in with valid email and password
    When user login to election to vote"<user>"

    Examples:
         |user|
      |1007079831|
      |1056481177|
      |1055668329|
      |1071671836|
      |1039770217|
      |1029282701|
      |1067769669|
      |1006647034|
      |1006647026|
      |1015011701|
      |1052470224|
