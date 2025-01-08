package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage_PF;

public class loginSteps_PF {
	WebDriver driver =null;
	LoginPage_PF login;
	
	@Given("User is on login page")
	public void user_is_on_login_page() throws InterruptedException
	{
		System.out.println("=== I am inside PF===");
		String ProjectPath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",ProjectPath+"/src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		//driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		System.out.println("user opens browser");
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	    System.out.println("Inside step - user is on login page");
	    Thread.sleep(2000);
	}


	@When("^user enters (.*) and (.*) credentials$")
	public void user_enters_username_and_password_credentials(String username,String password) 
	{
		login = new LoginPage_PF(driver);
		login.enterUsername(username);
		login.enterPassword(password);
		
	
		
		System.out.println("Inside step - user entered credentials");
	}
	   	

	@And("click on login button")
	public void click_on_login_button() throws InterruptedException
	{
		login = new LoginPage_PF(driver);
		login.clickLogin();
		//driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

	
	
		System.out.println("Inside step - user clicks on login button");
		Thread.sleep(2000);
	}

	@Then("user navigated to  homepage")
	public void user_navigated_to_homepage() throws InterruptedException {
		login = new LoginPage_PF(driver);
		login.homepageIsDisplayed();
		

		System.out.println("Inside step - user clicks on login button");
		Thread.sleep(2000);
	}

	
		//driver.close();
		//driver.quit();
	}


