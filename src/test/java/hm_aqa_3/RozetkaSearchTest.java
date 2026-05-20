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

public class RozetkaSearchTest {
    public static void main(String[] args) {
        String searchWord = "Samsung";
        WebDriver driver = new ChromeDriver();
        WebDriverWait waiter = new WebDriverWait(driver, Duration.ofSeconds(25));

        try{
            driver.get("https://rozetka.com.ua/");
            driver.manage().window();

            WebElement inputField = driver.findElement(By.xpath("//input[@data-testid='search-suggest-input']"));
            waiter.until(ExpectedConditions.elementToBeClickable(inputField));
            inputField.sendKeys(searchWord + Keys.ENTER);

            WebElement firstProduct = waiter.until(
                    ExpectedConditions.visibilityOfElementLocated(
                            By.xpath("(//a[@class='tile-image-host'])[1]")
                    )
            );
            firstProduct.click();

            WebElement textTitle = waiter.until(
                    ExpectedConditions.visibilityOfElementLocated(
                            By.xpath("//h1[@class='title__font']")
                    )
            );
            String inputText = textTitle.getText();

            Assert.assertTrue(inputText.contains(searchWord));

        }finally {
            driver.quit();
        }
    }
}
