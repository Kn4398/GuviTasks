package com.task5;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(XSSFWorkbook workbook = new XSSFWorkbook()){;
		Sheet sheet = workbook.createSheet("Sheet1");
		Object[][] data = {
				{"Name", "Age", "Email"},
				{"John Doe", 30, "john@test.com"},
				{"Jane Doe", 28, "john@test.com"},
				{"Bob Smith", 35, "jacky@example.com"},
				{"Swapnil", 37, "swapnil@example.com"},
		};
		int rowNum = 0;
		for(Object[] rowdata:data) {
			Row row = sheet.createRow(rowNum++);
			int colNum = 0;
			for(Object field:rowdata) {
				Cell cell = row.createCell(colNum++);
				if(field instanceof String)
					cell.setCellValue((String)field);
				else if(field instanceof Integer)
					cell.setCellValue((Integer)field);
				
			}
		}
		try(FileOutputStream os = new FileOutputStream("Test.xlsx")){
			workbook.write(os);
		}
		System.out.println("Data Added");
		
	}
		catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}
	
