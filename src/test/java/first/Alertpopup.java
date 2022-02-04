package first;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alertpopup {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "E:\\Roja\\Chromedriver\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         driver.get("https://mail.rediff.com/cgi-bin/login.cgi");driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver,5000);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.name("proceed")));
         driver.findElement(By.name("proceed")).click();
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();

    }
}
