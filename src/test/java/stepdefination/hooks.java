package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class hooks {

	
	@Before
	public void beforescenario() {
		System.out.println("====================Starting Scearnio=======================");
		System.setProperty("webdriver.chrome.driver", "//Users//poojabhandari//Desktop//SELENIUM_TRAINING//chromedriver");
	    WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
	}
	
	@After
	public void afterscenario() {
		System.out.println("=======================Ending Scearnio=======================");
	}
	
}
