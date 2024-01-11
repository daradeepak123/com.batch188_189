package testNGLearn;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Sequ {

	@BeforeMethod
	public void bmethod()
	{
		System.out.println("THis is before method");
	}
	
	@BeforeSuite
	public void bSuite()
	{
		System.out.println("this is before suite");
	}
	
	
	@BeforeTest
	public void bTest()
	{
		System.out.println("THis is before Test");
	}
	
	@BeforeClass
	public void bClass()
	{
		System.out.println("THis is before class");
	}
	
	
	
	@Test
	public void tst()
	{
		System.out.println("THis is actual test");
	}
	
	
	@Test
	public void tst1()
	{
		System.out.println("THis is actual test1");
	}
	
	
	@AfterMethod
	public void aMethod()
	{
		System.out.println("This is after method");
	}
	
	@AfterClass
	public void aClass()
	{
		System.out.println("THis is after class");
	}
	
	@AfterTest
	public void aTest()
	{
		System.out.println("THis is after Test");
	}
	
	@AfterSuite
	public void aSuite()
	{
		System.out.println("THis is after suite");
	}
	
	
	
}
