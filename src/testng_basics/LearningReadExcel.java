package testng_basics;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class LearningReadExcel {
	
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		singleRead();
		//multipleRead("Login");
		//objectArray("Login");
	}
	
	public static void singleRead() throws EncryptedDocumentException, IOException
	{
		File file = new File("./Testdata/TestData.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet("Login");
//		Row row = sheet.getRow(2);
//		Cell cell  = row.getCell(1);
//		double value = cell.getNumericCellValue();
//		System.out.println(value);
		DataFormatter data = new DataFormatter();
		String value=data.formatCellValue(sheet.getRow(2).getCell(1));
		System.out.println(value);
	}
	
	public static String stringRead(String sheetname , int row, int col) throws EncryptedDocumentException, IOException
	{
		File file = new File("./Testdata/TestData.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet(sheetname);
		return sheet.getRow(row).getCell(col).toString();
		
	}
	
	public static double numericRead(String sheetname , int row, int col) throws EncryptedDocumentException, IOException
	{
		File file = new File("./Testdata/TestData.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet(sheetname);
		return sheet.getRow(row).getCell(col).getNumericCellValue();
		
	}
	
	public static boolean booleanRead(String sheetname , int row, int col) throws EncryptedDocumentException, IOException
	{
		File file = new File("./Testdata/TestData.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet(sheetname);
		return sheet.getRow(row).getCell(col).getBooleanCellValue();
		
	}
	public static void multipleRead(String sheetname) throws IOException
	{
		File file = new File("./Testdata/TestData.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet(sheetname);
		
		int row = sheet.getPhysicalNumberOfRows();
		int col = sheet.getRow(1).getPhysicalNumberOfCells();
		for(int i=1;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.println(sheet.getRow(i).getCell(j).toString());
			}
		}
		
	}
	
	public static String[][] objectArray(String sheetname) throws IOException
	{
		File file = new File("./Testdata/TestData.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet(sheetname);
		int row = sheet.getPhysicalNumberOfRows();
		int col = sheet.getRow(1).getPhysicalNumberOfCells();
		String[][] data = new String[row-1][col];
		for(int i=1;i<row;i++)//<--row iteration
		{
			for(int j=0;j<col;j++)//<--col-iteration
			{
				data[i-1][j]=sheet.getRow(i).getCell(j).toString();
			}
		}
//		for(int i=0;i<row-1;i++)//<--row iteration
//		{
//			for(int j=0;j<col;j++)//<--col-iteration
//			{
//				System.out.println(dasssta[i][j]);
//			}
//		}
		return data;	
	}

}
