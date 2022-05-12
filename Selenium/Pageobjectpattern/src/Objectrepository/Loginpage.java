package Objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage {

    WebDriver driver;
	public Loginpage(WebDriver driver)
	{
		this .driver=driver;
	}
	By username=By.id("login1");
	By password=By.id("password");
	By submit=By.name("proceed");
	By url=By.linkText("Create a new account");
	public WebElement userName()
	{
		return driver.findElement(username);
	}
	public WebElement password()
	{
		return driver.findElement(password);
	}
	public WebElement submit()
	{
		return driver.findElement(submit);
	}
	public WebElement url()
	{
		return driver.findElement(url);
	}
	
	
}
