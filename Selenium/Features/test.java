import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\rajus\\Downloads\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
driver.get("https://rahulshettyacademy.com/locatorspractice/");
driver.findElement(By.id("inputUsername")).sendKeys("indira");
driver.findElement(By.name("inputPassword")).sendKeys("rajusrs@gmail.com");
System.out.println(driver.findElement(By.xpath("//button[@id='visitUsTwo']")).getText());
driver.findElement(By.className("signInBtn")).click();
driver.findElement(By.linkText("Forgot your password?")).click();


	}

}
