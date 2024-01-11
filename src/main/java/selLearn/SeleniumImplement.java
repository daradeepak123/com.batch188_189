package selLearn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SeleniumImplement extends SeleniumBasMethod {

	public static void main(String[] args) {
	
		String url="https://www.selenium.dev/selenium/docs/api/java/org/openqa/selenium/WebElement.html";
		
		
		WebDriver driver=SeleniumBasMethod.webDriverMet(url);
		
		
		driver.findElement(By.xpath("//a[text()='Overview']")).click();
		

	}

}
