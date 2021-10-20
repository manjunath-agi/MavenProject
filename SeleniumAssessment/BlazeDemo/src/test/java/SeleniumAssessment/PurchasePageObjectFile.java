package SeleniumAssessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PurchasePageObjectFile {

	private WebDriver driver;

	public PurchasePageObjectFile(WebDriver driver) 
	{
		super();
		this.driver = driver;
	}

	By FirstName = By.id("inputName");
	By CreditCardNumber = By.id("creditCardNumber");
	By NameOnCard = By.id("nameOnCard");
	By RememberMeChkBox = By.name("rememberMe");
	By PurchaseFlightBtn = By.xpath("/html/body/div[2]/form/div[11]/div/input");
	
	public WebElement FirstName()
	{
		return driver.findElement(FirstName);
	}
	
	public WebElement CreditCardNumber()
	{
		return driver.findElement(CreditCardNumber);
	}
	
	public WebElement NameOnCard()
	{
		return driver.findElement(NameOnCard);
	}
	
	public WebElement RememberMeChkBox()
	{
		return driver.findElement(RememberMeChkBox);
	}
	
	public WebElement PurchaseFlightBtn()
	{
		return driver.findElement(PurchaseFlightBtn);
	}
	
	
}
	
	

