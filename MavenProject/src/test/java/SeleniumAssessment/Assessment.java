package SeleniumAssessment;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Assessment {

	public static WebDriver driver;
	public static FileInputStream fis;
	public static String iFile;
	
	@Test
	public void Blaze() throws InterruptedException, IOException 
	{
	
		iFile="C:\\Users\\00005232\\git\\repository\\MavenProject\\Assessmentdata.properties";
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\00005232\\OneDrive - Arisglobal software pvt Ltd\\Softwares for installation\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://blazedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Navigated to " + driver.getTitle());
				
		FileInputStream fis = new FileInputStream(iFile);
		Properties prop = new Properties();
		prop.load(fis);
		
		Assert.assertEquals(driver.getTitle(),prop.getProperty("Title1"));
		System.out.println("Navigated to " + driver.getTitle());
		
		Select fPort = new Select(driver.findElement(By.name("fromPort")));
		fPort.selectByVisibleText("Boston");
		Thread.sleep(3000);
				
		Select tPort = new Select(driver.findElement(By.name("toPort")));
		tPort.selectByVisibleText("New York");
		
		driver.findElement(By.xpath("/html/body/div[3]/form/div/input")).click();
		System.out.println("Navigated to " + driver.getTitle());
		
		Assert.assertEquals(driver.getTitle(),prop.getProperty("Title2"));
		System.out.println("Navigated to " + driver.getTitle());
		
		
		driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[2]/td[1]/input")).click();
		
		Thread.sleep(2000);
		
		Assert.assertEquals(driver.getTitle(),prop.getProperty("Title3"));
		System.out.println("Navigated to " + driver.getTitle());
		
		driver.findElement(By.id("inputName")).sendKeys(prop.getProperty("FirstName"));
		Thread.sleep(2000);
		driver.findElement(By.id("creditCardNumber")).sendKeys(prop.getProperty("CreditCardNumber"));
		Thread.sleep(2000);
		driver.findElement(By.id("nameOnCard")).sendKeys(prop.getProperty("Nameoncard"));
		Thread.sleep(2000);
		driver.findElement(By.name("rememberMe")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/form/div[11]/div/input")).click();
		
		Assert.assertEquals(driver.getTitle(),prop.getProperty("Title4"));
		System.out.println("Navigated to " + driver.getTitle());
		
		String Amount = driver.findElement(By.xpath("/html/body/div[2]/div/table/tbody/tr[3]/td[2]")).getText();
		System.out.println("Amount - " + Amount);
		
		String CardNum = driver.findElement(By.xpath("/html/body/div[2]/div/table/tbody/tr[4]/td[2]")).getText();
		System.out.println("Card Number - " + CardNum);
		
		String ExpDate = driver.findElement(By.xpath("/html/body/div[2]/div/table/tbody/tr[5]/td[2]")).getText();
		System.out.println("Card Number - " + ExpDate);
		
		
	}
	
	@AfterTest
	public void BlazeClose()
	{
		driver.close();
	}
	
}
	

