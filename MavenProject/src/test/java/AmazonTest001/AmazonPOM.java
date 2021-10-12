package AmazonTest001;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonPOM {
	
	public WebDriver driver;

	public AmazonPOM(WebDriver driver) 
	{
		super();
		this.driver = driver;
	}
	
	By SearchFieldbox = By.id("twotabsearchtextbox");
	By SearchButton = By.id("nav-search-submit-button");
	
	public WebElement SearchFieldbox()
	{
		return driver.findElement(SearchFieldbox);
	}

	public WebElement SearchButton()
	{
		return driver.findElement(SearchButton);
	}
}
