package utilities;

	import java.io.FileInputStream;
	import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;

	import org.apache.poi.ss.usermodel.Cell;
	import org.apache.poi.ss.usermodel.Row;
	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;

	public class ExcelUtility {
		public static XSSFWorkbook wb;
		public static XSSFSheet sh;
		public static FileInputStream f;

		public static ArrayList<String> getString(String file_path, String sheet) throws IOException {//Method overloading same method name different parameter list
		f = new FileInputStream(file_path);																//only 2 parameter .within same class
		wb = new XSSFWorkbook(f);
		sh = wb.getSheet(sheet);
		ArrayList<String> ExcelRows = new ArrayList<String>();
		int rowCount = sh.getLastRowNum() - sh.getFirstRowNum();
		for (int i = 0; i <= rowCount; i++) {
		Row row = sh.getRow(i);
		int cellCount = row.getLastCellNum();
		for (int j = 0; j < cellCount; j++) {
		ExcelRows.add(row.getCell(j).getStringCellValue());
		}
		}
		
		//f.close();
		return ExcelRows;

		}

		public static ArrayList<String> getRow(String file_path, String sheet, int rownum) throws IOException {
		f = new FileInputStream(file_path);
		wb = new XSSFWorkbook(f);
		sh = wb.getSheet(sheet);
		ArrayList<String> ExcelRows = new ArrayList<String>();
		// int rowCount = sh.getLastRowNum() - sh.getFirstRowNum();

		Row row = sh.getRow(rownum);
		int cellCount = row.getLastCellNum();
		for (int j = 0; j < cellCount; j++) {
		ExcelRows.add(row.getCell(j).getStringCellValue());

		}

		// f.close();
		return ExcelRows;

		}

		public static String getString(int i, int j, String file_path, String sheet) throws IOException {//method overloading same method name parameter list different
		f = new FileInputStream(file_path);																//4 parameter in the method.within same class
		wb = new XSSFWorkbook(f);
		sh = wb.getSheet(sheet);
		Row r = sh.getRow(i);
		Cell c = r.getCell(j);
		return c.getStringCellValue();

		}

		public static String getNumeric(int i, int j, String file_path, String sheet) throws IOException {
		f = new FileInputStream(file_path);
		wb = new XSSFWorkbook(f);
		sh = wb.getSheet(sheet);
		Row r = sh.getRow(i);
		Cell c = r.getCell(j);
		int value = (int) c.getNumericCellValue();
		return String.valueOf(value);

		}  

	}

