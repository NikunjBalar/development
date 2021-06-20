package com.nik.ReadDataFromExcel.DTO;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ReadDataFromExcel {
	
	public void readDataFromExcel() {
		try {
			//taken the data from file
			File eFile=new File("D:\\Excel\\studentdetails.xlsx");
			//
			FileInputStream fileInputStream=new FileInputStream(eFile);
			// creating workbook to refer the .xml file
			HSSFWorkbook hwb=new HSSFWorkbook();
		}
		catch(Exception e){
			System.err.println("file input streem throw exception");
		}
	}
}