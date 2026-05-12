package hm_aqa_1;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class ComparePopUpTest {
    public static void main(String[] args) throws InterruptedException {

        String expectedText = "Списки порівнянь";
        WebDriver driver = new ChromeDriver();
        try {
            driver.get("https://hotline.ua/");
            driver.manage().window().maximize();

            WebElement compareListButton = driver.findElement(By.xpath("//div[@data-tracking-id='global-16']//div[@class='button__icon flex']"));
            compareListButton.click();

            sleep(3000);

            WebElement compareListPopUp = driver.findElement(By.xpath("//div[@class='profile-sidebar__section-content flex-column']"));

            Assert.assertTrue("CompareList is displayed", compareListPopUp.isDisplayed());

            sleep(3000);
            WebElement popUpTitle = driver.findElement(By.xpath("//span[@class='section-label']"));
            String textTitle = popUpTitle.getText();
            sleep(3000);
            Assert.assertEquals("Text is not equal", expectedText, textTitle);

        } finally {
            driver.quit();
        }
    }
}
