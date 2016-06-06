package cucumber;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class TestExecution {
	public WebDriver driver;
	
	@Given("^user in Kexim Home page$")
	public void user_in_Kexim_Home_page() {
	    driver = new FirefoxDriver();
	    driver.get("http://srssprojects.in");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@When("^user entered valid user name and valid password$")
	public void user_entered_valid_user_name_and_valid_password() {
	    driver.findElement(By.id("txtuId")).sendKeys("Admin");
	    driver.findElement(By.id("txtPword")).sendKeys("Admin");
	
	}

	@When("^user clicked on login button$")
	public void user_clicked_on_login_button() {
		driver.findElement(By.id("login")).click();
	   
	}

	@Then("^user get Admin home page with welecome to admin message$")
	public void user_get_Admin_home_page_with_welecome_to_admin_message()  {
	    if (driver.findElement(By.xpath("//img[@src,images/admin_but_03.jpg]")).isDisplayed()) {
			System.out.println("test passed");
			driver.close();
		}
	}

	@Given("^user is in Kexim Home page$")
	public void user_is_in_Kexim_Home_page() {
	    // Write code here that turns the phrase above into concrete actions
		 driver = new FirefoxDriver();
		    driver.get("http://srssprojects.in");
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@When("^user entered valid username$")
	public void user_entered_valid_username() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
	    
	}

	@When("^user entered invalid password$")
	public void user_entered_invalid_password()  {
		driver.findElement(By.id("txtPword")).sendKeys("Adminn");
	}

	@When("^user click on login button$")
	public void user_click_on_login_button() {
		driver.findElement(By.id("login")).click();
	}

	@Then("^user get an alert message as invalid username/password$")
	public void user_get_an_alert_message_as_invalid_username_password()  {
		String text = driver.switchTo().alert().getText();
		if(text.contains("invalid")){
			System.out.println("test is passed");
		}
	}
}
