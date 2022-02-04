package first;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.Arrays;

import static java.lang.Thread.sleep;

public class dropdown {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "E:\\Roja\\Chromedriver\\chromedriver.exe");
        // WebDriver driver = new ChromeDriver();
        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("disable-notifications");
        WebDriver driver = new ChromeDriver(opt);
        driver.get("https://www.makemytrip.com/");
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver,1000);

        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"SW\"]/div[1]/div[1]/ul/li[3]")));
       element.click();
        driver.findElement(By.xpath("//span[text()='From']")).click();
        try {
            sleep(4000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Sydney");
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ENTER);


    }
}