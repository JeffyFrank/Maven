package org.tcs;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excl {
	public static void main(String[] args) throws IOException {
		
		//excel location
		File exlLoc=new File("C:\\Users\\arthu\\eclipse-workspacejavaselenium\\MavenDec\\Excel\\Sample for Selenium.xlsx");
		
		// file object to java object
		FileInputStream s= new FileInputStream(exlLoc);
		
		//to initialize the work
		Workbook w=new XSSFWorkbook(s);
		
		// to get the sheet from the workbook
		Sheet s1 = w.getSheet("Sheet1");
		//w.getSheet("Sheet1");
		
		//to get row from the sheet
		Row r = s1.getRow(3);
		
		Cell c = r.getCell(1);
		System.out.println(c);
	}

}
