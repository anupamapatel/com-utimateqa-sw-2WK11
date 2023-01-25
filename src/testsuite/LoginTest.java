package testsuite;

import browserfactory.BaseTest;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.junit.Assert;



public class LoginTest extends BaseTest {
        String baseurl = "https://courses.ultimateqa.com/";

        @Before
        public void setup() {
            openBrowser(baseurl);
        }

        @Test
        public void userSholdLoginSuccessfullyWithValid() {
            WebElement Signinbutton = driver.findElement(By.xpath("//li[@class='header__nav-item header__nav-sign-in']"));
            Signinbutton.click();
            WebElement emailField = driver.findElement(By.xpath("//input[@id='user[email]']"));
            emailField.sendKeys("anupama.parel@gmail.com");
            WebElement PasswordField = driver.findElement(By.xpath("//input[@id='user[password]']"));
            PasswordField.sendKeys("12345");
            WebElement Signin = driver.findElement(By.xpath("//button[@type='submit']"));
            Signin.click();









        }
    }
