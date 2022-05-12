package Objectrepository;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpagepf {

    WebDriver driver;
	public Loginpagepf(WebDriver driver)
	{
		this .driver=driver;
		PageFactory.initElements(driver, this);
				
	}
	/*By username=By.id("login1");
	By password=By.id("password");
	By submit=By.name("proceed");
	By url=By.linkText("Create a new account");*/
	
	@FindBy(id="login1")
	WebElement username;
	@FindBy(id="password")
	WebElement password;
	@FindBy(name="proceed")
	WebElement submit;
	@FindBy(linkText="Create a new account")
	WebElement url;
	
	public WebElement userName()
	{
		return username;
	}
	public WebElement password()
	{
		return password;
	}
	public WebElement submit()
	{
		return submit;
	}
	public WebElement url()
	{
		return url;
	}
	
	
}
