package first;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class windowpopup {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "E:\\Roja\\Chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://html.com/input-type-file/");
        driver.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,800)", "");

        WebDriverWait wait = new WebDriverWait(driver, 5000);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.name("fileupload")));
        driver.findElement(By.name("fileupload")).sendKeys("E:\\Roja\\4.pdf");


    }
}