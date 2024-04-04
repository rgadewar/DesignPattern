@Regression
Feature: Feature to test HomePage

  Scenario: Check HomePage is loaded successfully

    Given user hits the application url
    When user clicks login
    When user click on interview Navigation bar
    Then interview page is shown

