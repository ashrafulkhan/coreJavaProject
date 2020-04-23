package com.shiftedtech.coreJavaProject;

public class ExcellUtilsDemo {
	/**
	 * we using XLFileReader1.java class a static thats why showing error, we no
	 * need there static keyword we call there using a main method which was static
	 * to provide same access modifier . if we do not use that main then no need use
	 * static keyword there.
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		
		String projectPathString = System.getProperty("user.dir");

		ExcelFileReader xcel = new ExcelFileReader(projectPathString + "/xlfolder/sheet1.xlsx", "sheet1");
		ExcelFileReader.getRowCount();
		ExcelFileReader.getCellDataString(0, 1);
		ExcelFileReader.getCellDataNumeric(1, 1);
		System.out.println("We can Call by className dot methodName or objetName dot methodName");
		xcel.getRowCount();
		xcel.getCellDataString(0, 0);
		xcel.getCellDataNumeric(1, 1);

	}

}
