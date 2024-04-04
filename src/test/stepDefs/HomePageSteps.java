package stepDefs;

import base.Configuration;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.HomePage;
import pages.InterviewPage;
import pages.SupportPage;

public class HomePageSteps extends Configuration {
    Scenario logger ;
    WebDriver driver = pageLib.getDriver();
    HomePage homePage = pageLib.getHomePage();
    InterviewPage intPage = pageLib.getInterviewPage();
    SupportPage supportPage = pageLib.getSupportPage();


    @Before
    public void beforeStep(Scenario scenario) {
        this.logger = scenario;
    }

    @Given("user hits the application url")
    public void user_is_on_the_homepage_by_hitting_the_url() {
        logger.log("Testing Home Page");
        setDriverProperties(driver);
        logger.log("Url hit successful");
    }

    @Then("validate that user is navigated to the HomePage")
    public void user_is_navigated_to_the_home_page() {
        try{
            logger.log("On the Home Page Validating Title");
            Assert.assertEquals(homePage.getHomePageTitle(),"Home Page");
            boolean display = homePage.homepageTextIsDisplayed();
            Assert.assertTrue(display);
        } catch (Exception e){
            e.getStackTrace();
        }
    }

    @Then("validate that the user is able to see the start learning link")
    public void validate_that_the_user_is_able_to_see_the_start_learning_link() {
        try{
            logger.log("On the Home Page Validating Aspiration Bank Card text");
            boolean display = homePage.homepageAspirationTextIsDisplayed();
            Assert.assertTrue(display);
        } catch (Exception e){
            e.getStackTrace();
        }
    }
    @Then("validate that the user is able to see the text get a free Java course on us")
    public void validate_that_the_user_is_able_to_see_the_text_get_a_free_Java_course_on_us() {
        try{
            logger.log("On the Home Page Validating Aspiration Plus Bank Card text");
            boolean display = homePage.homepageAspirationPlusTextIsDisplayed();
            Assert.assertTrue(display);
        } catch (Exception e){
            e.getStackTrace();
        }
    }
    @Then("validate that the user is able to see login form")
    public void validate_that_the_user_is_able_to_see_login_form() {
        try{
            logger.log("When user clicked sign in, login form shown");
            boolean display = homePage.loginFormDisplayed();
            Assert.assertTrue(display);
        } catch (Exception e){
            e.getStackTrace();
        }
    }
   @Then("validate that the user is able to see courses")
    public void validate_that_the_user_is_able_to_see_courses() {
        try {
            // Wait until the page is loaded completely
            waitUntilPageLoaded();


            // Validate that the user is able to see courses
            logger.log("When user clicked login in, courses shown");
            boolean display = homePage.coursesDisplayed();
            Assert.assertTrue(display);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void waitUntilPageLoaded() {
        WebDriverWait wait = new WebDriverWait(driver, 30); // Adjust the timeout as needed
        wait.until(driver -> ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete"));
    }

    @Then("validate that the user is able to login to app")
    public void validate_that_the_user_is_able_to_login_to_app() {
        try{
            logger.log("When user clicked sign in, login form shown");
            boolean display = homePage.loginFormDisplayed();
            Assert.assertTrue(display);
        } catch (Exception e){
            e.getStackTrace();
        }
    }

    @When("user clicks Aspiration card")
    public void user_clicks_aspiration_card() {
        homePage.clickAspirationCard();
        logger.log("Tested Aspiration modal");
    }

    @When("user clicks Aspiration plus card")
    public void user_clicks_aspiration_plus_card() {
        homePage.clickAspirationPlusCard();
        logger.log("Tested Aspiration Plus modal card");
    }

    @Then("validate that user is able to see the modal for an email address to sign up")
    public void validate_that_user_is_able_to_see_the_modal_for_an_email_address_to_sign_up() {
        try{
            logger.log("Validating that user is able to see the modal for an email address to sign up");
            boolean display = homePage.checkVisibilityOfEmail();;
            Assert.assertTrue(display);
            logger.log("Home Page Validated Successfully");
        } catch (Exception e){
            e.getStackTrace();
        }
        homePage.clickToCloseEmailModel();
    }

    @When("user clicks Spend&Save link")
    public void user_clicks_spend_save_link() {
        homePage.clickSpendAndSave();
    }

    @When("user clicks signIn card")
    public void user_clicks_signIn_card() {
        homePage.clickSignIn();
        logger.log("Tested Aspiration modal");
    }

    @When("user clicks login")
    public void user_clicks_login() {
//        homePage.clickSignIn();
        homePage.clicklogIn();
        WebDriverWait wait = new WebDriverWait(driver, 10);

        logger.log("Tested Aspiration modal");
    }

    @When("user click on interview Navigation bar")
    public void user_click_on_interview_Navigation_bar() {
//        homePage.clickSignIn();
        homePage.clickInteviewNavigationBar();

        logger.log("Tested Aspiration modal");
    }

    @Then("interview page is shown")
    public void interview_page_is_shown() {
        try{
            logger.log("Validating that user is able to see the modal for an email address to sign up");
            boolean display = intPage.checkVisibilityOfInterviewHelpText();
            Assert.assertTrue(display);
            logger.log("Home Page Validated Successfully");
        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    @When("user click on Support Navigation bar")
    public void user_click_on_Support_Navigation_bar() {
//        homePage.clickSignIn();
        homePage.clickSupportNavigationBar();

        logger.log("Tested Aspiration modal");
    }

    @Then("support page is shown")
    public void support_page_is_shown() {
        try{
            logger.log("Validating that user is able to see the modal for an email address to sign up");
            boolean display = supportPage.checkVisibilityGetInTouchText();
            Assert.assertTrue(display);
            logger.log("Home Page Validated Successfully");
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
