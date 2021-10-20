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

public class LSMIPOM_Login
	{
		public WebDriver driver;

		public LSMIPOM_Login(WebDriver driver) 
		{
			super();
			this.driver = driver;
		}
		
	By LoginName = By.id("loginForm:username");
	By PasswordText = By.id("loginForm:password");
	By LoginButton = By.id("loginForm:signInButtonvisible");
	By LoginSessionAlert = By.className("ui-dialog-title");
	By ConfirmationYes = By.id("loginForm:confirmation_yes");
	By TaskDismiss = By.xpath("//*[@id=\"headerForm:monpanel:dismissTaskId\"]");
	By TaskDismissOK = By.xpath("//*[@id=\"mandatoryDialogform:okButton\"]");
	By TaskClose = By.id("headerForm:monpanel:closeTaskId");
	
	

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
	
	public WebElement LoginSessionAlert()
	{
		return driver.findElement(LoginSessionAlert);
	}
	
	public WebElement ConfirmationYes()
	{
		return driver.findElement(ConfirmationYes);
	}
	
	public WebElement TaskDismiss()
	{
		return driver.findElement(TaskDismiss);
	}
	
	public WebElement TaskDismissOK()
	{
		return driver.findElement(TaskDismissOK);
	}
	
	public WebElement TaskClose()
	{
		return driver.findElement(TaskClose);
	}
	
}

