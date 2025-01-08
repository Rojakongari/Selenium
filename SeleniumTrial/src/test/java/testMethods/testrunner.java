package testMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import mainMethods.baseTest;
//import mainMethods.baseTest;
import pages.SearchPage;

public class testrunner extends baseTest {
	WebDriver driver=null;
	SearchPage pfsearch;
	
	/*@BeforeTest
		public static void beforeTest() throws InterruptedException {
        //WebDriverManager.chromiumdriver().setup();
        System.setProperty("webdriver.chrome.driver","E:\\Drivers\\chromedriver-win64\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        //open app
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        Thread.sleep(6000);
        //driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobiles");
	}*/
	@Test
	public void searchoperation()throws InterruptedException
	{
		pfsearch = new SearchPage(driver);
		pfsearch.searchgoogle("mobiles");
	}

}
