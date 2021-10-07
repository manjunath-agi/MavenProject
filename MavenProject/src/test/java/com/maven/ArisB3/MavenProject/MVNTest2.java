package com.maven.ArisB3.MavenProject;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class MVNTest2 {
 
  public WebDriver driver;	

	
  @Test
  public void ATTest()
  {
	System.out.println("2 - @ TEST");  
	driver.getTitle();	
  }
  
  @BeforeTest
  public void BTest()
  {
    System.setProperty("webdriver.chrome.driver","C:\\Users\\00005232\\OneDrive - Arisglobal software pvt Ltd\\Softwares for installation\\chromedriver.exe");
	System.out.println("1 - BEFORE TEST");
    driver=new ChromeDriver();
	driver.get("http://www.google.com");
  }
  
  @AfterTest
  public void ATest()
  {
	  System.out.println("3 - AFTER TEST");
	  driver.close();
  }
  
}
