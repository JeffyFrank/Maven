package org.tcs;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsExe {
	public static void main(String[] args) {
		WebDriver d= new ChromeDriver();
		d.get("https://www.facebook.com/");
		WebElement usr = d.findElement(By.id("email"));
		JavascriptExecutor js= (JavascriptExecutor)d;
		js.executeScript("arguments[0].setAttribute('value','true@123')", usr);
		WebElement pas = d.findElement(By.id("pass"));
		js.executeScript("arguments[0].setAttribute('value','trueee123')", pas);
		WebElement btn = d.findElement(By.name("login"));
		js.executeScript("arguments[0].click()", btn);
		
		
	}

}
