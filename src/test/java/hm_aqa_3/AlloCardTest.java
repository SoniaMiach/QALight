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

public class AlloCardTest {
    public static void main(String[] args)  {
        String searchWord = "PlayStation 5";
        WebDriver driver = new ChromeDriver();
        WebDriverWait waiter = new WebDriverWait(driver, Duration.ofSeconds(25));

        try{
            driver.get("https://allo.ua//");
            driver.manage().window();

            WebElement inputField = driver.findElement(By.xpath("//input[@id='search-form__input']"));
            waiter.until(ExpectedConditions.elementToBeClickable(inputField));

            inputField.sendKeys(searchWord + Keys.ENTER);

            WebElement firstProduct = waiter.until(
                    ExpectedConditions.visibilityOfElementLocated(
                            By.xpath("(//button[@title='Купити'])[1]")
                    )
            );
            firstProduct.click();

            WebElement textCardTitle = waiter.until(
                    ExpectedConditions.visibilityOfElementLocated(
                            By.xpath("//a[@class='related-products__tile-name']")
                    )
            );
            String inputText = textCardTitle.getText();

            Assert.assertTrue(inputText.contains(searchWord));

            WebElement continueToPursageButton = waiter.until(
                    ExpectedConditions.visibilityOfElementLocated(
                            By.xpath("(//button[@class='related-products__button a-button a-button--outline a-button--primary']")
                    )
            );
            continueToPursageButton.click();




        }finally {
            driver.quit();
        }
    }
}
