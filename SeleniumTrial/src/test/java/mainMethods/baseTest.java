package mainMethods;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class baseTest {
	@BeforeTest
	public static void main(String args[]) throws InterruptedException {
        //  WebDriverManager.chromiumdriver().setup();
        System.setProperty("webdriver.chrome.driver","E:\\Drivers\\chromedriver-win64\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        //open app
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        Thread.sleep(6000);

}
}
