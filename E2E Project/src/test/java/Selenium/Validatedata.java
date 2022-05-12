package Selenium;

import java.io.IOException;

import org.apache.logging.log4j.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Selenium.Base;
import pageObjects.LandingPage;


public class Validatedata extends Base 
{

	 private static Logger log=LogManager.getLogger(Validatedata.class);
	  public WebDriver driver;
	  
	@BeforeTest
	public void initialize() throws IOException
	{
		driver=initializeDriver();
		driver.get(url);	
	}
	@Test()
	
	public void basePageNavigation() throws IOException
	{	
		
		LandingPage lPage=new LandingPage(driver);
		lPage.getPromptAccess().click();
		Assert.assertEquals(lPage.getTitle().getText(),"FEATURED COURSES12");
		log.info("Title matches with the Expected");
		Assert.assertTrue(lPage.getLinks().isDisplayed());
		log.info("Navigation link displayed");
		
		
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
	}
	
	
	
	
	
	
}
