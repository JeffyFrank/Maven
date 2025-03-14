package org.tcs;

//import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Res {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		//d.get("//https://webdriveruniversity.com/");
		d.get("https://opensource-demo.orangehrmlive.com");
		d.manage().window().maximize();
		//String cl = d.getCurrentUrl();
		//System.out.println(cl);
		//try {
		Thread.sleep(3000);
		WebElement usr = d.findElement(By.xpath("//input[@name='username']"));
		usr.sendKeys("Admina");
		
		WebElement pas = d.findElement(By.xpath("//input[@type='password']"));
		pas.sendKeys("admin123");
		
		//Thread.sleep(4000);
		// } catch (NoSuchElementException e) {
	            // This will catch errors if elements are not found
	        //    System.out.println("Element not found: " + e.getMessage());
	       // } finally {
	            // Quit the browser to clean up
	       //     System.out.println("Closing the browser.");
	           // Thread.sleep(4000);
	            
	            d.quit();
	        //}
	}
}

