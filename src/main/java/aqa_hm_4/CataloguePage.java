package aqa_hm_4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class CataloguePage {

    private WebDriver driver;

    public CataloguePage(WebDriver driver){
        this.driver = driver;
    }

    public List<String> getProductNames() {
        List<WebElement> productNameElements = driver.findElements(
                By.xpath(" //a[@class='product-card__title']"));
        return productNameElements.stream()
                .map(WebElement::getText)
                .toList();
    }

    public void addToCompare(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        WebElement compareButton = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("(//button[@aria-label='Додати до порівняння'])[1]")
                ));
        compareButton.click();
    }

    public String getCompareName(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        WebElement compareName =  wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='compare-item__name']")));
        return compareName.getText();
    }

    public String getEmptyStateMessage(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        WebElement emptyState =  wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='v-catalog__empty']")));
        return emptyState.getText();
    }
}
