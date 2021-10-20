package AmazonTest003;

import java.io.FileReader;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class JSONread

	{
	
	String url, name;
	
	JSONParser parser = new JSONParser();
	
	
	@Test
	public void jSonRead() throws IOException, ParseException
	{
		Object obj = parser.parse(new FileReader("C:\\Users\\00005232\\git\\repository\\MavenProject\\data.json"));
		JSONObject jsonObject = (JSONObject) obj;
		
		url = (String) jsonObject.get("URL");
		name = (String) jsonObject.get("Name");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\00005232\\OneDrive - Arisglobal software pvt Ltd\\Softwares for installation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.get(url);
		
		
	}
	
}
