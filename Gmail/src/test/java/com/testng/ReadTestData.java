package com.testng;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ReadTestData {
	@Test
	public void readData() throws Exception {
		File file = new File("C:\\Users\\Srinath\\Downloads\\Testdata.xlsx");
		FileInputStream inputStream = new FileInputStream(file);
		Workbook workbook = WorkbookFactory.create(inputStream);
		System.out.println("No of sheets: "+workbook.getNumberOfSheets());
		Sheet sheet = workbook.getSheet("sheet1");
		System.out.println("No of Rows: "+sheet.getPhysicalNumberOfRows());
		System.out.println("First Row number : "+sheet.getFirstRowNum());
		System.out.println("Last row number: "+sheet.getLastRowNum());
		System.out.println("No of columns :"+sheet.getRow(0).getPhysicalNumberOfCells());
		System.out.println("First Cell number: "+sheet.getRow(0).getFirstCellNum());
		System.out.println("Last cell number: "+sheet.getRow(0).getLastCellNum());
		
	}
}
