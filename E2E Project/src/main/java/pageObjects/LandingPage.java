package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LandingPage {

	WebDriver  driver;
	
	By signIn=By.cssSelector("a[href*='sign_in']");
	By close=By.cssSelector("div[style*='0px 0px 0px inset']");
	By title=By.xpath("//h2[text()='Featured Courses']");
	By links=By.cssSelector(".nav.navbar-nav.navbar-right");
	public LandingPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public BaselogInPage getLogin()
	{
		driver.findElement(signIn).click();
		BaselogInPage linpage=new BaselogInPage(driver);
		return linpage;
	}
	public WebElement getPromptAccess()
	{
		
		return driver.findElement(close);
	
		
	}

	public WebElement getTitle() {
		return driver.findElement(title);
		
	}
	public WebElement getLinks() {
		return driver.findElement(links);
		
	}
	
	}
	
	

