package aqa_hm_18;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void enterEmailValue(String userEmail){
        WebElement inputField = driver.findElement(By.xpath("//input[@inputmode='email']"));
        inputField.sendKeys(userEmail);
    }

    public boolean isEmailFieldDisplayed() {
        return driver.findElement(
                By.xpath("//input[@inputmode='email']")
        ).isDisplayed();
    }

    public void enterPasswordValue(String userPassword){
        WebElement inputField = driver.findElement(By.xpath("//input[@type='password']"));
        inputField.sendKeys(userPassword, Keys.ENTER);
    }
    public boolean isPasswordFieldDisplayed() {
        return driver.findElement(
                By.xpath("//input@type='password']")
        ).isDisplayed();
    }
}
