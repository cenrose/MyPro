package pages.registryHome;

import common.CommonAction;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class RegistryHomePage extends BasePage {
    public RegistryHomePage(WebDriver driver) {
        super(driver);
    }
    WebDriver driver = CommonAction.createDriver();
    By signIn = By.xpath("//a[@data-testid='signInBtn']");
    By usernameInput = By.xpath("//input[@id='username']");
    By passwordInput = By.xpath("//input[@id='password']");
    By logInButton = By.xpath("//input[@name='login']");

    @Step("Нажимаем кнопку войти")
    public RegistryHomePage enterSignInBtn(){
        driver.findElement(signIn).click();
        return this;
    }
    @Step("Вводим логин и пароль")
    public RegistryHomePage enterLoginAndPassword(){
        driver.findElement(usernameInput).sendKeys("71450643575");
        driver.findElement(passwordInput).sendKeys("123");
        return this;
    }
    @Step("Нажимаем кнопку войти с заполненными полями логина и пароля")
    public RegistryHomePage enterBtnLogIn(){
        driver.findElement(logInButton).click();
        return this;
    }
}