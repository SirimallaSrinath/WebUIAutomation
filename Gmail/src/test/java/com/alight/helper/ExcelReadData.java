package com.alight.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.commons.lang3.ObjectUtils;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReadData {

	public static String[][] ReadData(String filepath, String sheetname) throws Exception {

		File file = new File(filepath);
		FileInputStream inputstream  = new FileInputStream(file);
		Workbook workbook = WorkbookFactory.create(inputstream);
		Sheet sheet = workbook.getSheet(sheetname);

		String[][] data = new String[sheet.getPhysicalNumberOfRows()-1][sheet.getRow(0).getPhysicalNumberOfCells()];

		for(int rowindex = sheet.getFirstRowNum()+1;rowindex<=sheet.getLastRowNum();rowindex++) {
			for(int colindex = sheet.getRow(rowindex).getFirstCellNum();colindex<sheet.getRow(rowindex).getLastCellNum();colindex++) {
				if(ObjectUtils.isNotEmpty(sheet.getRow(rowindex).getCell(colindex))) {
					data[rowindex-1][colindex] = sheet.getRow(rowindex).getCell(colindex).toString();	
				}
				else{
					data[rowindex-1][colindex] = null;
				}

			}
		}
		workbook.close();
		return data;
	}

}
