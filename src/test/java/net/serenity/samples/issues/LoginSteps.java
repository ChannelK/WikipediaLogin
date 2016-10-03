package net.serenity.samples.retries;

import net.thucydides.core.annotations.*;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.junit.Assert;
import java.lang.Thread;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

public class LoginSteps extends ScenarioSteps {
    private MainPage mainPage;
    private LoginPage loginPage;
    
    @Step
    public void opens_login_page(WebDriver driver) {
        this.loginPage = new LoginPage(driver);
        this.loginPage.open();
    }
    
    @Step
    public void should_see_main_page(WebDriver driver) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) { ; }
        assert driver.getCurrentUrl().equals("https://en.wikipedia.org/wiki/Main_Page");
        //getPages().currentPageAt(MainPage.class);
        //assertThat();
    }
    
    @Step
    public void enters_in_credentials(String username,String password) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) { ; }
        this.loginPage.inputInfo(username,password);
        this.loginPage.submitInfo();
    }
    
    @Step
    public void should_see_logged_in_as(WebDriver driver, String username) {
        try {
            WebElement UsernameBar = driver.findElement(By.id("pt-userpage"));
            assert(UsernameBar.getText().equals(username.replace('_',' ')));
        } catch (NoSuchElementException e) {
            assert false;
        }
    }

}