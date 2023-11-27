package testForm;

import org.testng.annotations.*;
import testForm.utils.ChromeDriverManager;
import testForm.utils.JsonHelper;

public class BaseTest {

    @BeforeGroups(groups = "web")
    public void startBrowser() {
        ChromeDriverManager.openPage(JsonHelper.getTestsData().getUrl());
    }

    @AfterGroups(groups = "web")
    public void tearDown() {
        ChromeDriverManager.closeDriver();
    }

}
