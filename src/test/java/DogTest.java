import browser.Browser;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.DogPage;
import pages.Dogs.Dalmation;
import pages.Dogs.Poodle;

public class DogTest {

    @Test
    public void clickOnPoodles() {

        Browser browser = new Browser();
        browser.openBrowser().clickLink("DOG");
        PageFactory.initElements(browser.getDriver(), Poodle.class)
                .clickPoodlePage("K9-PO-02");
                .clickAddtoCart(){

        }


    @Test
    public void clickOnDalmation(){
        Browser browser = new Browser();
        browser.openBrowser().clickLink("DOG");
        PageFactory.initElements(browser.getDriver(), Dalmation.class)
                .clickDalamationPage("K9-DL-01");
    }
    }


