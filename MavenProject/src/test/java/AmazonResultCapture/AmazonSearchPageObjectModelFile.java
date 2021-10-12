package AmazonResultCapture;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonSearchPageObjectModelFile {
	
	private WebDriver driver;

	public AmazonSearchPageObjectModelFile(WebDriver driver) 
	{
		super();
		this.driver = driver;
	}
	
	By GetIttodayCheckbox = By.className("a-icon a-icon-checkbox");
	By DisplayText = By.xpath("//*[@id=\"search\"]/span/div/span/h1/div/div[1]/div/div/span[1]");
	
	public WebElement GetIttodayCheckbox()
	{
		return driver.findElement(GetIttodayCheckbox);
	}
	
	public WebElement DisplayText()
	{
		return driver.findElement(DisplayText);
	}
}
