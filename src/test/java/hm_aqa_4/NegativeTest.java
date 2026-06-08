package hm_aqa_4;

import aqa_hm_4.CataloguePage;
import aqa_hm_4.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NegativeTest extends BaseTest{

    @Test (groups = {"negative"})
    public void noFoundTest(){
        String invalidWord = "cdsdsdsdsdsdsd";
        String invalidMessage = "Нажаль, нічого не знайдено.";
        HomePage homePage = new HomePage(getDriver());
        homePage.enterSearchKeyWord(invalidWord);
        CataloguePage cataloguePage = new CataloguePage(getDriver());
        String emptyMessage = cataloguePage.getEmptyStateMessage();

        Assert.assertTrue(emptyMessage.contains(invalidMessage));
    }
}
