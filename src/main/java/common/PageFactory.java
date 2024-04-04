package common;

import base.DriverFactoryFacade;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.InterviewPage;
import pages.SupportPage;

@Getter
//This class is the implementation of Factory Pattern which renders the page object to the clients
//It is hiding the complexities(Singleton Driver Object and Browser type) involved in constructing the Page objects
public class PageFactory {
    private WebDriver driver ;
    private HomePage homePage;
    private InterviewPage interviewPage;
    private SupportPage supportPage;

    public PageFactory(String browser){
        this.driver =  DriverFactoryFacade.setDriver(browser);
        homePage = new HomePage(driver);
        interviewPage = new InterviewPage(driver);
        supportPage = new SupportPage(driver);
    }

}
