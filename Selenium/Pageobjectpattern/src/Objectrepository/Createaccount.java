package Objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Createaccount {

    WebDriver driver;
	public Createaccount(WebDriver driver)
	{
		this .driver=driver;
	}
	By name=By.xpath("//input[contains(@name,'name')]");
	
	public WebElement Fullname()
	{
		return driver.findElement(name);
	}
	
	
	
}
