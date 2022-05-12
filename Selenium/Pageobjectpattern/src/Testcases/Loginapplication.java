package Testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Objectrepository.Createaccount;
import Objectrepository.Loginpage;
import Objectrepository.Loginpagepf;

public class Loginapplication {
    public static void main(String[] args) throws InterruptedException
    {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\rajus\\Downloads\\chromedriver_win32\\chromedriver.exe");	
	WebDriver driver=new ChromeDriver();

	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	Loginpagepf lop=new Loginpagepf(driver);
	lop.userName().sendKeys("admin");
	lop.password().sendKeys("password");
	lop.submit().click();
	lop.url().click();
	  
	Createaccount cacc=new Createaccount(driver);
	//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(1000));
	//wait.until(ExpectedConditions.visibilityOfElementLocated((By) cacc.Fullname()));
 
	cacc.Fullname().sendKeys("RahulShetty");
	
    }
}
