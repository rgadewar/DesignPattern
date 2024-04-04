package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ConfigReader;

public class InterviewPage {
    private WebDriver driver;
    private WebDriverWait wait;

    // Constructor for InterviewPage class
    public InterviewPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10); // Adjust the timeout as needed
    }

    private By interviewpageText = By.xpath("//h1[@class='margin-top-10 margin-bottom-10 dynamic-heading' and @data-uniqid='1687124966592' and text()='Interview Help']");


    public boolean checkVisibilityOfInterviewHelpText() {
        WebDriverWait wait = new WebDriverWait(driver, 10); // Adjust the timeout as needed

        // Wait for the page to fully load
        wait.until(webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));

        // Wait for the visibility of the interview help text
        wait.until(ExpectedConditions.visibilityOfElementLocated(interviewpageText));

        return driver.findElement(interviewpageText).isDisplayed();
    }

}
