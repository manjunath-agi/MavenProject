package com.maven.ArisB3.MavenProject;

import java.util.*;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test11 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\00005232\\OneDrive - Arisglobal software pvt Ltd\\Softwares for installation\\chromedriver.exe");
        WebDriver myD=new ChromeDriver();

         myD.get("http://www.naukri.com/");
 
        // It will return the parent window name as a String
        String parent=myD.getWindowHandle();
        Set<String>s=myD.getWindowHandles();
 
        // Now iterate using Iterator
        Iterator<String> I1= s.iterator();
 
        while(I1.hasNext())
        {
            String child_window=I1.next();
 

            if(!parent.equals(child_window))
            {
            myD.switchTo().window(child_window);
 
            System.out.println(myD.switchTo().window(child_window).getTitle());
            Thread.sleep(3000);
            myD.close();
            }
 
            }
            //switch to the parent window
            myD.switchTo().window(parent);
            Thread.sleep(2000);
            myD.close();


            }




 
    

		
	}

