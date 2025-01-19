package org.tcs;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d= new ChromeDriver();
		d.get("https://www.flipkart.com/");
		WebElement t = d.findElement(By.xpath("//a[text()='Brand Directory']"));
		JavascriptExecutor js= (JavascriptExecutor)d;
		js.executeScript("arguments[0].scrollIntoView(true)", t);
		Thread.sleep(2000);

//		js.executeScript("arguments[0].scrollIntoView(false)", t);
//		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0, -200);");

	}

}
