package stepdefination;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageObject.FlipkartPageObject;

public class FlipkartTabsTest {

	WebDriver driver;
	@Given("I launch flipkart Url")
	public void i_launch_flipkart_Url() {
	    System.out.println("Launched Url");
	}

	@Then("I verify following components")
	public void i_verify_following_components(io.cucumber.datatable.DataTable dataTable) {
	    System.out.println("components available");
	   /* List<String> allcomponents = dataTable.asList();
		for(String e: allcomponents) {
			System.out.println("Checking component "+e);
			*/
	   Assert.assertTrue(FlipkartPageObject.ElementsVisibility());
		  // Assert.assertTrue(FlipkartPageObject.LoginButton());
	    // Assert.assertTrue(FlipkartPageObject.CartButton());
	    // Assert.assertTrue(FlipkartPageObject.ElectronicsButton());
	}
}
