package hm_aqa_2;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static java.lang.Thread.sleep;

public class CatalogTest {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        WebDriverWait waiter = new WebDriverWait(driver, Duration.ofSeconds(5));
        try {
            driver.get("https://hotline.ua/");
            driver.manage().window().maximize();

            WebElement catalogueButton = driver.findElement(By.xpath("//div[@class='button-menu-main']"));
            waiter.until(ExpectedConditions.elementToBeClickable(catalogueButton));
            catalogueButton.click();

            WebElement energyElement = driver.findElement(By.xpath("//a[@data-id='10']"));
            waiter.until(ExpectedConditions.elementToBeClickable(energyElement));
            energyElement.click();

            WebElement titleElement = driver.findElement(By.xpath("h1[@class='title-page flex middle-xs section-title']"));
            waiter.until(ExpectedConditions.visibilityOf(titleElement));
            String textTitle = titleElement.getText();


            Assert.assertEquals("Title is not same", textTitle,"Енергозабезпечення");
        } finally {
            driver.quit();
        }
    }
}
