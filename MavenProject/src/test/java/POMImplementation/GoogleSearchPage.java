package POMImplementation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPage {

	public WebDriver driver;
	
    public GoogleSearchPage(WebDriver driver) 
    {
		super();
		this.driver = driver;
	}
		
	By GsearchStats = By.id("result-stats");
	
	
	public WebElement SearchStats()
	{
		return driver.findElement(GsearchStats);
	} 
}
