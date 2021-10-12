package POMImplementation;

//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class Google {
 
 @Test
 public void SearchStatistics() 
  { 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\00005232\\OneDrive - Arisglobal software pvt Ltd\\Softwares for installation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		

		GoogleHomePage GHP = new GoogleHomePage(driver);
		GHP.SearchText().sendKeys("Aris Global");
		GHP.Searchbutton().click();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		GoogleSearchPage GSP = new GoogleSearchPage(driver);
		String Stat = GSP.SearchStats().getText();
		System.out.println(Stat);
		driver.close();
			
   }
  
 
}
