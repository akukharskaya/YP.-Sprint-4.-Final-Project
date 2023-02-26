package config;

import org.openqa.selenium.WebDriver;

public class WebDriverConfig {
    public WebDriver driver;
    public static final long WAIT_SECOND_TIMEOUT=10;

    public WebDriverConfig(WebDriver driver) {
        this.driver = driver;
    }
}
