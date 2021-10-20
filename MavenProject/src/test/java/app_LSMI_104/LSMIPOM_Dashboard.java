package app_LSMI_104;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class LSMIPOM_Dashboard
	{
		public WebDriver driver;

		public LSMIPOM_Dashboard(WebDriver driver) 
		{
			super();
			this.driver = driver;
		}
		
	By LoginName = By.id("loginForm:username");
	By PasswordText = By.id("loginForm:password");
	By LoginButton = By.id("loginForm:signInButtonvisible");
	

	public WebElement LoginName()
	{
		return driver.findElement(LoginName);
	}
	
	public WebElement PasswordText()
	{
		return driver.findElement(PasswordText);
	}
	
	public WebElement LoginButton()
	{
		return driver.findElement(LoginButton);
	}
	
}

