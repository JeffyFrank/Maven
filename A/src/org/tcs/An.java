package org.tcs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class An {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String t = driver.getTitle();
		System.out.println(t);
		WebElement txt = driver.findElement(By.xpath("//a[text()='Create a Page']"));
		String tN = txt.getText();
		System.out.println(tN);
		String tag = txt.getTagName();
		System.out.println(tag);
		WebElement tv = driver.findElement(By.xpath("//h2[contains(text(),'connect')]"));
		String ctv = tv.getText();
		System.out.println(ctv);
		
	
		//driver.quit();
		
	}
	
	
}
