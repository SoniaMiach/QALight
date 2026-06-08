package hm_aqa_4;

import aqa_hm_4.CataloguePage;
import aqa_hm_4.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ComparisonTest extends BaseTest {

        @Test(groups = {"positive"})
        public void SearchBrandByName() {
            String searchWord = "Samsung";
            HomePage homePage = new HomePage(getDriver());
            homePage.enterSearchKeyWord(searchWord);

            CataloguePage cataloguePage = new CataloguePage(getDriver());
            cataloguePage.addToCompare();
            String compareName = cataloguePage.getCompareName();
            Assert.assertTrue(compareName.contains(searchWord));
        }
    }

