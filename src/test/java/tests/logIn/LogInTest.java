package tests.logIn;

import jdk.jfr.Description;
import org.openqa.selenium.support.ui.WebDriverWait;
import tests.base.BaseTest;
import pages.base.BasePage;
import org.testng.annotations.Test;

//тестовый сценарий
public class LogInTest extends BaseTest {
    @Test
    @Description("Тест проверяет вход в ЛК и переход в показатели здоровья")
    public void checkLogingInAndCheckHealthIndicators() {
        BasePage.open("http://pp86.hostco.ru");

        registryHomePage.enterSignInBtn()
                .enterLoginAndPassword()
                .enterBtnLogIn();

        WebDriverWait wait = new WebDriverWait(driver, 10);
        personalAccountPage.showHealthIndicators();
    }
}