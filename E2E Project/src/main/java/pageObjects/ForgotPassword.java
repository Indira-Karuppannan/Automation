package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgotPassword {

	WebDriver  driver;
	By email=By.cssSelector("#user_email");
	By sendButton=By.cssSelector("input[value*='Send']");

	public ForgotPassword(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement getEmail()
	{
		return driver.findElement(email);
	}
	public WebElement getSendInstructions()
	{
		return driver.findElement(sendButton);
	}
	
	
	}
	
	

