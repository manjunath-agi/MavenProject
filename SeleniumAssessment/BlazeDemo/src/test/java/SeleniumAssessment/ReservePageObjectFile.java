package SeleniumAssessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReservePageObjectFile {

	private WebDriver driver;

	public ReservePageObjectFile(WebDriver driver) 
	{
		super();
		this.driver = driver;
	}

	By ChooseThisFlight = By.xpath("/html/body/div[2]/table/tbody/tr[2]/td[1]/input");
	
	
	public WebElement ChooseThisFlight()
	{
		return driver.findElement(ChooseThisFlight);
	}
	
	
}
	
	

