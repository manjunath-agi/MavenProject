package com.maven.ArisB3.MavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\00005232\\OneDrive - Arisglobal software pvt Ltd\\Softwares for installation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		int count = driver.findElements(By.tagName("a")).size();
		System.out.println("Count of A-TAGS on GOOGLE home page " + count);
		
		for(int i=0;i<count;i++)
		{
			String name = driver.findElements(By.tagName("a")).get(i).getText();
			System.out.println(name);
		}
		driver.close();	
	}
		
}



