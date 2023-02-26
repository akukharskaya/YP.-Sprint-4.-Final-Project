package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderPage extends BasePage {

    //Заполнить форму заказа.
    private By orderButtonHeader = By.className("Button_Button__ra12g");
    private By orderButtonDown = By.className("Button_Button__ra12g Button_Middle__1CSJM");
    private By inputName = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/input");
    private By inputSurname = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/input");
    private By inputAdress = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[3]/input");
    private By metroDropdown = By.className("select-search__input");
    private By inputPhoneNumber = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[5]/input");


    public OrderPage (WebDriver driver) {
        super(driver);
    }

    public void clickOrderButtonHeader() {
        WebElement element = driver.findElement(orderButtonHeader);
        element.click();
    }

//    public void clickOrderButtonDown() {
//        scroll();
//        WebElement element = driver.findElement(orderButtonDown).click();
//        element.click();
//    }
//
    public void setInputName(String name) {
        WebElement element = driver.findElement(inputName);
        element.sendKeys(name);
    }

//    public void setInputSurname(String surname) {
//        WebElement element = driver.findElement(inputSurname).sendKeys(surname);
//    }
//
//    public void setInputAdress(String adress) {
//        WebElement element = driver.findElement(inputAdress).sendKeys(adress);
//    }
//
//    public void setInputPhoneNumber(String phoneNumber) {
//        WebElement element = driver.findElement(inputPhoneNumber).sendKeys(phoneNumber);
//    }
//
//    public void selectMetroStation() {
//        WebElement element = driver.findElement(metroDropdown).click();
//        element.findElement()
//    }

    public void scroll(){
        WebElement element = driver.findElement(By.className("Home_FinishButton__1_cWm"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
    }
}