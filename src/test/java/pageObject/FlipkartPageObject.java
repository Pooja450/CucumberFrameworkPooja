package pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FlipkartPageObject {

	static WebDriver driver;
	
	public static boolean ElementsVisibility()
	{
		 List<WebElement> tabselement = driver.findElements(By.xpath("//ul[@class='_114Zhd']/li"));
		  for(WebElement e :tabselement)
		  {
			  e.isDisplayed();
		  }
		  return true;
	}
	/* public static boolean LoginButton()
	{
		driver.findElement(By.xpath("//a[@class='_3Ep39l']")).isDisplayed();
		return true;
	}
	
	public static boolean  CartButton()
	{
		driver.findElement(By.xpath("//svg[@class='_2fcmoV']")).isDisplayed();
		return true;
	}
	
	public static boolean ElectronicsButton()
	{
		driver.findElement(By.xpath("//span[@class='_1QZ6fC _3Lgyp8']")).isDisplayed();
		return true;
	}
	*/
	
}
