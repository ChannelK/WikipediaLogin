package net.serenity.samples.retries;

import com.google.common.base.Function;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://en.wikipedia.org/wiki/Main_Page")
public class MainPage extends PageObject {
    
    public MainPage(WebDriver driver) {
        super(driver);
    }
    
    @FindBy(id="pt-anonuserpage")
    WebElement anon_tab;

    @FindBy(id="pt-userpage")
    WebElement user_tab;
    
    public String getUsername() {
        if(user_tab.isDisplayed())
            return user_tab.getText();
        else
            return "";
    }
}