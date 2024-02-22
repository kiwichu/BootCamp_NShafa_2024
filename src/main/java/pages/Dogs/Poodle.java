package pages.Dogs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Poodle {

    WebDriver driver;
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[3]/td[1]/a")
    private List<WebElement> PoodleLink;
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a")
    WebElement AddtoCart;

    public void clickPoodlePage(String dogPoodle) {
        for (WebElement element : PoodleLink) {
            if (element.getText().equalsIgnoreCase(dogPoodle)) {
                element.click();
                break;

            }
        }
    }


        public Poodle clickAddtoCart() {
            AddtoCart.click();
            return PageFactory.initElements(driver, Poodle.class);


        }
    }




