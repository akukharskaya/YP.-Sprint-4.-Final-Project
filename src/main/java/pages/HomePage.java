package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class HomePage extends BasePage {
    private By questionButtons = By.className("accordion__button");
    private By answers = By.className("accordion__panel");


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickQuestion(String id){
        scroll();
        WebElement element = driver.findElement(By.id(id));

        element.click();
    }

    public String getAnswer(String id){
        WebElement element = driver.findElement(By.id(id));

        return element.getText();
    }


    public void scroll(){
        WebElement element = driver.findElement(By.className("accordion"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
    }

}

