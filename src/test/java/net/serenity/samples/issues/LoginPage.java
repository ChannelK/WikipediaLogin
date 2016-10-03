package net.serenity.samples.retries;

import com.google.common.base.Function;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.By;

@DefaultUrl("https://en.wikipedia.org/w/index.php?title=Special:UserLogin&returnto=")
public class LoginPage extends PageObject {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    //@FindBy(id = "wpName1")
    WebElement wpName1;
    //@FindBy(id = "wpPassword1")
    WebElement wpPassword1;
    
    //@FindBy(css = "button[value='Log in']")
    WebElement loginButton;
    
    public void inputInfo(String username,String password) {
        wpName1 = getDriver().findElement(By.id("wpName1"));
        wpPassword1 = getDriver().findElement(By.id("wpPassword1"));
        wpName1.sendKeys(username);
        wpPassword1.sendKeys(password);
    }
    
    public void submitInfo() {
        loginButton = getDriver().findElement(By.id("wpLoginAttempt"));
        loginButton.click();
    }
}