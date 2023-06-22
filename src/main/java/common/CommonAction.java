package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;
import static common.Config.IMPLICIT_WAIT;
import static common.Config.PLATFORM_AND_BROWSER;

/*создаем экземпляр драйвера,
который будет передаваться и для других тестов
нужно, чтобы каждый раз экземпляр драйвера был один и тот же -
поэтому используем паттерн синглтон*/

//В ЭТОМ ПРОЕКТЕ ДРАЙВЕР 114
public class CommonAction {
    private static WebDriver driver = null;
    private CommonAction() {
    }

    //метод создает экземпляр драйвера (на примере браузера хром)
    public static WebDriver createDriver(){
        if(driver == null){
            switch (PLATFORM_AND_BROWSER){
                case "win_chrome":
                     System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
                    driver = new ChromeDriver();
                /*default:
                    Assert.fail("Incorrect platform or browser name " + PLATFORM_AND_BROWSER);*/
            }

            //РЕДАКТИРОВАНИЕ ОКНА БРАУЗЕРА
            //driver.manage().window().maximize();
            driver.manage().window().fullscreen();
            driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT, TimeUnit.SECONDS);
        }
        return driver;
    }
}