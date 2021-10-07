package com.maven.ArisB3.MavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.Interaction;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\00005232\\OneDrive - Arisglobal software pvt Ltd\\Softwares for installation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.mortgagecalculator.org");
		Thread.sleep(3000);
		
	    Select select = new Select(driver.findElement(By.name("param[start_month]")));
		select.selectByIndex(3);
		Thread.sleep(5000);
		select.selectByIndex(6);
		select.selectByVisibleText("Dec");
		Thread.sleep(5000);
		
		for (int i=0;i<11;i++)
		{
			String month = driver.findElements(By.name("param[start_month]")).get(i).getText();
			System.out.println(month);
		
		}
		
		driver.close();
	}
		
}


