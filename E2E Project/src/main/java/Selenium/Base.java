package Selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;



public class Base {

	public WebDriver driver;
	public String url;
	public WebDriver initializeDriver() throws IOException
	{
		Properties prop=new Properties();
		FileInputStream fin=new FileInputStream("C:\\Users\\rajus\\Selenium\\E2EProject\\src\\main\\java\\Resources\\data.properties");
		prop.load(fin);
		String browser=System.getProperty("browser");
		//String browser=prop.getProperty("browser");
	    url=prop.getProperty("url");
	   
		if(browser.equalsIgnoreCase("chrome"))
		{
			//Execute in ChromeDriver
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\rajus\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions op=new ChromeOptions();
		op.addArguments("headless");
		driver=new ChromeDriver(op);
		}
		else if (browser.equalsIgnoreCase("firefox"))
		{
			//Execute in FirefoxDriver
			
			System.setProperty("webdriver.gecko.driver","C:\\Users\\rajus\\Downloads\\geckodriver-v0.30.0-win32\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else if (browser.equalsIgnoreCase("IE"))		
		{
			//Execute in IE Driver
			
			System.setProperty("webdriver.ie.driver","C:\\Users\\rajus\\Downloads\\IEDriverServer_Win32_4.0.0\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}
	    
	   
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		return driver;
		
	}
	
	public String getScreenshot(String testcase,WebDriver driver) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File sourceFile=ts.getScreenshotAs(OutputType.FILE);
		String destFile=System.getProperty("user.dir")+"\\reports\\"+testcase+".png";
		FileUtils.copyFile(sourceFile, new File(destFile));
		return destFile;
		
	}
	
}
