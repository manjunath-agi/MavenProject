package com.maven.ArisB3.MavenProject;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class MVNTest5 {
 
  //public WebDriver driver;	
	
  @BeforeTest
  public void BTest()
  {
		System.out.println("Launching the Browser");
  }
  
  @AfterTest
  public void ATest() throws InterruptedException
  {
		System.out.println("Closing the Browser");
		Thread.sleep(10000);
		//driver.close();
  }
}