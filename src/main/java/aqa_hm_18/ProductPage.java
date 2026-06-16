package aqa_hm_18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
    private WebDriver driver;

    public ProductPage(WebDriver driver){
        this.driver = driver;
    }

    public String getProductTitle() {
        return driver.findElement(
                By.xpath("//h1[@class='title__main']")).getText();
    }
}
