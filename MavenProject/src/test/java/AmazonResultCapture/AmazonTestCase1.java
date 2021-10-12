package AmazonResultCapture;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class AmazonTestCase1  extends base 

	{
	
	@Test
	public void TestCase001() throws IOException
	{
	
	BrowserCall();
	driver.get("https://www.amazon.in");
	AmazonHomePageObjectModelFile AHP = new AmazonHomePageObjectModelFile(driver);
	AHP.SearchFieldbox().sendKeys("iphone 13");
	AHP.SearchButton().click();
	
	AmazonSearchPageObjectModelFile ASP = new AmazonSearchPageObjectModelFile(driver);
	ASP.GetIttodayCheckbox().click();
	String displayText = ASP.DisplayText().getText();
	//String displayText = driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/span/h1/div/div[1]/div/div/span[1]")).getText();
	System.out.println(displayText);
	
	
	
	
	}

}
