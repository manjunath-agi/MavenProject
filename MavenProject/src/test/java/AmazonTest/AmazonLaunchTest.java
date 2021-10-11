package AmazonTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class AmazonLaunchTest {
	
		
	@Test
	public void BrowserCall() throws IOException
	{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\00005232\\git\\repository\\MavenProject\\data.properties");
		prop.load(fis);
		String vBrowser = prop.getProperty("Browser");
		
		if(vBrowser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\00005232\\OneDrive - Arisglobal software pvt Ltd\\Softwares for installation\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.amazon.in");
			driver.close();
		}	
		else if(vBrowser.equalsIgnoreCase("edge"))
			{
				System.setProperty("webdriver.edge.driver", "C:\\Users\\00005232\\OneDrive - Arisglobal software pvt Ltd\\Softwares for installation\\msedgedriver.exe");
				WebDriver driver = new EdgeDriver();
				driver.get("https://www.amazon.in");
				driver.close();
			}
		else
			System.out.println("INVALID BROWSER");
			
			
		}
	}


