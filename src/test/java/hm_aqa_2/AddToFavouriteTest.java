package hm_aqa_2;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AddToFavouriteTest {
    public static void main(String[] args) {
        String searchWord = "iPhone";

        WebDriver driver = new ChromeDriver();
        WebDriverWait waiter = new WebDriverWait(driver, Duration.ofSeconds(15));

        try {
            driver.get("https://hotline.ua/");
            driver.manage().window();

            WebElement inputField = driver.findElement(By.xpath("//input"));
            waiter.until(ExpectedConditions.elementToBeClickable(inputField));
            inputField.sendKeys(searchWord + Keys.ENTER);

            WebElement firstProduct = waiter.until(
                    ExpectedConditions.visibilityOfElementLocated(
                            By.xpath("(//div[@class='list-item__photo-container'])[1]")
                    )
            );
            firstProduct.click();

            WebElement textTitle = waiter.until(
                    ExpectedConditions.visibilityOfElementLocated(
                            By.xpath("//div[@class='title']")
                    )
            );
            String inputText = textTitle.getText();

            WebElement actionButton = waiter.until(
                    ExpectedConditions.elementToBeClickable(
                            By.xpath("//div[@class='action action--bookmark']")
                    )
            );
            waiter.until(ExpectedConditions.elementToBeClickable(actionButton));
            actionButton.click();

            WebElement favouriteButton = waiter.until(
                    ExpectedConditions.elementToBeClickable(
                            By.xpath("//a[contains(@href,'/lists/bookmarks')]")
                    )
            );
            waiter.until(ExpectedConditions.elementToBeClickable(favouriteButton));
            favouriteButton.click();

            WebElement favouriteTextTitle = waiter.until(
                    ExpectedConditions.visibilityOfElementLocated(
                            By.xpath("//div[@class='list-item__title-container m_b-5']")
                    )
            );
           String favouriteText = favouriteTextTitle.getText();

           Assert.assertEquals("Titles is not the same",inputText,favouriteText);

        } finally {
            driver.quit();
        }
    }
}
