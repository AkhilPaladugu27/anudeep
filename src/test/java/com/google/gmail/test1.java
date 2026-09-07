package com.google.gmail;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class test1 {

	public static void main(String[] args) throws Exception {
		RemoteWebDriver Anudeep=new ChromeDriver();
		Thread.sleep(1000);
		Anudeep.get("https://www.facebook.com");
		Thread.sleep(1000);
		
		String x=Anudeep.getTitle();
		System.out.println(x);
		
		Thread.sleep(1000);
		Anudeep.close();

	}

}
