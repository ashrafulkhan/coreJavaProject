package testNGBase;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFileReaderClass {
	/**
	 * projectPathString = System.getProperty("user.dir"); 
	 * workbook = new XSSFWorkbook(projectPathString + "/xlfolder/sheet1.xlsx");
	 * XSSFSheet  sheet =workbook.getSheet("sheet1");
	 * @param excelPath
	 * @param sheetName
	 */

	public ExcelFileReaderClass(String excelPath, String sheetName) {
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

	public static int  getRowCount() {
		int rowCount=0;
		try {

			rowCount = sheet.getPhysicalNumberOfRows();
			//System.out.println("No of rows:" + rowCount);

		} catch (Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
        return rowCount;
	}

	public static int getColCount() {
		int celCount =0;
		try {
			celCount = sheet.getRow(0).getPhysicalNumberOfCells();
			//System.out.println("No of col:" +celCount);

		} catch (Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		return celCount;
	}

	public static String getCellDataString(int rowNum, int colNum) {
		String cellData = null;
		try {
			/*
			 * projectPathString = System.getProperty("user.dir"); workbook = new
			 * XSSFWorkbook(projectPathString + "/xlfolder/sheet1.xlsx"); sheet =
			 * workbook.getSheet("sheet1");
			 */
			cellData = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
			//System.out.println( cellData);
		} catch (Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
        return cellData;
	}

	public static void getCellDataNumeric(int rowNum, int colNum) {
		try {
			/*
			 * projectPathString = System.getProperty("user.dir"); workbook = new
			 * XSSFWorkbook(projectPathString + "/xlfolder/sheet1.xlsx"); sheet =
			 * workbook.getSheet("sheet1");
			 */
			double cellData = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
			//System.out.println(cellData);

		} catch (Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}

	}

}
