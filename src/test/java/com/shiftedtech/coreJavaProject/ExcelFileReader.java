package com.shiftedtech.coreJavaProject;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFileReader {
	/**
	 * projectPathString = System.getProperty("user.dir"); 
	 * workbook = new XSSFWorkbook(projectPathString + "/xlfolder/sheet1.xlsx");
	 * XSSFSheet  sheet =workbook.getSheet("sheet1");
	 * @param excelPath
	 * @param sheetName
	 */

	public ExcelFileReader(String excelPath, String sheetName) {
		try {
			// projectPathString = System.getProperty("user.dir");
			workbook = new XSSFWorkbook(excelPath); // dynamic purpose we use this way.
			sheet = workbook.getSheet(sheetName); // avoid hardCoded every time to give path and sheetName
		} catch (Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}

	}

	static String projectPathString;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;

	public static void main(String[] args) {

		getCellDataString(0, 0);
		getCellDataNumeric(1, 1);
	}

	public static void getRowCount() {
		try {

			int rowCount = sheet.getPhysicalNumberOfRows();
			System.out.println("No of rows:" + rowCount);

		} catch (Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}

	}

	public static void getColCount() {
		try {
			int celCount = sheet.getRow(0).getPhysicalNumberOfCells();
			System.out.println("No of Cell is : " + celCount);

		} catch (Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
	}

	public static void getCellDataString(int rowNum, int colNum) {
		try {
			/*
			 * projectPathString = System.getProperty("user.dir"); workbook = new
			 * XSSFWorkbook(projectPathString + "/xlfolder/sheet1.xlsx"); sheet =
			 * workbook.getSheet("sheet1");
			 */
			String cellData = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
			System.out.println("Cell data is : " + cellData);
		} catch (Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}

	}

	public static void getCellDataNumeric(int rowNum, int colNum) {
		try {
			/*
			 * projectPathString = System.getProperty("user.dir"); workbook = new
			 * XSSFWorkbook(projectPathString + "/xlfolder/sheet1.xlsx"); sheet =
			 * workbook.getSheet("sheet1");
			 */
			double cellData = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
			System.out.println("Cell data is : " + cellData);

		} catch (Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}

	}

}
