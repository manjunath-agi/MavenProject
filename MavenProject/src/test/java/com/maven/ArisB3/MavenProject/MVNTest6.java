package com.maven.ArisB3.MavenProject;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class MVNTest6 {

	public WebDriver driver;
	
	@Test(groups = {"R1"})
 	@Parameters({"fbURL"})
	public void OpenFB(String fbURL)
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\00005232\\OneDrive - Arisglobal software pvt Ltd\\Softwares for installation\\chromedriver.exe");
    driver=new ChromeDriver();
	driver.get(fbURL);
	System.out.println(driver.getTitle());
	driver.close();
	}
 
}

	