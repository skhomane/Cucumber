@Browser1
Feature: Search text in google page

  Scenario: Search text in google page of chrome
    Given User is on google page of chrome
    When User types "Sachin" in google page
    And Hit enter key or click on search
    Then searched text should match with "Sachin"
    And close the browser

