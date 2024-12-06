package com.OrangeHRM.GenericExcelUtility;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.OrangeHRM.GenericScripts.ApplicationConstants;

public class CreateMethods implements ApplicationConstants {
	
	static XSSFWorkbook book;
	static XSSFSheet sheet;

	public static void CreateSheet(String SheetName) throws IOException
	{
		book=new XSSFWorkbook();
		sheet = book.createSheet(SheetName);
		FileOutputStream fos=new FileOutputStream(ExcelPath+"Credentials123.xlsx");
	}
	
	public static void CreateRows(String SheetName,int Row) throws IOException
	{
		sheet = AccessMethods.AccessSheet(SheetName);
		sheet.createRow(Row);
		
	}
	
	public static void CreateCel(String SheetName,int Row,int Cel) throws IOException
	{
		XSSFRow rows =AccessMethods.AccessRows(SheetName,Row);
		rows.createCell(Cel);
		 
		
	}
	
	public static void WriteCellValue(String SheetName,int Row,int Cell,String CelVal) throws IOException {
		XSSFCell cell = AccessMethods.AccessCells(SheetName, Row, Cell);
		cell.setCellValue(CelVal);
		FileOutputStream fos=new FileOutputStream(ExcelPath+"Credentials123.xlsx");
		book.write(fos);
		fos.close();
	}
}
