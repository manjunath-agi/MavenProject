package com.maven.ArisB3.MavenProject;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class MVNTest7 {

	public WebDriver driver;
	
	@Test(groups = "{R1}")
 		public void OpenAmazon()
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\00005232\\OneDrive - Arisglobal software pvt Ltd\\Softwares for installation\\chromedriver.exe");
    driver=new ChromeDriver();
	driver.get("http://www.amazon.in");
	System.out.println(driver.getTitle());
	driver.close();
	}
 
}

	