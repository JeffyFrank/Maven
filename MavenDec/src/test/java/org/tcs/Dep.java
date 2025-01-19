package org.tcs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dep {
	public static void main(String[] args) {
		WebDriver d= new ChromeDriver();
		d.get("https://www.facebook.com/");
		d.findElement(By.id("email")).sendKeys("sera@12");
		d.findElement(By.id("pass")).sendKeys("waet");
		d.findElement(By.name("login")).click();
		
	}

}
