package com.bridgelabz.hybridFramwork.configuration;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * Purpose : For getting data from external resource 
 * 
 * @author Nikunj Balar
 *
 */
public class ExcelConfiguration {

	XSSFWorkbook workbook;
	XSSFSheet sheet;

	// to configure excel file
	public void configExcelSheet(String path) {
		try {
			File file = new File(path);
			FileInputStream fileInputStream = new FileInputStream(file);
			workbook = new XSSFWorkbook(fileInputStream);
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}
	
	// function for getting size of file (row)
	public int size(int sheetIndex) {
		int numberOfRow = (workbook.getSheetAt(sheetIndex).getLastRowNum())+1;
		return numberOfRow;
	}
	
	// function for getting the content of the cell
	public String getDetails(int sheetIndex , int row , int column) {
		sheet =  workbook.getSheetAt(sheetIndex);
		String details= sheet.getRow(row).getCell(column).getStringCellValue();
		return details;
	}
}
