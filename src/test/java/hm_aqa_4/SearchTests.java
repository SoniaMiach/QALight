package hm_aqa_4;

import aqa_hm_4.CataloguePage;
import aqa_hm_4.HomePage;
import hm_aqa_4.dataProvider.BrandData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;


public class SearchTests extends BaseTest {

    @Test(dataProvider = "searchData", dataProviderClass = BrandData.class, groups = "positive")
    public void SearchBrandByName(String searchWord){
        HomePage homePage = new HomePage(getDriver());
        homePage.enterSearchKeyWord(searchWord);

        CataloguePage cataloguePage = new CataloguePage(getDriver());
        List<String> productNames = cataloguePage.getProductNames();

        Assert.assertTrue(
                productNames.stream()
                        .allMatch(name ->
                                name.toLowerCase().contains(searchWord.toLowerCase())),
                "Not all products contain search word: " + searchWord
        );
    }
}
