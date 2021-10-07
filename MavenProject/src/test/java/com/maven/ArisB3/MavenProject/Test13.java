package com.maven.ArisB3.MavenProject;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import java.util.Scanner;

public class Test13 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\00005232\\OneDrive - Arisglobal software pvt Ltd\\Softwares for installation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		
		int frameCount = driver.findElements(By.tagName("iframe")).size();
		System.out.println(frameCount);
		
		String a = driver.findElement(By.className("entry-title")).getText();
		System.out.println(a);
				
		String b = driver.findElement(By.className("desc")).getText();
		System.out.println(b);
		
		driver.switchTo().frame(0);
		String c = driver.findElement(By.id("draggable")).getText();
		System.out.println(c);
		
		Actions act = new Actions(driver);
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement dest = driver.findElement(By.id("droppable"));
		
		act.dragAndDrop(source, dest).build().perform();
		
		driver.quit();
	
	}
	
}
