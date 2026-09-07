package com.google.gmail;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class test2 {

	public static void main(String[] args) throws Exception {
		// launch chrome driver
		
		RemoteWebDriver driver=new ChromeDriver();
		
		// enter url 
         driver.get("https://www.facebook.com");
         
         // wait 5 sec
         Thread.sleep(5000);
         
         // maximize
         
           driver.manage().window().maximize();
           
           //wait
           
           Thread.sleep(10000);
           
           // get current url
           
           String x= driver.getCurrentUrl();
           System.out.println(x);
           // get title
           String y= driver.getTitle();
           System.out.println(y);
           
           // locate element
           driver.findElement(By.name("email")).sendKeys("cinemacelebs.com");
           // wait 10 sec
           Thread.sleep(10000);
           // close 
           driver.close();
           
           
         
	}

}
