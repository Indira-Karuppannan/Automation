import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class autosuggestdrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\rajus\\Downloads\\chromedriver_win32\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
	
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("autocomplete")).sendKeys("ind");
		WebDriverWait waitex=new WebDriverWait(driver,5);
		waitex.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".ui-menu-item")));
		List<WebElement> country=driver.findElements(By.cssSelector(".ui-menu-item"));
		System.out.println(country.size());
		for(int i=0;i<country.size();i++)
		{
			
			System.out.println(country.get(i).getText());
			if(country.get(i).getText().equalsIgnoreCase("India"))
			{
				country.get(i).click();
				System.out.println(country.get(i).getText());
				break;
			}
				
		}
		
	}

}
