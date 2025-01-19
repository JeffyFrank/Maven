package org.tcs;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrnsht {
	public static void main(String[] args) throws IOException {
		WebDriver d= new ChromeDriver();
		d.get("https://www.typingclub.com/");
		d.manage().window().maximize();
		TakesScreenshot ts=(TakesScreenshot)d;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		File f = new File("D:\\NEW\\TEXT\\Typing.png");
		FileUtils.copyFile(screenshotAs, f);
}}
