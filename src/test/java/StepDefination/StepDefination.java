package StepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination {
	
	WebDriver driver;
	
	
	@Given("^user navigate to login page$")
	public void user_navigate_to_login_page()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.demo.guru99.com/V4/index.php");		
	}
	
	@When("^user enter usename and password$")
	public void user_enter_usename_and_password()
	{
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr355986");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("hytUzus");
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
	}
	
	@Then("^login successful$")
	public void login_successful()
	{
		String title = driver.getTitle();
		System.out.println(title);
	}
	

}
