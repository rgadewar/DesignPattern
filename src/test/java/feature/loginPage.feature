@Regression
Feature: Feature to test HomePage

  Scenario: Check HomePage is loaded successfully

    Given user hits the application url
    When user clicks signIn card
    Then validate that the user is able to see login form
