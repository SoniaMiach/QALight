package hm_aqa_4;

import aqa_hm_4.HomePage;
import hm_aqa_4.dataProvider.BrandData;
import org.testng.annotations.Test;

public class SearchTests extends BaseTest {

    @Test(dataProvider = "searchData", dataProviderClass = BrandData.class)
    public void SearchBrandByName(String searchWord){
        HomePage homePage = new HomePage(getDriver());
        homePage.enterSearchKeyWord(searchWord);

    }
}
