package com.testng.prac;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ReadExcelData {

	@Test
	public void readData() throws EncryptedDocumentException, IOException {

		File file = new File("C:\\Users\\Srinath\\Downloads\\Testdata.xlsx");
		FileInputStream inputst = new FileInputStream(file);
		Workbook workbook = WorkbookFactory.create(inputst);
		System.out.println("No of Sheets: "+workbook.getNumberOfSheets());
		Sheet sheet = workbook.getSheet("Sheet1");
		System.out.println("No of Rows: "+sheet.getPhysicalNumberOfRows());
		System.out.println("First Row number : "+sheet.getFirstRowNum());
		System.out.println("Last Row number: "+sheet.getLastRowNum());
		System.out.println("No of columns: "+sheet.getRow(0).getPhysicalNumberOfCells());
		System.out.println("FirstCellNum: "+sheet.getRow(0).getFirstCellNum());
		System.out.println("LastCellNum : "+sheet.getRow(0).getLastCellNum());

		for(int rowindex = sheet.getFirstRowNum(); rowindex <= sheet.getLastRowNum(); rowindex++) {
			for(int colindex = sheet.getRow(rowindex).getFirstCellNum(); colindex<sheet.getRow(rowindex).getLastCellNum(); colindex++) {
				System.out.println(sheet.getRow(rowindex).getCell(colindex).toString());
			}
			System.out.println();
		}

	}

}
