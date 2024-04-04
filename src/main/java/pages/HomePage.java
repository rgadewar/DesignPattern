package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ConfigReader;

public class HomePage {
    private WebDriver driver;
    private WebDriverWait wait;
    public ConfigReader config = new ConfigReader();

    public String username = config.getUsername();
    public String password = config.getPassword();

    private By SpendAndSave = By.partialLinkText("Spend & Save");
    private By signButton = By.xpath("//a[@href='/login']");
    private By homepageText = By.xpath("//h1[contains(text(),'Featured Courses')]");
    private By aspirationCardAndText = By.xpath("//a[@href='https://www.letskodeit.com/courses/test-automation-bundle?coupon=TABFROMHOME']");
    private By aspirationPlusCardAndText = By.xpath("//span[text()='Get a free Java course on us']");

    private By loginFormText = By.xpath("//input[@type='email' and @id='email']");

    private By afterloginText = By.xpath("//h1[normalize-space()='My Courses']");
    private By aspirationCard = By.xpath("(//DIV[@overflow='auto'])[2]");
    private By aspirationPlusCard = By.xpath("//DIV[@id='price-card-3']");
    private By emailInputBox = By.xpath("(//INPUT[@novalidate=''])[3]");
    private By emailModel = By.xpath("//button[@class='Element-sc-1dc3ws0-0 Button-sc-19upfmc-0 hkwWRs syXgE button null']//*[name()='svg']");


    public HomePage(WebDriver driver) {
        this.driver=driver;
    }

    public String getHomePageTitle(){
        return driver.getTitle();
    }

    public void clicklogin() {
        wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(SpendAndSave));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",driver.findElement(SpendAndSave));
        wait.until(ExpectedConditions.elementToBeClickable(SpendAndSave));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(SpendAndSave));
    }



    public void clickSpendAndSave() {
        wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(SpendAndSave));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",driver.findElement(SpendAndSave));
        wait.until(ExpectedConditions.elementToBeClickable(SpendAndSave));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(SpendAndSave));
    }

    public boolean homepageTextIsDisplayed() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(homepageText));
        return driver.findElement(homepageText).isDisplayed() && driver.findElement(SpendAndSave).isDisplayed();
    }
    public boolean homepageAspirationTextIsDisplayed() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(aspirationCardAndText));
        return driver.findElement(aspirationCardAndText).isDisplayed() ;
    }

    public boolean homepageAspirationPlusTextIsDisplayed() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(aspirationPlusCardAndText));
        return driver.findElement(aspirationPlusCardAndText).isDisplayed();
    }

    public boolean loginFormDisplayed() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(loginFormText));
        return driver.findElement(loginFormText).isDisplayed();
    }

    public boolean coursesDisplayed() {
wait.until(ExpectedConditions.visibilityOfElementLocated(afterloginText));
            return driver.findElement(afterloginText).isDisplayed();
    }



    public void clickAspirationCard() {
        driver.findElement(aspirationCard).click();
    }

    public void clickSignIn() {
        driver.findElement(signButton).click();


    }

    public void clicklogIn() {
        try {
            // Click on sign in button
            driver.findElement(signButton).click();

            // Enter email
            driver.findElement(By.id("email")).sendKeys(username);

            // Wait for password input field to be visible
            WebDriverWait wait = new WebDriverWait(driver, 10); // Adjust the timeout as needed
            WebElement passwordInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login-password")));

            // Send password
            passwordInput.sendKeys(password);

            // Click login button
            driver.findElement(By.id("login")).click();
        } catch (NoSuchElementException e) {
            System.err.println("One or more elements not found: " + e.getMessage());
        } catch (TimeoutException e) {
            System.err.println("Timeout while waiting for password input field: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }


    public void clickInteviewNavigationBar() {
        driver.findElement(By.cssSelector("li[data-id='579451'] > a.dynamic-link")).click();

    }


    public void clickSupportNavigationBar() {
        driver.findElement(By.cssSelector("li[data-id='41190'] > a.dynamic-link")).click();

    }

    public void clickAspirationPlusCard() {
        driver.findElement(aspirationPlusCard).click();
    }

    public void clickToCloseEmailModel() {
        driver.findElement(emailModel).click();
    }
    public boolean checkVisibilityOfEmail() {
       return driver.findElement(emailInputBox).isDisplayed();
    }

}
