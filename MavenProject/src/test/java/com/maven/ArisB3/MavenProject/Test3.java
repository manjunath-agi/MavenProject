package com.maven.ArisB3.MavenProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;




public class Test3 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\00005232\\OneDrive - Arisglobal software pvt Ltd\\Softwares for installation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mortgagecalculator.org/");
		String pTitle = driver.getTitle();
		System.out.println(pTitle);
		
		driver.findElement(By.id("homeval")).sendKeys("50000000");
		driver.findElement(By.name("param[downpayment]")).sendKeys("10000000");
		driver.findElement(By.id("loanamt")).sendKeys("40000000");
		driver.findElement(By.id("intrstsrate")).sendKeys("4.7");
		driver.findElement(By.name("param[term]")).sendKeys("30");
		driver.findElement(By.name("cal")).click();
		
		String mTMP = driver.findElement(By.xpath("//*[@id=\"calc\"]/form/section/section[2]/div/div/div[1]/div/div/div[4]/div[2]/div/div[1]/div[1]/h3")).getText();
		System.out.println("Total Monthly Payment - "  + mTMP);
		 
		
		driver.close();
		
	}

}
