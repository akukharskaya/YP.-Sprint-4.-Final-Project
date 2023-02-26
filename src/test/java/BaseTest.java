import config.AppConfig;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static config.WebDriverConfig.WAIT_SECOND_TIMEOUT;

public class BaseTest {
    protected static WebDriver driver;

    @BeforeClass
    public static void setup() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(WAIT_SECOND_TIMEOUT, TimeUnit.SECONDS);
        driver.navigate().to(AppConfig.URL);
    }


//    @AfterClass
//    public static void teardown() {
//        driver.quit();
//    }
}
