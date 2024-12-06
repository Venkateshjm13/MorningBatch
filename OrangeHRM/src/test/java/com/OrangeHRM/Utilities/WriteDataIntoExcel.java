package com.OrangeHRM.Utilities;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.OrangeHRM.GenericScripts.ApplicationConstants;

public class WriteDataIntoExcel implements ApplicationConstants{

		static XSSFWorkbook book;
		static XSSFSheet sheet;
		static XSSFRow row1;
		static XSSFCell cel1;
	
	public static void CreateSheet(String SheetName) throws IOException
	{
		book=new XSSFWorkbook();
		sheet = book.createSheet(SheetName);
	}
	
	public static XSSFSheet AccessSheet(String SheetName) {
		XSSFSheet AccessedSheet = book.getSheet(SheetName);
		return AccessedSheet;
	}
	public static void CreateRow(String SheetName,int Row) throws IOException
	{
		sheet = book.getSheet(SheetName);
		row1=sheet.createRow(Row);
	}
	
	//-----------------
	public static void GetRow(String SheetName,int Row) {
		sheet = book.getSheet(SheetName);
		row1=sheet.getRow(Row);
		
	}
	public static void GetCell(String SheetName,int Row,int cel) {
		sheet = book.getSheet(SheetName);
		row1=sheet.getRow(Row);
		row1.getCell(cel);
		
	}
	
	public static void SetCellVal(String SheetName,int Row,int cel,String celVal) {
		sheet = book.getSheet(SheetName);
		row1 = sheet.getRow(Row);
		cel1 = row1.getCell(cel);
		cel1.setCellValue(celVal);
	}
	//----------------------
	public static void CreateCel(String SheetName,int Row,int Cell) throws IOException
	{
		sheet = book.getSheet(SheetName);
		row1=sheet.createRow(Row);
		cel1=row1.createCell(Cell);
		
	}
	public static void WriteValue(String SheetName,int Row,int Cell,String Val) throws IOException {
		sheet = book.getSheet(SheetName);
		row1=sheet.createRow(Row);
		cel1=row1.createCell(Cell);
		cel1.setCellValue(Val);
		FileOutputStream fos=new FileOutputStream(ExcelPath+"Credentials123.xlsx");
		book.write(fos);
		fos.close();
		cel1.setCellValue(Val);
	}
	}


