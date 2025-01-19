package org.tcs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement e = driver.findElement(By.id("email"));
		e.sendKeys("he@123");
		WebElement bt = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		bt.click();
		WebElement btM = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		btM.click();
	}}