package com.maven.ArisB3.MavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import java.util.Iterator;

import java.util.Scanner;
import java.util.Set;

//import javax.swing.text.html.HTMLDocument.Iterator;

public class Test9 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\00005232\\OneDrive - Arisglobal software pvt Ltd\\Softwares for installation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.gmail.com");
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("Help")).click();
		Set<String> TID = driver.getWindowHandles();
		System.out.println(TID);
		Iterator<String> STAB = TID.iterator();
		String PT = STAB.next();
		String CT = STAB.next();
		driver.switchTo().window(CT);
		System.out.println(driver.getTitle());
		driver.quit();
	}
		
}


