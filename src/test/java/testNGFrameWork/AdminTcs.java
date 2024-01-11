package testNGFrameWork;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AdminTcs extends BaseClass{
	
	
	
	@BeforeMethod
	public void goToAdminPageBefore()
	{
	
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
		
		
	}
	
	@Test(priority = 1,invocationCount = 1,description = "this is learn")
	public void menuItem()
	{
		sh.clickElement(driver, "//span[text()='Job ']");
		//driver.findElement(By.xpath("//span[text()='Job ']")).click();
		driver.findElement(By.xpath("//a[text()='Job Titles']")).click();
		
	}
	
	
	@Test (priority=2,enabled = false)
	public void textBox()
	{
		driver.findElement(By.xpath("//form//input[@class='oxd-input oxd-input--active']")).sendKeys("Admin");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		boolean b=driver.findElement(By.xpath("(//div[text()='Admin'])[1]")).isDisplayed();
		
		String data=sh.getTextData(driver, "(//div[text()='Admin'])[1]");
		System.out.println(data);
		
		if(b)
		{
			System.out.println("text case is good");
		}
		else
		{
			System.out.println("test case fail");
		}
	}
	
	
	
	
	
	@AfterMethod
	public void goToAdminPageAfter()
	{
		
	}
	
	
	

}
