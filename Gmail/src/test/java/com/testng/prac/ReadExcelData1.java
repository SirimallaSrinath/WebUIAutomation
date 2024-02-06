package com.testng.prac;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ReadExcelData1 {
	
	@Test
	public void excelDataRead() throws EncryptedDocumentException, IOException {
		File file = new File("C:\\Users\\Srinath\\Downloads\\Testdata.xlsx");
		FileInputStream inputstream = new FileInputStream(file);
		Workbook workbook = WorkbookFactory.create(inputstream);
		Sheet sheet = workbook.getSheet("Sheet1");
		int RowFirst = sheet.getFirstRowNum();
		int RowLast = sheet.getLastRowNum();
		int ColumnFirst = sheet.getRow(RowFirst).getFirstCellNum();
		int ColumnLast =  sheet.getRow(RowFirst).getLastCellNum();
		
		for(int rowindex = RowFirst;rowindex<=RowLast;rowindex++) {
			for(int colindex =ColumnFirst;colindex<ColumnLast;colindex++) {
				System.out.println(sheet.getRow(rowindex).getCell(colindex).toString());
			}
			System.out.println();
		}
		
		sheet.getRow(0).createCell(5).setCellValue("Status");
		sheet.getRow(1).createCell(5).setCellValue("PASS");
		sheet.getRow(2).createCell(5).setCellValue("Fail");
		workbook.write(new FileOutputStream(file));
		workbook.close();
	}

}
