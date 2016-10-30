@Browser2
Feature: Search text in google page

  Scenario: Search text in google page of IE
    Given User is on google page of IE
    When User types "Sachin" in google page
    And Hit enter key or click on search
    Then searched text should match with "Sachin"
    And close the browser

  Scenario: Search text in google page of IE
    Given User is on google page of IE
    When User types "Sachin" in google page
    And Hit enter key or click on search
    Then searched text should match with "Sachin"
    And close the browser
