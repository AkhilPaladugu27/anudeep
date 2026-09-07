package com.google.gmail;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class test3 {

	public static void main(String[] args) throws Exception {
		
		// Launch Chrome Driver
		RemoteWebDriver Driver=new ChromeDriver();
		
		//maximize the window 
		Driver.manage().window().maximize();
		
		//Wait 5 sec
		Thread.sleep(5000);
		
		//Enter url 
		Driver.get("https://www.facebook.com");
		
		//get Title
		String x= Driver.getTitle();
		System.out.println(x);
		
		//get window handle 
		String y= Driver.getWindowHandle();
		System.out.println(y);
		
		//wait 10 sec 
		Thread.sleep(10000);
		
		//find element using id
		
		Driver.findElement(By.name("email")).sendKeys("Anudeep");
		
		Thread.sleep(10000);
		
		//clear the name and enter new name 
		
		Driver.findElement(By.name("email")).clear();
		Thread.sleep(5000);
		Driver.findElement(By.name("email")).sendKeys("Anudeeppaladugu");
		
		
		//wait 5 sec
		Thread.sleep(5000);
		
		
		// find element using Xpath 
		
		Driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("Akhilsai");
		
		// wait 10 sec
		Thread.sleep(10000);
		
		// find button and click
		
		Driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		//wait 10 sec
		Thread.sleep(10000);
		
		// Close the Browser
		Driver.close();
		

	}

}
