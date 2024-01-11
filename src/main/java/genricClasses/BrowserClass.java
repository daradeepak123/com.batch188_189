package genricClasses;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserClass {
	
	WebDriver driver=null;
	public WebDriver browserChoice() throws IOException
	{
		File file=new File(System.getProperty("user.dir")+ "/src/main/resources/config.properties");
		FileInputStream fp = new FileInputStream(file);
		Properties prop=new Properties();
		prop.load(fp);
		String b=prop.getProperty("browser");
		System.out.println(b);
		
		
		
		if(b.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(b.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(b.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		return driver;
	}
	
	
	

}
