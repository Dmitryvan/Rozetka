package rozetka.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by dmyv on 5/15/18.
 */
public class MainPage {
    private WebDriver driver;

    public MainPage(WebDriver driver){this.driver = driver; }

    By signInButtonLocator = By.xpath("//*[@id=\"header_user_menu_parent\"]/a");
    By emailInputLocator = By.xpath("//*[@id=\"popup_signin\"]/div[1]/div[1]/input");
    By passwordInputLocator = By.cssSelector("#popup_signin > div.auth-f-email > div:nth-child(2) > div:nth-child(1) > div.auth-f-i > input");
    By submitButtonLocator = By.xpath("/html/body/header/div/div/div[1]/div[1]/div[3]/div/div/div/form/div[1]/div[2]/div[1]/div[2]/div/span/button");

    public  void clickSignButton(){
        driver.findElement(signInButtonLocator).click();
    }
    public void typeEmail(String email){
        WebElement login = driver.findElement(emailInputLocator);
        login.click();
        login.click();
        login.sendKeys(email);
    }
    public void typePassword(String password) {
        WebElement login = driver.findElement(passwordInputLocator);
        login.click();
        login.click();
        login.sendKeys(password);
    }
    public void clickSubmitButton(){
        driver.findElement(submitButtonLocator).click();
    }
    public void login(String email, String password){
        typeEmail(email);
        typePassword(password);
        clickSubmitButton();
    }
}
