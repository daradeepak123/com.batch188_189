package genricClasses;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumHelpers {
	
	
	public void sendDataTextBox(WebDriver driver,String xpath,String data)
	{
		WebElement ele=driver.findElement(By.xpath(xpath));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(ele));
		
		boolean b=ele.isDisplayed();  
		b&=ele.isEnabled();   
		if(b)
		{
			ele.clear();
			ele.sendKeys(data);
		}
		else
		{
			System.out.println("webElement not available");
		}
		
		
	}
	
	
	
	public void clickElement(WebDriver driver,String xpath)
	{
		
		WebElement ele=driver.findElement(By.xpath(xpath));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(ele));
		
		boolean b=ele.isDisplayed();  
		b&=ele.isEnabled();   
		if(b)
		{
		
			ele.click();
		}
		else
		{
			System.out.println("webElement not available");
		}
		
		
	}
	
	
	public String getTextData(WebDriver driver,String xpath)
	{
		WebElement ele=driver.findElement(By.xpath(xpath));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(ele));
		
		boolean b=ele.isDisplayed();  
		b&=ele.isEnabled();
		if(b)
		{
			String text=ele.getText();
			return text;
		}
		else
		{
			System.out.println("webElement not available");
			return null;
		}
	}
	
	
	
	

}
