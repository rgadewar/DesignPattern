@Regression
Feature: Feature to test HomePage
  Scenario: Check HomePage is loaded successfully

    Given user hits the application url
    Then validate that user is navigated to the HomePage
    Then validate that the user is able to see the start learning link
    Then validate that the user is able to see the text get a free Java course on us
