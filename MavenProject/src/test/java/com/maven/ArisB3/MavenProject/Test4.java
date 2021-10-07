package com.maven.ArisB3.MavenProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class Test4 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\00005232\\OneDrive - Arisglobal software pvt Ltd\\Softwares for installation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.linkedin.com/");
		driver.findElement(By.name("session_key")).sendKeys("abc");
		driver.findElement(By.name("session_password")).sendKeys("XYSFDJB");
		driver.findElement(By.xpath("//*[@id=\"main-content\"]/section[1]/div[2]/form/div[2]/div[2]/button")).click();
		System.out.println("It has navigated to " + driver.getTitle());
		driver.findElement(By.xpath("//*[@id=\"main-content\"]/section[1]/div[2]/form/a")).click();
		System.out.println("It has navigated to " + driver.getTitle());
		driver.findElement(By.xpath("//*[@id=\"app__container\"]/header/div/div/nav/a[2]")).click();
		System.out.println("It has navigated to " + driver.getTitle());
		driver.close();
		
	}

}
