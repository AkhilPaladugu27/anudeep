package com.findele.xpa;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class findele2 {

	public static void main(String[] args) throws Exception {
		
		//Launch Chrome Driver 
		RemoteWebDriver driver=new ChromeDriver();
        // Enter url
		driver.get("https://www.flipkart.com");
		//maximize the driver window 
		driver.manage().window().maximize();
		//wait 5 sec 
		Thread.sleep(5000);
		//find images
		List<WebElement>l=driver.findElements(By.xpath("//img"));
		System.out.println("total number of images : " + l.size());
		
		//find all frames
		List<WebElement>l2=driver.findElements(By.xpath("//iframe"));
		System.out.println("Total number of frames: " + l2.size());
		
	}

}
