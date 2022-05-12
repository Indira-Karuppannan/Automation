import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class dynamicvariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\rajus\\Downloads\\chromedriver_win32\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");	
		
	
		
		WebElement elem=driver.findElement(By.id("checkbox-example"));
		WebElement sel=driver.findElement(By.id("dropdown-class-example"));
		Select stat=new Select(sel);
		for(int i=0;i<elem.findElements(By.tagName("input")).size();i++)
				{
			
			elem.findElements(By.tagName("input")).get(i).click();
			String schk=elem.findElements(By.tagName("label")).get(i).getText();
			stat.selectByVisibleText(schk);
			driver.findElement(By.id("name")).sendKeys(schk);
			driver.findElement(By.id("alertbtn")).click();
			String alerst=driver.switchTo().alert().getText();
			System.out.println(alerst);
			String alerdis=alerst.split(" ")[1].split(",")[0];
			Assert.assertEquals(schk, alerdis);
			driver.switchTo().alert().accept();
			
			
				}
		
	}

}
