package com.google.gmail;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class wait {

	public static void main(String[] args) {
		// Launch Chrome browser
		RemoteWebDriver qw = new ChromeDriver();
		
		// Get Url
		qw.get("https://www.mindsnotebook.com");
        // wait 10 sec
		qw.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//navigate to back
		qw.navigate().back();
		//navigate to front 
		qw.navigate().forward();
		//switch tab
		qw.switchTo().newWindow(WindowType.TAB);
		//get window handles
		Set <String>s=qw.getWindowHandles();
		//convert to list 
		List<String>l=new ArrayList <String>(s);
		//enter url in new window 
		qw.switchTo().window(l.get(1)).get("https://www.cinemacelebs.com");

	}

}
