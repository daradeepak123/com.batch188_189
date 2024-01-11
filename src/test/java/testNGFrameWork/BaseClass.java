package testNGFrameWork;

import org.testng.annotations.Test;

import genricClasses.BrowserClass;
import genricClasses.ReadDataExcelFile;
import genricClasses.SeleniumHelpers;
import selLearn.SeleniumBasMethod;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class BaseClass {
	public static WebDriver driver;
	public static File file;
	public static FileInputStream fis;
	public static XSSFWorkbook wb;
	public static XSSFSheet sheet;
	public static String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	public static String path="C:\\demo\\employee.xlsx";
	public static SeleniumHelpers sh=new SeleniumHelpers();
	private static BrowserClass bc=new BrowserClass();
	@BeforeSuite
	public void beforeSuite() throws IOException {
		
		sheet=ReadDataExcelFile.LoadFromExcel(path);	
		
	}
	@BeforeTest
	public void beforeTest() throws IOException {
		
		driver=bc.browserChoice();
		//driver=SeleniumBasMethod.webDriverMet(url);		
	}

	@BeforeClass
	public void beforeClass() {
		String uname=sheet.getRow(0).getCell(0).toString();
		String pwd=sheet.getRow(0).getCell(1).toString();
		
		sh.sendDataTextBox(driver, "//input[@name='username']", uname);
		//driver.findElement(By.xpath("//input[@name='username']")).sendKeys(uname);

		sh.sendDataTextBox(driver, "//input[@name='password']", pwd);
		//driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);

		//driver.findElement(By.xpath("//button")).click();
		sh.clickElement(driver, "//button");
		
		
	}
	
	
	

	@AfterClass
	public void afterClass() {
		
		
		
		
		
	}



	@AfterTest
	public void afterTest() {
		
		driver.quit();
		
	}



	@AfterSuite
	public void afterSuite() throws IOException {
		
		wb.close();
	}

}
