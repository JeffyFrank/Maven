package org.tcs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ana {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.instagram.com/");
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String t = driver.getTitle();
		System.out.println(t);
		//WebElement e = driver.findElement(By.className("_aa4b _add6 _ac4d _ap35"));//?
		WebElement e = driver.findElement(By.name("username"));//?

		e.sendKeys("he@123");
		String attribute = e.getAttribute("value");
		System.out.println(attribute);
	}}