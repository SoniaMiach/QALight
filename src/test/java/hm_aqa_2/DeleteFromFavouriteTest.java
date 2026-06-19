package hm_aqa_2;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DeleteFromFavouriteTest {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        WebDriverWait waiter = new WebDriverWait(driver, Duration.ofSeconds(15));

        try {
            driver.get("https://hotline.ua/");
            driver.manage().window();

            WebElement firstProduct = driver.findElement(By.xpath("//div[@data-id='524']"));
            waiter.until(ExpectedConditions.elementToBeClickable(firstProduct));
            firstProduct.click();

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

            WebElement contextMenuButton = waiter.until(
                    ExpectedConditions.elementToBeClickable(
                            By.xpath("//button[@class='profile-list-item-action__button']")
                    )
            );
            contextMenuButton.click();

            WebElement deleteButton = waiter.until(
                    ExpectedConditions.elementToBeClickable(
                            By.xpath("//button[@class='button-with-icon content__item content__item--delete content__item--delete-red']")
                    )
            );
            deleteButton.click();

            WebElement emptyStateMessage = waiter.until(
                    ExpectedConditions.visibilityOfElementLocated(
                            By.xpath("//div[@class='profile-list-empty-message']")
                    )
            );
            String emptyStateMessageText = emptyStateMessage.getText();


            Assert.assertEquals("Titles is not the same",emptyStateMessageText,"Список порожній");

        } finally {
            driver.quit();
        }
    }
}
