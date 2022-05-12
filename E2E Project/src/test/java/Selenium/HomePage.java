package Selenium;

import java.io.IOException;



import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.BaselogInPage;
import pageObjects.ForgotPassword;
import pageObjects.LandingPage;
import org.apache.logging.log4j.*;
import org.openqa.selenium.WebDriver;
public class HomePage extends Base{

    private static Logger log=LogManager.getLogger(HomePage.class);
    public WebDriver driver;
    public LandingPage lPage;
   
   
  
	@BeforeTest
	public void initialize() throws IOException
	{
		driver=initializeDriver();
		log.info("driver initialized");
		
	}


	
	
	
	@Test(dataProvider="getData")
	
	public void loginPage(String email,String pwd,String txt) throws IOException
	{
		driver.get(url);
		log.info("Navigate to url");
		
		LandingPage lPage=new LandingPage(driver);
		if(!txt.equalsIgnoreCase("restrictedUser"))
		lPage.getPromptAccess().click();		
		BaselogInPage logPage=lPage.getLogin();	
		logPage.getEmail().sendKeys(email);
		logPage.getPassword().sendKeys(pwd);
		logPage.getLogin().click();
		log.info(txt);
		ForgotPassword fwd=logPage.getForgotPassword();
		fwd.getEmail().sendKeys("xxx");
		fwd.getSendInstructions().click();
	

		
		
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] obj=new Object[2][3];
		obj[0][0]="admin@abc.com";
		obj[0][1]="sdf234";
		obj[0][2]="nonrestrictedUser";
		obj[1][0]="member@abc.com";
		obj[1][1]="mgh789";
		obj[1][2]="restrictedUser";
		
		
		return obj;
		
	}
	
			
	@AfterTest
	public void teardown()
	{
		driver.close();
	}
	
	
	
	
	
	
}
