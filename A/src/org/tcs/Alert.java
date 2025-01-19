package org.tcs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
	public static void main(String[] args) throws InterruptedException { //exceptions for thread.sleep
		WebDriver d = new ChromeDriver();
		d.get("https://demo.automationtesting.in/Alerts.html");
		d.manage().window().maximize();
		
	WebElement f = d.findElement(By.xpath("//button[@class='btn btn-danger']"));	//a[@class='analystic']
	f.click();
	//to switch alert
	org.openqa.selenium.Alert al = d.switchTo().alert();
	Thread.sleep(3000); //wait for 3sec
	//al.accept();
	al.dismiss(); //how its working  
	}

}
