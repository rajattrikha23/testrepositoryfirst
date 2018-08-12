package stepDefination;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SmokeTest_New {
	
	WebDriver driver;
	
	@Given("^Open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","D:/Selenium/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://www.facebook.com");
		
		Thread.sleep(5000);
	    
	}
	@When("^I enter valid username and valid password$")
	public void i_enter_valid_username_and_valid_password() throws Throwable {
		
		driver.findElement(By.id("email")).sendKeys("mohita");
		driver.findElement(By.id("pass")).sendKeys("Rajmohi");
		
		
	    	}

	@Then("^User should login successfully$")
	public void user_should_login_successfully() throws Throwable{
		
		driver.findElement(By.id("loginbutton")).click();
		system.out.println("Sucessfull Login")
	    	}



}
