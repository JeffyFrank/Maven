package org.tcs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Move {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.greenstechnologys.com/");
		driver.manage().window().maximize();
		WebElement crs = driver.findElement(By.xpath("//a[text()='COURSES']"));
		Actions act= new Actions(driver);
		act.moveToElement(crs).perform();
		WebElement orac = driver.findElement(By.xpath("//span[text()='Oracle Training']"));
		act.moveToElement(orac).perform();
		WebElement sql = driver.findElement(By.xpath("//span[text()='SQL Certification']"));
		act.moveToElement(sql).perform();
		sql.click();

		
		
	}}