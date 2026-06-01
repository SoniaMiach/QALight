package hm_aqa_4.dataProvider;

import org.testng.annotations.DataProvider;

public class BrandData {
    @DataProvider(name = "searchData")
    public Object[][] searchData(){
        return new Object[][]{
                {"Samsung"},
                {"Iphone"},
                {"Xiaomi"}
        };
    }
}
