package pages.personalAccount;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class PersonalAccountPage extends BasePage {
    public PersonalAccountPage(WebDriver driver) {
        super(driver);
    }

    By userAccount = By.xpath("//a[@data-testid='userBtn']");
    By personalArea = By.xpath("//span[text()=\"Личный кабинет\"]");
    By varia = By.xpath("//a[text()='Разное']");
    By healthIndicators = By.xpath("//a[text()='Показатели здоровья']");

    @Step("Переходим в ЛК -> разное -> показатели здоровья")
    public PersonalAccountPage showHealthIndicators(){

        waitElementIsVisible(driver.findElement(userAccount));
        driver.findElement(userAccount).click();

        waitElementIsVisible(driver.findElement(personalArea));
        driver.findElement(personalArea).click();

        waitElementIsVisible(driver.findElement(varia));
        driver.findElement(varia).click();

        waitElementIsVisible(driver.findElement(healthIndicators));
        driver.findElement(healthIndicators).click();
        return this;
    }
}
