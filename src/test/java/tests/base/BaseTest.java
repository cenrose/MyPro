package tests.base;

import common.CommonAction;
import pages.base.BasePage;
import pages.personalAccount.PersonalAccountPage;
import org.openqa.selenium.WebDriver;
import pages.registryHome.RegistryHomePage;

//общая логика для всех тестов
public class BaseTest {
    protected WebDriver driver = CommonAction.createDriver(); //получаем драйвер
    protected BasePage basePage = new BasePage(driver); //создаем экземпляр базовой (home) страницы
    protected RegistryHomePage registryHomePage = new RegistryHomePage(driver); //экземпляр страницы
    protected PersonalAccountPage personalAccountPage = new PersonalAccountPage(driver);
}
