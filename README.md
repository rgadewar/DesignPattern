**AspirationBank**

1. Test Runner is configured to run tests in parallel and can be found here : src/test/java/stepdefs/TestRunner.java
2. Browser can be set in the Configuration class found here - src/main/java/base/Configuration.java
    1. Make sure to provide only the browser that you have in your local system.
    2. To know more in detail learn about WebDriverManager.
3. You can find report at feature level here : target/cucumber-report-html/cucumber-html-reports/feature-overview.html
   A sample report is added in the project folder - Report.pdf

**Download Framework**
https://github.com/skhandelwalIK/AspirationBank

**Writing a test**

The cucumber features goes in the feature library and should have the ".feature" extension.
You can start out by looking at feature/homePage.feature. You can extend this feature or make your own features.

**Running feature :**
Please note : Tests are designed to run in parallel
* Goto project directory.
* Use "mvn test command to run all features in parallel and generate report. You can find report at feature level here : target/cucumber-report-html/cucumber-html-reports/feature-overview.html
* Use "mvn test -Dbrowser=browser_name" to run features on specific browser.
* Use "mvn test -Dcucumber.options="classpath:features/homePage.feature" " to run specific feature.

**Pre-Requisites**
* Install Maven
* Instructions for Mac:
    * Mac using brew: `brew install maven` - if M1 processor: `arch -arm64 brew install maven`