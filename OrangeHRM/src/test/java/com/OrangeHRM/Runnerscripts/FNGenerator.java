package com.OrangeHRM.Runnerscripts;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.testng.annotations.Test;

import com.OrangeHRM.GenericExcelUtility.AccessMethods;
import com.OrangeHRM.GenericExcelUtility.CreateMethods;
import com.OrangeHRM.Utilities.WriteDataIntoExcel;

public class FNGenerator {

//	@Test
//	public void Excel() throws IOException {
//		WriteDataIntoExcel.CreateSheet("Credentials");
//		WriteDataIntoExcel.CreateRow("Credentials", 0);
//		
//		for(int r=0;r<6;r++) {
//			for(int c=0;c<6;c++) {
//				WriteDataIntoExcel.CreateCel("Credentials", 0, c);
//				WriteDataIntoExcel.WriteValue("Credentials", 0, c,"admin");
//			}
//		}
////		WriteDataIntoExcel.CreateCel("Credentials", 0, 0);
////		WriteDataIntoExcel.WriteValue("Credentials", 0, 0,"admin");000000000000000000000000
//		System.out.println("Data is written");
//	}
	
	@Test
	public void Excel() throws IOException {
		CreateMethods.CreateSheet("Credentials");
		//XSSFRow row = AccessMethods.AccessSheet("Credentials").createRow(10);
		for(int r=0;r<10;r++) {
		    AccessMethods.AccessSheet("Credentials").createRow(r);
			CreateMethods.CreateCel("Credentials",r,0);
			CreateMethods.WriteCellValue("Credentials",r,0,"name");
	}
	}

 
}
