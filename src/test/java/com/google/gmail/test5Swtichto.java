package com.google.gmail;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class test5Swtichto {

	public static void main(String[] args) throws Exception {
		//Launch Chrome Browser
		RemoteWebDriver Anu=new ChromeDriver();
		//enter URL
		Anu.get("https://www.mindsnotebook.com");
		//maximize the window
		Anu.manage().window().maximize();
		/*
		 * // Wait 5 sec Thread.sleep(5000);
		 */
		//Switch TO New tab
		Anu.switchTo().newWindow(WindowType.TAB);
		//get Window Handles
		Set <String>Akhil=Anu.getWindowHandles();
		List <String>Usha=new ArrayList <String>(Akhil);
		//Enter Url in New tab
		Anu.switchTo().window(Usha.get(1)).get("https://www.cinemacelebs.com");
		Anu.switchTo().newWindow(WindowType.TAB);
		
		//get Window Handles
				Set <String>Akhil1=Anu.getWindowHandles();
				List <String>Usha1=new ArrayList <String>(Akhil1);
		Anu.switchTo().window(Usha1.get(2)).get("https://www.amazon.com");
		Anu.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone",Keys.ENTER);
		
		
		
		
		
	}

}
