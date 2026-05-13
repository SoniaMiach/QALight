package hm_aqa_1;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static java.lang.Thread.sleep;

public class WishPopUpVisibilityVerification {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        try {
            driver.get("https://hotline.ua/");
            driver.manage().window().maximize();

            WebElement wishListButton = driver.findElement(By.xpath("//div[@data-tracking-id='global-17']//div[@class='button__icon flex']"));
            wishListButton.click();

            sleep(3000);

            WebElement withListPopUp = driver.findElement(By.xpath("//div[contains(@class, 'my-list__selection')]]"));

            Assert.assertTrue("WishlistPopUp is displayed", withListPopUp.isDisplayed());
        } finally {
            driver.quit();
        }
    }
}
