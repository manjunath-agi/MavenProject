package app_LSMI_104;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.ImplicitlyWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class LaunchLSMI extends base 
	{
	
	  @Test 	
	  public void Login_TestCase001() throws Exception
	  {
		  preplaunch();
		  driver.manage().window().maximize();
		  driver.get(prop.getProperty("URL"));
		  Thread.sleep(2000);
		  WebDriverWait wait = new WebDriverWait(driver, 20);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginForm:j_id_1s")));
		  		  
		  LSMIPOM_Login lsmipom = new LSMIPOM_Login(driver);
		  lsmipom.LoginName().sendKeys(prop.getProperty("LoginName"));
		  lsmipom.PasswordText().sendKeys(prop.getProperty("PWD"));
		  lsmipom.LoginButton().click();
		  
//		  boolean display = lsmipom.LoginSessionAlert().isEnabled();
//		  System.out.println("Confirmation Pop Up Status " + display);,
		   
		  if(lsmipom.LoginSessionAlert().isEnabled()) 
		  {	 
			  System.out.println("Inside IF Condition");
			  System.out.println(lsmipom.LoginSessionAlert().getText());
			  Thread.sleep(5000);
			  lsmipom.ConfirmationYes().click();
			  Thread.sleep(4000);
			  Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"loginForm:j_id_1l\"]/span[2]")).getText(),prop.getProperty("LoginSessionText"));
			  System.out.println("Assert Executed For the Text - " + driver.findElement(By.xpath("//*[@id=\"loginForm:j_id_1l\"]/span[2]")).getText());
			  lsmipom.PasswordText().sendKeys(prop.getProperty("PWD"));
			  Thread.sleep(3000);
			  lsmipom.LoginButton().click(); 
		  }
		  
	  
	  
	  
		  //driver.findElement(By.xpath("//*[@id=\"headerForm:monpanel:dismissTaskId\"]")).click();
		  lsmipom.TaskDismiss().click();
		  Thread.sleep(2000);
		  //driver.findElement(By.xpath("//*[@id=\"mandatoryDialogform:okButton\"]")).submit();
		  lsmipom.TaskDismissOK().click();
		  Thread.sleep(1000);
		  //driver.findElement(By.id("headerForm:monpanel:closeTaskId")).click();
		  lsmipom.TaskClose().click();
		  
	      		  
		  Thread.sleep(1000);
		  driver.close();
		  
	  }

	
	}

