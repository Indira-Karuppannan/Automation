package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BaselogInPage {

	WebDriver  driver;
	By email=By.cssSelector("input[type='email']");
	By password=By.cssSelector("input[type='password']");
	By login=By.cssSelector("input[type='submit']");
	By forgotpass=By.cssSelector("a[href*='password']");
	
	public BaselogInPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement getEmail()
	{
		return driver.findElement(email);
	}
	public WebElement getPassword()
	{
		return driver.findElement(password);
	}
	public WebElement getLogin()
	{
		return driver.findElement(login);
	}
	public ForgotPassword getForgotPassword()
	{
		driver.findElement(forgotpass).click();;
		ForgotPassword fpwd=new ForgotPassword(driver);
		return fpwd;
		
	}
	
	}
	
	

