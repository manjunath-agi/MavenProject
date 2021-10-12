package AmazonTest001;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class AmazonTC001 extends base {
	
	//public WebDriver driver;
	
	@Test
	public void TestCase001() throws Exception
	{
		BrowserCall();
		driver.get(prop.getProperty("URL"));
		AmazonPOM APOM = new AmazonPOM(driver);
		APOM.SearchFieldbox().sendKeys("iphone 13 pro");
		APOM.SearchButton().click();
	
	
	
	}

}
