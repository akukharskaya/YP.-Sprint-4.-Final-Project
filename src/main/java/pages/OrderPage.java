package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class OrderPage extends BasePage {

    //Заполнить форму заказа.
    private By orderButtonHeader = By.className("Button_Button__ra12g");
    private By orderButtonDown = By.className("Button_Middle__1CSJM");
    private By inputName = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/input");
    private By inputSurname = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/input");
    private By inputAdress = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[3]/input");
    private By metroDropdown = By.className("select-search__input");
    private By inputPhoneNumber = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[5]/input");


    public OrderPage (WebDriver driver) {
        super(driver);
    }

    public void clickOrderButtonHeader() {
        driver.findElement(orderButtonHeader).click();
    }

    public void clickOrderButtonDown() {
        scroll();
        driver.findElement(orderButtonDown).click();
    }

    public void setName(String name) {
        driver.findElement(inputName).sendKeys(name);
    }


    public void setSurname(String surname) {
        driver.findElement(inputSurname).sendKeys(surname);
    }

    public void setInputAddress(String adress) {
        driver.findElement(inputAdress).sendKeys(adress);
    }

    public void setInputPhoneNumber(String phoneNumber) {
        driver.findElement(inputPhoneNumber).sendKeys(phoneNumber);
    }

    public void selectMetroStation(String metro) {
        driver.findElement(metroDropdown).click();
        WebElement button = driver.findElement(By.xpath("//*[text()='" + metro + "']/parent::button"));
        button.click();
    }

    public void scroll(){
        WebElement element = driver.findElement(By.className("Home_FinishButton__1_cWm"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
    }
}