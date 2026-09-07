package com.findele.xpa;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebDriver;

public class screenshot {

	public static void main(String[] args) throws Exception {
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//input[@name='email']"));
		File desc=new File("C:\\Users\\Anudeep\\Downloads\\pagelevel.png");
		File src=driver.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(desc, src);
	}

}
