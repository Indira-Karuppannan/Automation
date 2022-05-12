import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.Assertion;



public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
 System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajus\\Downloads\\chromedriver_win32\\chromedriver.exe");
 WebDriver driver = new ChromeDriver();
 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Indira");
		driver.findElement(By.xpath("//input[contains(@type,'pass')]")).sendKeys("1234");
		
		driver.findElement(By.xpath("//input[@id='chkboxTwo']")).click();
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		String s=driver.findElement(By.className("error")).getText();
		System.out.println(s);
		Assert.assertEquals(s,"* Incorrect username or password");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("div button.reset-pwd-btn")).click();
		String Password = getpassword(driver);
		System.out.println(Password);
		driver.findElement(By.xpath("//button[text()='Go to Login']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Indira");
		driver.findElement(By.xpath("//input[contains(@type,'pass')]")).sendKeys(Password);
		driver.findElement(By.xpath("//input[@id='chkboxTwo']")).click();
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		
	}
	
	public static String getpassword(WebDriver driver)
	{
	
		String s2=driver.findElement(By.className("infoMsg")).getText();
		return s2.split("'")[1].split("'")[0];
		
	}

}
