package ExcelOpeartions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelOperation {

	public static FileInputStream fp;
	public static Workbook wb;
	public static Sheet sh;
	public static Row rw;
	public static int totalrows = 0;
	public static int totalcell = 0;

	/*
	 * public ExcelOperation() throws IOException {
	 * 
	 * fp = new FileInputStream(new
	 * File("F:\\JulyBatch\\POM-OrangeHRM\\src\\test\\resources\\Data.xlsx"));
	 * 
	 * wb = new XSSFWorkbook(fp); sh = wb.getSheet("Data1");
	 * System.out.println(wb.getSheet("Data1"));
	 * 
	 * }
	 */

	public static void totalRowsandColumns() throws IOException {
		fp = new FileInputStream(new File("F:\\JulyBatch\\POM-OrangeHRM\\src\\test\\resources\\Data.xlsx"));

		wb = new XSSFWorkbook(fp);
		sh = wb.getSheet("Data1");
		System.out.println(wb.getSheet("Data1"));
		totalrows = sh.getLastRowNum();
		rw = sh.getRow(1);
		totalcell = rw.getLastCellNum();

		System.out.println("total rows are " + totalrows);
		System.out.println("total cells are " + totalcell);
	}

	public static Object[][] readdata() throws IOException {
		fp = new FileInputStream(new File("F:\\JulyBatch\\POM-OrangeHRM\\src\\test\\resources\\Data.xlsx"));

		wb = new XSSFWorkbook(fp);
		sh = wb.getSheet("Data1");
		System.out.println(wb.getSheet("Data1"));
		Object[][] obj = new Object[totalrows][totalcell];

		for (int i = 1; i <= totalrows; i++) {
			for (int j = 0; j <= totalcell; j++) {
				System.out.println("inside for loop");
				if (sh.getRow(i).getCell(j).getCellType() == CellType.STRING) {
					obj[i - 1][j] = sh.getRow(i).getCell(j).getStringCellValue();
					System.out.println(sh.getRow(i).getCell(j).getStringCellValue());
				} else {
					obj[i - 1][j] = sh.getRow(i).getCell(j).getNumericCellValue();
					System.out.println(sh.getRow(i).getCell(j).getNumericCellValue());
				}

			}

		}

		return obj;
	}

}
