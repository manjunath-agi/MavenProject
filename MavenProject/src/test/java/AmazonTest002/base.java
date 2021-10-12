package AmazonTest002;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class base {
	
	public WebDriver driver;
	public Properties prop;
	public FileInputStream fis;
	public String vBrowser; 
	
	public void BrowserCall() throws IOException
	{
		prop = new Properties();
		fis = new FileInputStream("C:\\Users\\00005232\\git\\repository\\MavenProject\\data.properties");
		prop.load(fis);
		vBrowser = prop.getProperty("Browser");
		
		if(vBrowser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\00005232\\OneDrive - Arisglobal software pvt Ltd\\Softwares for installation\\chromedriver.exe");
			driver = new ChromeDriver();	
		}	
		else if(vBrowser.equalsIgnoreCase("edge"))
			{
				System.setProperty("webdriver.edge.driver", "C:\\Users\\00005232\\OneDrive - Arisglobal software pvt Ltd\\Softwares for installation\\msedgedriver.exe");
				driver = new EdgeDriver();
			}
		else
			System.out.println("INVALID BROWSER");
			
			
		}
	}


