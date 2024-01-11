package genricClasses;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestClass {

	public static void main(String[] args) throws IOException {
		File file=new File(System.getProperty("user.dir")+ "/src/main/resources/config.properties");
		FileInputStream fp = new FileInputStream(file);
		Properties prop=new Properties();
		prop.load(fp);
		String b=prop.getProperty("browser");
		System.out.println(b);
		System.out.println(prop.getProperty("url"));

	}

}
