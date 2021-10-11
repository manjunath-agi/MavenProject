package POMImplementation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleHomePage {

	public WebDriver driver;
	
    public GoogleHomePage(WebDriver driver) 
    {
		super();
		this.driver = driver;
	}
		
	By GSearchTextBox = By.name("q");
	By GSearchButton = By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]");
	
	public WebElement SearchText()
	{
		return driver.findElement(GSearchTextBox);
	}
	
	public WebElement Searchbutton()
	{
		return driver.findElement(GSearchButton);
	}
}
