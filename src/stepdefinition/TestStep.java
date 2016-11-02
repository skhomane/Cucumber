package stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.junit.*;

import automationutility.DriverUnit;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestStep {
	
	public static WebDriver driver=null; 
	
	WebElement em;
	
	@Given("^User is on google page of chrome$")
	public void user_is_on_google_page_of_chrome() throws Throwable {
		driver=DriverUnit.setup_ChromeDriver();		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.co.in");
	}
	
	@Given("^User is on google page of IE Browser$")
	public void user_is_on_google_page_of_IE() throws Throwable {
		driver=DriverUnit.setup_IEDriver();		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.co.in");
	}
	
	@When("^User types \"([^\"]*)\" in google page$")
	public void user_types_in_google_page(String arg1) throws Throwable {
		em=driver.findElement(By.cssSelector("input[title*='Search']"));
		em.sendKeys("Sachin");
	}

	@When("^Hit enter key or click on search$")
	public void hit_enter_key_or_click_on_search() throws Throwable {
		em.sendKeys(Keys.ENTER);
		Thread.sleep(10);
	}

	@Then("^searched text should match with \"([^\"]*)\"$")
	public void searched_text_should_match_with(String arg1) throws Throwable {
		Assert.assertTrue(em.getAttribute("value").equals("Sachin"));
	}
	
	@Then("^close the browser$")
	public void close_the_browser() throws Throwable {
		driver.quit();
	}

}
