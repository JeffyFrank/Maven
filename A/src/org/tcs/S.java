package org.tcs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String t = driver.getTitle();
		System.out.println(t);
		WebElement e = driver.findElement(By.id("email"));
		e.sendKeys("he@123");
		WebElement p = driver.findElement(By.id("pass"));
		p.sendKeys("oqwe");
		WebElement bLog = driver.findElement(By.name("login"));
		bLog.click();
	
		//driver.quit();
		
	}
	
	
}
