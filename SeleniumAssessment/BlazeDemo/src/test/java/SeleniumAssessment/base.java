package SeleniumAssessment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class base {
	
	public static WebDriver driver;
	public static String iFile, browser;
	public static Properties prop;
	
	
	public void CallBrowser() throws IOException
	{
		
		iFile = "C:\\Users\\00005232\\git\\repository\\SeleniumAssessment\\BlazeDemo\\Assessmentdata.properties";
		
		FileInputStream fis = new FileInputStream(iFile);
		prop = new Properties();
		prop.load(fis);
		browser = prop.getProperty("Browser");
		
		if (browser.equalsIgnoreCase("CHROME"))
		{		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\00005232\\OneDrive - Arisglobal software pvt Ltd\\Softwares for installation\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		else if (browser.equalsIgnoreCase("EDGE"))
		{
		    System.setProperty("webdriver.edge.driver", "C:\\Users\\00005232\\OneDrive - Arisglobal software pvt Ltd\\Softwares for installation\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		
		else 
		{
			System.out.println("Invalid Browser");
		}
		
		}
	}


