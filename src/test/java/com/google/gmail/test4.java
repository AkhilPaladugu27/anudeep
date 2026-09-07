package com.google.gmail;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class test4 {

	public static void main(String[] args) {
		// Launch Chrome Browser
		RemoteWebDriver a =new ChromeDriver();
		
		// enter url 
		a.get("https://www.mindsnotebook.com");
		// switch new tab 
		a.switchTo().newWindow(WindowType.TAB);
		
		//
		
		Set <String>s=a.getWindowHandles();
		List <String>l=new ArrayList<String>(s);
		
		System.out.println(l);
				
		// enter url 
		a.switchTo().window(l.get(1));
		
		

	}

}
