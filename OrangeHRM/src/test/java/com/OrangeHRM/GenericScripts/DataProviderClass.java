package com.OrangeHRM.GenericScripts;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderClass {

	@DataProvider(name="Excel")
	public String[][] ReadData() throws Exception{
		FileInputStream read = new FileInputStream("./TestData/testdata.xlsx");
		XSSFWorkbook book = new XSSFWorkbook(read);
		XSSFSheet sheet = book.getSheet("Sheet1");
			
		int lr = sheet.getLastRowNum();
		System.out.println("Total row" + lr);
		int lc = sheet.getRow(0).getLastCellNum();
		System.out.println("Total cell" + lc);

		
		String[][] arr = new String[lr][lc];
		for(int r=0;r<lr;r++) {
			XSSFRow row = sheet.getRow(r);
			for(int c=0;c<lc;c++) {
				String val = row.getCell(c).getStringCellValue();
				arr[r][c] = val;
			}
		}
		return arr;
		
	}
	
	//@Test(dataProvider="Excel")
	public void Check(String username) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		System.out.println(username);
		
	}
	 
}
