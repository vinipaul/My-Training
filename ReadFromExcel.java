package com.obsqura.mavenexercises;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadFromExcel {

	public static void main(String[] args)throws Exception {
		//File file=new File("F:/vini java/Amount.xlsx");
		File file=new File("F:\\vini java\\PageObjectModel\\src\\main\\java\\Resources\\testdata.xlsx");
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheetAt(0);
		ArrayList list=new ArrayList();
		Iterator<Row> itr=sheet.iterator();
		while(itr.hasNext()) {
			Row row=itr.next();
			Iterator<Cell> celliter=row.cellIterator();
			while(celliter.hasNext()) {
				Cell cell = celliter.next();
				switch(cell.getCellType())
						{
					case Cell.CELL_TYPE_STRING :
						list.add(cell.getStringCellValue());
						System.out.print(cell.getStringCellValue()+"\t\t");
						System.out.print("\t");
						break;
					case Cell.CELL_TYPE_NUMERIC:
						list.add(cell.getNumericCellValue());
						System.out.println(cell.getNumericCellValue());
						break;
					
						}
				}
			System.out.println("\n");
		}
		System.out.println(list);
	}
}
