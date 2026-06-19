package aqa_hm_4;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public void enterSearchKeyWord(String searchKeyWord){
        WebElement inputField = driver.findElement(By.xpath("//input[@id='search-form__input']"));
        inputField.sendKeys(searchKeyWord, Keys.ENTER);
    }
}
