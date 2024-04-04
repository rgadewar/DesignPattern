@Regression
Feature: Feature to test HomePage

  Scenario: Check HomePage is loaded successfully

    Given user hits the application url
    When user clicks login
    Then validate that the user is able to see courses
