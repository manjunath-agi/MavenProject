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

public class Assessment extends base {

	public static FileInputStream fis;
	
	
	@Test
	public void Blaze() throws InterruptedException, IOException 
	{
		
		CallBrowser();		
		driver.get(prop.getProperty("URL"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//System.out.println("Navigated to " + driver.getTitle());
				
		Assert.assertEquals(driver.getTitle(),prop.getProperty("Title1"));
		System.out.println("Assertion Passed - Navigated to " + driver.getTitle());
		
		Thread.sleep(3000);
		
		Select fromPort = new Select(driver.findElement(By.name("fromPort")));
		fromPort.selectByVisibleText("Boston");
		
				
		Select tPort = new Select(driver.findElement(By.name("toPort")));
		tPort.selectByVisibleText("New York");
		
		//driver.findElement(By.xpath("/html/body/div[3]/form/div/input")).click();
		HomePageObjectFile HPOF = new HomePageObjectFile(driver);
		HPOF.FindFlightsBTN().click();
		
		//System.out.println("Assertion Passed - Navigated to " + driver.getTitle());
		
		Assert.assertEquals(driver.getTitle(),prop.getProperty("Title2"));
		System.out.println("Assertion Passed - Navigated to " + driver.getTitle());
		
		
		//driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[2]/td[1]/input")).click();
		ReservePageObjectFile RPOF = new ReservePageObjectFile(driver);
		RPOF.ChooseThisFlight().click();
		Thread.sleep(2000);
		
		Assert.assertEquals(driver.getTitle(),prop.getProperty("Title3"));
		System.out.println("Assertion Passed - Navigated to " + driver.getTitle());
		
		//driver.findElement(By.id("inputName")).sendKeys(prop.getProperty("FirstName"));
		PurchasePageObjectFile PPOF = new PurchasePageObjectFile(driver);
		PPOF.FirstName().sendKeys(prop.getProperty("FirstName"));
		
		Thread.sleep(2000);
		
		//driver.findElement(By.id("creditCardNumber")).sendKeys(prop.getProperty("CreditCardNumber"));
		PPOF.CreditCardNumber().sendKeys(prop.getProperty("CreditCardNumber"));
		Thread.sleep(2000);
		
		//driver.findElement(By.id("nameOnCard")).sendKeys(prop.getProperty("Nameoncard"));
		PPOF.NameOnCard().sendKeys(prop.getProperty("Nameoncard"));
		Thread.sleep(2000);
		
		//driver.findElement(By.name("rememberMe")).click();
		PPOF.RememberMeChkBox().click();
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("/html/body/div[2]/form/div[11]/div/input")).click();
		PPOF.PurchaseFlightBtn().click();
		
		
		Assert.assertEquals(driver.getTitle(),prop.getProperty("Title4"));
		System.out.println("Assertion Passed - Navigated to " + driver.getTitle());
		
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
	

