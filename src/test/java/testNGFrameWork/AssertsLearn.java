package testNGFrameWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertsLearn {
	@Test(enabled = false)
	public  void tst() {
		
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://the-internet.herokuapp.com/tables");
		driver.manage().window().maximize();
		
		String title=driver.getTitle();
		System.out.println(title);
		
		Assert.assertEquals(title, "The Internet");
		
		driver.quit();	

	}
	
	@Test
	public void assertsLearn()
	{
		
		String a="hello";
		String b="hello";
		
		int abc=1000;
		int xyz=100;
		
		Assert.assertEquals(abc,xyz);
		

		System.out.println("Sample");
		
		Assert.assertEquals(a,b);
		
		System.out.println("Sample1");
		
		
		SoftAssert sa=new SoftAssert();
		
		sa.assertEquals(abc, xyz);
		
		System.out.println("this is checking");
		sa.assertAll();
		
	}
	
	
	
	
	
	

}
