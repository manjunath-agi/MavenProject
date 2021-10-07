package com.maven.ArisB3.MavenProject;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class MVNTest5 {
 
  
	
  @BeforeTest
  public void Launchcomment()
  {
		System.out.println("Launching the Browser");
  }
  
  @AfterTest
  public void Closecomment() throws InterruptedException
  {
		System.out.println("Closed the Browser");
		Thread.sleep(10000);
		
  }
}