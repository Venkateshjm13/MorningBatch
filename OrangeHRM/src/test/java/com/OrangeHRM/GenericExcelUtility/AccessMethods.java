package com.OrangeHRM.GenericExcelUtility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.OrangeHRM.GenericScripts.ApplicationConstants;

public class AccessMethods implements ApplicationConstants {

	static XSSFWorkbook book;
	
	public static XSSFSheet AccessSheet(String SheetName) throws IOException {
		
		FileInputStream fis = new FileInputStream(ExcelPath+"Credentials123.xlsx");
		book = new XSSFWorkbook(fis);
		XSSFSheet sheet = book.getSheet(SheetName);
		return sheet;
	}
	
	public static XSSFRow AccessRows(String SheetName,int Row) throws IOException {
		//XSSFRow rows = book.getSheet(SheetName).getRow(Row);
		XSSFRow rows = AccessSheet(SheetName).getRow(Row);
		return rows ;
		
		
	}
	public static XSSFCell AccessCells(String SheetName,int Row,int cel) throws IOException {
		 
		//XSSFCell cel1s= book.getSheet(SheetName).getRow(Row).getCell(0);
		XSSFCell cells = AccessRows(SheetName,Row).getCell(0);
		return cells;
		 
		
	}
	
	public static String AccessCellValue(String SheetName,int Row ,int cel) throws IOException {
		
		//String celValue = book.getSheet(SheetName).getRow(row).getCell(cel).getStringCellValue();
		String celValue = AccessCells(SheetName,Row,cel).getStringCellValue();
		return celValue;
	}
	
	 
	

}
