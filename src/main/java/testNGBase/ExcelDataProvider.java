package testNGBase;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDataProvider {
	/**
	 * first row(0) is header, actual data start from row(1) so loop start from 1.
	 * for loop start from 1, but object array start index from 0, that why i-1;
	 * 
	 * @param args
	 */

	/*
	 * public static void main(String[] args) { String excelPath=
	 * "/Users/mdislam/Documents/Eclipsess/coreJavaProject/xlfolder/sheet1.xlsx";
	 * testData(excelPath, "sheet1"); }
	 */
	
	@Test(dataProvider="testData")
	public void test1(String username, String password) {
		System.out.println(username + " | "+password);
	}

	@DataProvider(name = "testData")
	public Object[][] getData() {
		String excelPath = "/Users/mdislam/Documents/Eclipsess/coreJavaProject/xlfolder/sheet1.xlsx";
		Object data[][] = testData(excelPath, "sheet1");
		return data;
	}

	public Object[][] testData(String excelPath, String sheetNamae) {
		ExcelFileReaderClass excel = new ExcelFileReaderClass(excelPath, sheetNamae);
		int rowCount = excel.getRowCount();
		int colCount = excel.getColCount();

		Object data[][] = new Object[rowCount - 1][colCount];

		for (int i = 1; i < rowCount; i++) { // first row(0) is header, actual data start from row(1) so loop start from
												// 1.

			for (int j = 0; j < colCount; j++) {
				String cellData = excel.getCellDataString(i, j);
				System.out.print(cellData + " | ");
				data[i - 1][j] = cellData;
				// for loop start from 1, but object array start index from 0, that why i-1;
			}
			System.out.println();
		}
		return data;
	}
}
