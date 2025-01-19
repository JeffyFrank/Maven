package org.tcs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drag {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		//WebElement bank = driver.findElement(By.className("block14 ui-draggable"));		
		//WebElement acnt = driver.findElement(By.className("field14 ui-droppable ui-sortable"));
		WebElement bank = driver.findElement(By.id("credit2"));		
		WebElement acnt = driver.findElement(By.id("bank"));
		Actions act= new Actions(driver);
		act.dragAndDrop(bank, acnt).perform();

		
		
		
	}}