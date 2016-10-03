package net.serenity.samples.retries;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.core.annotations.findby.By;
import net.thucydides.core.annotations.Issue;
import net.thucydides.core.annotations.Issues;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import net.thucydides.core.annotations.Managed;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * User: YamStranger
 * Date: 12/3/15
 * Time: 11:01 PM
 */
@RunWith(SerenityRunner.class)
public class CheckLoginTest {

    @Steps
    LoginSteps steps;

    @Managed
    WebDriver driver;
    
    static String CHROME = System.getProperty("user.dir")+"\\chromedriver.exe";
    
    @Test
    public void shouldInstantiateAWebDriverInstanceForAWebTest() {
        System.setProperty("webdriver.chrome.driver", CHROME);
        driver = new ChromeDriver();
        driver.get("http://www.google.com");       
        driver.close();
    }
    
    @Test
    @Title("Test case for login")
    public void log_into_website() {
        System.setProperty("webdriver.chrome.driver", CHROME);
        driver = new ChromeDriver();
        
        // GIVEN
        steps.opens_login_page(driver);

        // WHEN
        steps.enters_in_credentials("Dummy_KCHAN","TESTING8628121710");

        // THEN
        steps.should_see_main_page(driver);
        // AND
        steps.should_see_logged_in_as(driver, "Dummy_KCHAN");
        driver.close();
    }
}
