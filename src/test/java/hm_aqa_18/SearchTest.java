package hm_aqa_18;

import aqa_hm_18.HomePage;
import aqa_hm_18.ProductPage;
import aqa_hm_18.SearchResultsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class SearchTest extends BaseTest{

        @Test
        public void searchProductByName() {
            String searchWord = "Samsung";
            HomePage homePage = new HomePage(getDriver());
            homePage.enterSearchKeyWord(searchWord);

            SearchResultsPage searchResultsPage = new SearchResultsPage(getDriver());

            List<String> productNames = searchResultsPage.getProductNames();

            Assert.assertFalse(productNames.isEmpty(), "No products found");

            Assert.assertTrue(productNames.stream().allMatch(product -> product.toLowerCase().contains(searchWord.toLowerCase())),
                    "Not all products contain search word: " + searchWord
            );
            searchResultsPage.openFirstProduct();
            ProductPage productPage =  new ProductPage(getDriver());
            String productTitle =  productPage.getProductTitle();

            Assert.assertTrue(productTitle.toLowerCase().contains(searchWord.toLowerCase()),
                    "Product title does not contain search word"
            );
        }
    }
