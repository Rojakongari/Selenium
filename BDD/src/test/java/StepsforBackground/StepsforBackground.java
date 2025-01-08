package StepsforBackground;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AdminPage;
import pages.Homepage;
import pages.LoginPage_PF;


public class StepsforBackground {
	WebDriver driver =null;
	LoginPage_PF login;
	Homepage HPvalidation;
	AdminPage AdminPageValidation;
	
	@Given("user is on login page")
	public void user_is_on_login_page() throws InterruptedException {
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
	
	@When("user enters username and password")
	public void user_enters_username_and_password() {
		login = new LoginPage_PF(driver);
		login.enterUsername();
		login.enterPassword();
	}
	
	@When("clicks on login button")
	public void clicks_on_login_button() {
		login = new LoginPage_PF(driver);
		login.clickLogin();
	    
	}
	
	@Then("user is navigated to the homepage")
	public void user_is_navigated_to_the_homepage() throws InterruptedException {
		login = new LoginPage_PF(driver);
		login.homepageIsDisplayed();
		

		System.out.println("Inside step - enters homepage");
		Thread.sleep(2000);
	   	}
	
	@Then("OrangeHRM image is displayed")
	public void orange_hrm_image_is_displayed() {
		HPvalidation = new Homepage(driver);
		HPvalidation.homepagevalidation();
	   
	}
	
	@When("user clicks on Admin")
	public void user_clicks_on_admin() {
		AdminPageValidation= new AdminPage(driver);
		AdminPageValidation.clickOnAdmin();
	    	}
	
	@Then("Admin page is displayed")
	public void admin_page_is_displayed() {
		AdminPageValidation= new AdminPage(driver);
		AdminPageValidation.Adminpageverify();
	    	}
}




