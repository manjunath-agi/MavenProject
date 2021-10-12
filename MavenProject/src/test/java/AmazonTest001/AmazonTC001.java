package AmazonTest001;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class AmazonTC001 {
	
	public WebDriver driver;
	
	@Test
	public void TestCase001()
	{
	base baseclassobj = new base();
	try {
		baseclassobj.BrowserCall();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	driver.get("https://amazon.com");
	AmazonPageObjectModelFile APOM = new AmazonPageObjectModelFile(driver);
	APOM.SearchFieldbox().sendKeys("iphone 13 pro");
	APOM.SearchButton().click();
	
	
	
	}

}
