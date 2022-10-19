package Utilities;

import java.io.FileInputStream;


import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ExcelDataProvider {
	
	XSSFWorkbook  wb;
	public  ExcelDataProvider() throws Exception 
	{
	String 	filepath="C:\\Users\\sai\\eclipse-Automation testing\\E-Commerce_project\\Test Data\\Data.xlsx";
		
	//object FileinputStrem
	FileInputStream file=new FileInputStream(filepath);
	 
	//object -XSSWorkStream
	 wb=new XSSFWorkbook(file);
	
	}
	
	public String getStringData(String Sheetname,int row,int cell)
	{
		return  wb.getSheet(Sheetname).getRow(row).getCell(cell).getStringCellValue();
	}
}
