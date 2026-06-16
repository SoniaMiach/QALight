package aqa_hm_18;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public void clickOnLoginMenu(){
        WebElement loginButton = driver.findElement(By.xpath("//div[@class='user-button__image flex middle-xs center-xs']"));
        loginButton.click();
    }

    public void enterSearchKeyWord(String searchWord) {
        WebElement searchInput = driver.findElement(By.xpath("//div[@class='search__autosuggest autosuggest']"));

        searchInput.sendKeys(searchWord, Keys.ENTER);
    }
}
