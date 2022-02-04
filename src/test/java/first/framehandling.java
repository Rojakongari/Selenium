package first;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class framehandling {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "E:\\Roja\\Chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://html.com/input-type-file/");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.switchTo().frame("frame1");


    }
}
