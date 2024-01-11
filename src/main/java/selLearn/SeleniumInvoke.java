package selLearn;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumInvoke {
	
	
	public static String getDataExcel(int i,int j) throws IOException
	{
		
		File file=new File("C:\\demo\\employee.xlsx");
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet("Sheet2");
		
		DataFormatter dataFormatter = new DataFormatter();
		String formattedCellStr = dataFormatter.formatCellValue(sheet.getRow(i).getCell(j));
		 
		return formattedCellStr;
		
	}
	
	
	

	public static void main(String[] args) throws IOException {

		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(getDataExcel(3,0));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(getDataExcel(0,0));

		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(getDataExcel(0,1));
		
		
		

	}

}
