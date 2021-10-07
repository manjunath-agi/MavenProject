package com.maven.ArisB3.MavenProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Scanner;


public class Test5 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\00005232\\OneDrive - Arisglobal software pvt Ltd\\Softwares for installation\\chromedriver.exe");

		System.out.println("Website you want to launch");
		System.out.println("1 - LinkedIn | 2 - Facebook | 3 - Google | 4 - ArisGlobal");
		
		int browser = new Scanner(System.in).nextInt();
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
					
		switch(browser) {
		case 1:
			driver.get("https://www.linkedin.com/");
				break;
		case 2: 		
			driver.get("https://www.facebook.com/");
				break;
		case 3: 		
			driver.get("http://www.google.com/");
				break;
		case 4:
			driver.get("http://www.arisglobal.com/");
		    	break;
		}
		
	}
	
}
