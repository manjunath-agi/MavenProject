package AmazonTest002;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class AmazonSearchPOM {
	
	public WebDriver driver;

	public AmazonSearchPOM(WebDriver driver) 
	{
		super();
		this.driver = driver;
	}
	
	//By GetIttodayCheckbox = By.className("a-size-base a-color-base a-text-bold");
	By GetIttodayCheckbox = By.xpath("//*[@id=\"p_90/6741117031\"]/span/a/div/label/i");
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
