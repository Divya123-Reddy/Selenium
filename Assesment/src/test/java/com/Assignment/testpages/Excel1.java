package com.Assignment.testpages;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Excel1 {
	
	public ArrayList<String> getdata() throws IOException {
		
		FileInputStream fis=new FileInputStream("D:\\Excelsheetdata\\TestData22.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		ArrayList<String> arr=new ArrayList();
		int sheets=workbook.getNumberOfSheets();
		for(int i=0;i<sheets;i++) {
			if(workbook.getSheetAt(i).getSheetName().equalsIgnoreCase("sheet2")) {
				XSSFSheet sheet=workbook.getSheetAt(i);
				Iterator<Row> rows=sheet.rowIterator();
			Row row=rows.next();
			Iterator<Cell> cells=row.cellIterator();
			int k=0;
			int column=0;
			while(cells.hasNext()) {
			if(cells.next().getStringCellValue().equalsIgnoreCase("Testcases")) {
			
			column=k;
			}
			k++;
		
			System.out.println(column);
			}
			while(rows.hasNext()) {
				Row r=rows.next();
				if(r.getCell(column).getStringCellValue().equalsIgnoreCase("Loginpage1")) {
					Iterator<Cell> ce=r.cellIterator();
					while(ce.hasNext()) {
						arr.add(ce.next().getStringCellValue());
//						System.out.println(ce.next().getStringCellValue());
						
		
					}

}}
}
	}
		return arr;
}
	}
	
/*
 * public ArrayList<String> getdata1() throws IOException {
 * 
 * FileInputStream fiss=new
 * FileInputStream("D:\\Excelsheetdata\\TestData22.xlsx"); XSSFWorkbook
 * workbook1=new XSSFWorkbook(fiss); ArrayList<String> arr1=new ArrayList(); int
 * sheets1=workbook1.getNumberOfSheets(); for(int i=0;i<sheets1;i++) {
 * if(workbook1.getSheetAt(i).getSheetName().equalsIgnoreCase("sheet2")) {
 * XSSFSheet sheet1=workbook1.getSheetAt(i); Iterator<Row>
 * rows1=sheet1.rowIterator(); Row row1=rows1.next(); Iterator<Cell>
 * cells1=row1.cellIterator(); int k=0; int column1=0; while(cells1.hasNext()) {
 * if(cells1.next().getStringCellValue().equalsIgnoreCase("Checkoutpage")) {
 * 
 * column1=k; } k++;
 * 
 * System.out.println(column1); } while(rows1.hasNext()) { Row r1=rows1.next();
 * if(r1.getCell(column1).getStringCellValue().equalsIgnoreCase("Loginpage1")) {
 * Iterator<Cell> ce1=r1.cellIterator();
 * if(r1.getCell(column1).getStringCellValue().equalsIgnoreCase("Checkoutpage"))
 * { Iterator<Cell> ce11=r1.cellIterator(); while(ce1.hasNext()) {
 * arr1.add(ce1.next().getStringCellValue()); //
 * System.out.println(ce.next().getStringCellValue());
 * 
 * 
 * }
 * 
 * }} } } } return arr1; } }
 */