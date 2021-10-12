package AmazonResultCapture;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class AmazonTestCase1  extends base 

	{
	
	@Test
	public void TestCase001() throws IOException
	{
	
	BrowserCall();
	driver.get(prop.getProperty("URL"));
	driver.manage().window().maximize();
	AmazonHomePOM AHP = new AmazonHomePOM(driver);
	AHP.SearchFieldbox().sendKeys("iphone 13");
	AHP.SearchButton().click();
	
	AmazonSearchPOM ASP = new AmazonSearchPOM(driver);
	ASP.GetIttodayCheckbox().click();
	String displayText = ASP.DisplayText().getText();
	//String displayText = driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/span/h1/div/div[1]/div/div/span[1]")).getText();
	System.out.println(displayText);
	
	}
	
	@AfterTest
	public void CloseBrowser()
	{
		driver.close();
	}
	
}
