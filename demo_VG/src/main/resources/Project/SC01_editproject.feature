@Regression
Feature: Edit Project
  As an admin
  I want to be able to edit a project
  So that I can update its details

 Scenario Outline: Admin edits project
    When admin edit project
    And admin edit title "<name>"
    And admin edit type
    And admin edit investment field
    And admin edit Capital field "<phone>"
    And admin edit Expected revenue field "<job_title>"
    And admin edit request capital field "<password>"
    And admin edit partner field "<bio>"
    And admin edit Details field
    And admin edit Communtiy field
    And admin edit Progress field
    And admin edit Stage field
    And admin submit edited project

   Examples:
     |name|phone|job_title|password|bio|
     |amr  |100|123|123|123|
