package testForm.utils;

import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeOptions;
import com.codeborne.selenide.Configuration;

public class ChromeDriverManager {
    private static boolean isDriverInitialized = false;

    private ChromeDriverManager() {}

    public static void initDriver() {
        if (isDriverInitialized) {
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--start-maximized");
            Configuration.browser = "chrome";
            isDriverInitialized = true;
        }
    }

    public static void openPage(String url) {
        if (!isDriverInitialized) {
            initDriver();
        }
        Selenide.open(url);
    }

    public static void closeDriver() {
        Selenide.closeWebDriver();
        isDriverInitialized = false;
    }

}
