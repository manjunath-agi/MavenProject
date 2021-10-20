package SeleniumAssessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageObjectFile {

	private WebDriver driver;

	public HomePageObjectFile(WebDriver driver) 
	{
		super();
		this.driver = driver;
	}

	By FromPort = By.id("fromPort");
	By ToPort = By.id("toPort");
	By FindFlightsBTN = By.xpath("/html/body/div[3]/form/div/input");
	
	public WebElement FromPort()
	{
		return driver.findElement(FromPort);
	}
	
	public WebElement ToPort()
	{
		return driver.findElement(ToPort);
	}

	public WebElement FindFlightsBTN()
	{
		return driver.findElement(FindFlightsBTN);
	}
}
	
	

