package genricClasses;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataExcelFile {
	
	public static XSSFSheet LoadFromExcel(String pathOfFile) throws IOException
	{
		File file=new File(pathOfFile);
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet("Sheet2");
		//String str=sheet.getRow(row).getCell(col).toString();
		return sheet;
	}
	
	public static String getDataFromExcel(int row,int col, String pathOfFile) throws IOException
	{
		File file=new File(pathOfFile);
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet("Sheet2");
		String str=sheet.getRow(row).getCell(col).toString();
		return str;
	}
	
	
	
	

	public static void main(String[] args) throws IOException {
	
		File file=new File("C:\\demo\\employee.xlsx");
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet("Sheet1");
		
		
		String str=sheet.getRow(0).getCell(0).toString();
		System.out.println(str);
		
		String str1=sheet.getRow(0).getCell(1).toString();
		System.out.println(str1);
		
		int r=sheet.getLastRowNum();
		System.out.println(r);
		
		int c=sheet.getRow(0).getLastCellNum();
		
		
		for(int i=0;i<=r;i++)
		{
			for(int j=0;j<=c;j++)
			{
//				System.out.println(i +"  "+ j);
				DataFormatter dataFormatter = new DataFormatter();
				String ss=dataFormatter.formatCellValue(sheet.getRow(i).getCell(j));
				System.out.print(ss+ "\t\t");
			}
			System.out.println();
		}
		
		

	}

}
