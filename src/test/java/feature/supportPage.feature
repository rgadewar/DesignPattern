@Regression
Feature: Feature to test HomePage

  Scenario: Check HomePage is loaded successfully

    Given user hits the application url
    When user clicks login
#    When user click on interview Navigation bar
    When user click on Support Navigation bar
    Then support page is shown

