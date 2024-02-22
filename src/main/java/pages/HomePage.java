package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage {
    @FindBy(css = "#SidebarContent > a:nth-child(4)")
    private List<WebElement> linkElements;

    public void clickLink(String linkName) {
        for (WebElement element : linkElements) {
            if (element.getAttribute("href").contains(linkName)) {
                element.click();
                break;
            }
        }
    }
}