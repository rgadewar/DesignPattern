package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SupportPage {
    private WebDriver driver;
    private WebDriverWait wait;

    // Constructor for InterviewPage class
    public SupportPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10); // Adjust the timeout as needed
    }
    private By supportpageText = By.xpath("//h4[@class='dynamic-heading' and contains(text(), 'Get in touch')]");

    public boolean checkVisibilityGetInTouchText() {
        WebDriverWait wait = new WebDriverWait(driver, 10); // Adjust the timeout as needed

        // Wait for the page to fully load
        wait.until(webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));

        // Wait for the visibility of the interview help text
        wait.until(ExpectedConditions.visibilityOfElementLocated(supportpageText));

        return driver.findElement(supportpageText).isDisplayed();
    }
}
