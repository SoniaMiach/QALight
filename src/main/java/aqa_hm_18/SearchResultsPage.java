package aqa_hm_18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchResultsPage {
    private WebDriver driver;

    public SearchResultsPage(WebDriver driver){
        this.driver = driver;
    }

    public List<String> getProductNames() {
        List<WebElement> products =
                driver.findElements(By.xpath("//div[@class='list-item__title-container m_b-5']"));
        return products.stream()
                .map(WebElement::getText)
                .toList();
    }

    public void openFirstProduct() {
        List<WebElement> products =
                driver.findElements(By.xpath("//div[@class='list-item__title-container m_b-5']"));
        products.get(0).click();
    }
}
