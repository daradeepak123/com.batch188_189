package testNGFrameWork;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LeaveTcs extends BaseClass{
	
	
	@BeforeMethod
	public void goToLeavePageBefore()
	{
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
	}
	
	
	@Test
	public void clickAssignLeave()
	{
		driver.findElement(By.xpath("//a[text()='Assign Leave']")).click();
	}
	
	

}
