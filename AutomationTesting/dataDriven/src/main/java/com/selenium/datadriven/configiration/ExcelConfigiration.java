package com.selenium.datadriven.configiration;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelConfigiration {

	XSSFWorkbook workbook;
	XSSFSheet sheet;

	public void configExcelSheet(String path) {
		try {
			File file = new File(path);
			FileInputStream fileInputStream = new FileInputStream(file);
			workbook = new XSSFWorkbook(fileInputStream);
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}
	
	public int size(int sheetIndex) {
		int numberOfRow = (workbook.getSheetAt(sheetIndex).getLastRowNum())+1;
		return numberOfRow;
	}
	
	public String getDetails(int sheetIndex , int row , int column) {
		sheet =  workbook.getSheetAt(sheetIndex);
		String details= sheet.getRow(row).getCell(column).getStringCellValue();
		return details;
	}
}
