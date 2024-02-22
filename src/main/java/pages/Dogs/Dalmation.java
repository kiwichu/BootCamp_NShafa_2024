package pages.Dogs;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Dalmation {

    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[4]/td[1]/a")
    private List<WebElement> DalmationLink;

    @FindBy(xpath = "//*[@id=\"BackLink\"]/a")
    private List<WebElement> returnLink;

    public void clickDalamationPage(String dogDalmation) {
        for (WebElement element : DalmationLink) {
            if (element.getText().equalsIgnoreCase(dogDalmation)) {
                element.click();
                break;

            }


        }
                }
            }

