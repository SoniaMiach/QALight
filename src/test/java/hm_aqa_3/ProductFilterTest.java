package hm_aqa_3;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class ProductFilterTest {
    public static void main(String[] args) {
        String searchWord = "Samsung";
        int minPrice = 20000;
        int maxPrice = 40000;
        WebDriver driver = new ChromeDriver();
        WebDriverWait waiter = new WebDriverWait(driver, Duration.ofSeconds(25));

        try{
            driver.get("https://allo.ua//");
            driver.manage().window();

            WebElement inputField = driver.findElement(By.xpath("//input[@id='search-form__input']"));
            inputField.sendKeys(searchWord + Keys.ENTER);

            WebElement minPriceInputField = driver.findElement(By.xpath("//*[@data-range-filter='price']/input[1]"));
            minPriceInputField.clear();
            minPriceInputField.sendKeys(String.valueOf(minPrice));
            waiter.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//*[@Class='v-catalog loading-block-gif']"),0));

            WebElement maxPriceInputField = waiter.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@data-range-filter='price']/input[2]"))));
            maxPriceInputField.clear();
            maxPriceInputField.sendKeys(String.valueOf(maxPrice));

            List<WebElement> productPrices = driver.findElements(
                    By.xpath("//div[@class='v-pb__cur discount']//span[@class='sum']"));

            for (WebElement priceElement : productPrices) {
                String priceText = priceElement.getText();
                String numericPrice = priceText
                        .replaceAll("[^0-9]", "");

                int actualPrice = Integer.parseInt(numericPrice);
                Assert.assertTrue(
                        "Price out of range: " + actualPrice,
                        actualPrice >= minPrice &&
                                actualPrice <= maxPrice
                );
            }
        }finally {
            {
                driver.quit();
            }
        }
    }
}
