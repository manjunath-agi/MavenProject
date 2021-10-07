//Implicit Wait - Script looks for a hyperlink which is not available
package com.maven.ArisB3.MavenProject;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test14 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\00005232\\OneDrive - Arisglobal software pvt Ltd\\Softwares for installation\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 20);
        driver.get("https://www.gmail.com");
		System.out.println(driver.getTitle());
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Help1")));
		
		driver.findElement(By.linkText("Help1")).click();
		
	}
}
