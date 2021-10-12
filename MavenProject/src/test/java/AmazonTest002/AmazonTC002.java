package AmazonTest002;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class AmazonTC002 extends base 

	{
	
	@Test
	public void TestCase002() throws IOException
	{
	
	BrowserCall();
	driver.get(prop.getProperty("URL"));
	Assert.assertEquals(driver.getTitle(), prop.getProperty("Title"));
	
	}
	
	@AfterTest
	public void CloseBrowser()
	{
		driver.close();
		System.out.println("Assertion Executed");
	}
	
}
