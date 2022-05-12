import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class chkboxtest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajus\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();	
		 driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		 driver.findElement(By.cssSelector("input[id*='Option1']")).click();
		 Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='Option1']")).isSelected());
		 Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[id*='Option1']")).click();
		 Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='Option1']")).isSelected());
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
	}

}
