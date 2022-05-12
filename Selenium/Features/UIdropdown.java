import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UIdropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\rajus\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		driver.findElement(By.name("name")).sendKeys("Indira");
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("indjun@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("ind123");
		driver.findElement(By.id("exampleCheck1")).click();
		WebElement gender=driver.findElement(By.id("exampleFormControlSelect1"));
		Select gen=new Select(gender);
		gen.selectByIndex(1);
		driver.findElement(By.cssSelector("input[name='inlineRadioOptions']")).click();
		driver.findElement(By.cssSelector("input[name='bday']")).click();
		driver.findElement(By.cssSelector("input[name='bday']")).sendKeys("08/12/2021");
		driver.findElement(By.cssSelector("input[class*='btn-success']")).click();
		System.out.println(driver.findElement(By.cssSelector("div[class*='alert-dismissible']")).getText());
		
		
		
		
		
		
	}

}
