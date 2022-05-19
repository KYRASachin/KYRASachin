package KYRACLINIC;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;


public class Resource {
	
	public WebDriver driver;
	
	public WebDriver initializeDriver() throws IOException
	{
	Properties prop=new Properties();
	FileInputStream fls=new FileInputStream("C:\\Users\\SachinAhlawat\\eclipse-workspace\\ProgressNotes\\src\\test\\java\\KYRACLINIC\\data.properties");
	
	prop.load(fls);
	
	
	
	String browserName=prop.getProperty("browser");
		
		if (browserName.equals("chrome"))
		{
			
			System.setProperty("webdriver.chrome.driver", "C:/Users/SachinAhlawat/Documents/chromedriver.exe");
			driver=new ChromeDriver();
			
			
			
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
	}

}
