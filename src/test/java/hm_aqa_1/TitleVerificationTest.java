package hm_aqa_1;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.String.format;
import static java.lang.Thread.sleep;

public class TitleVerificationTest  {
    public static void main(String[] args) throws InterruptedException{

        String searchWord = "iPhone";
        WebDriver driver = new ChromeDriver();
        try {
            driver.get("https://hotline.ua/");
            driver.manage().window().maximize();

            WebElement inputField = driver.findElement(By.xpath("//input"));
            inputField.sendKeys(searchWord);

            sleep(3000);

            WebElement searchButton = driver.findElement(By.xpath("//button[starts-with(@class, 'search__btn')]"));
            searchButton.click();

            sleep(5000);

            WebElement title = driver.findElement(By.xpath("//div[@class='search__title']"));
            String titleText = title.getText();

            String errorMessage = format("Title is incorrect. It doesn't contains <%s> search words", searchWord);

            Assert.assertTrue(errorMessage,titleText.contains(searchWord));
        } finally {
            driver.quit();
        }





    }
}
