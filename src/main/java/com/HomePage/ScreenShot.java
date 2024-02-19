package com.HomePage;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {
	public static WebDriver driver;
	
	public static void main(String[] args) throws IOException {
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		
		WebElement button =driver.findElement(By.name(""));
		
		js.executeScript("arguments[0].click()",button);
		
		String text =(String)js.executeScript("return arguments[0].innerText",button);
		
		js.executeScript("console.log('hello world')");
		
		//take screenshort as element
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.example.com");
		
		WebElement element =driver.findElement(By.cssSelector("h1"));
		
		File scrFile =element.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(scrFile, new File("./image.png"));
		driver.quit();
		

	}
}
