package first;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.Arrays;

public class Newsample {
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver","E:\\Roja\\Chromedriver\\chromedriver.exe");
       // WebDriver driver = new ChromeDriver();
        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("disable-notifications");
        WebDriver driver=new ChromeDriver(opt);
        driver.get("https://www.makemytrip.com/");
        driver.manage().window().maximize();
      // WebElement google = driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div/div/nav/ul/li[5]/a"));
        WebDriverWait wait = new WebDriverWait(driver,40);
       WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"SW\"]/div[1]/div[1]/ul/li[3]")));
       Boolean display = driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[1]/ul/li[3]")).isDisplayed();
       System.out.println("Element displayed is :"+display);

       element.click();

        WebDriverWait wait1 = new WebDriverWait(driver,40);
       WebElement ddown = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input")));
       ddown.click();




    }

}
