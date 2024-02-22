package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DogPage {
    @FindBy(xpath = "//*[@id=\"SidebarContent\"]/a[2]")
    private List<WebElement> dogNameLink;

    public void clickDogPage(String dogName){
        for (WebElement element: dogNameLink) {
            if(element.getText().equalsIgnoreCase(dogName)){
                element.click();
                break;
            }
        }
    }
}
