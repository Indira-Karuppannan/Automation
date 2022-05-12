import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\rajus\\Downloads\\chromedriver_win32\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
	
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		int rows=driver.findElements(By.cssSelector(".table-display tr")).size();
		System.out.println("Number of rows \t"+rows);
		int column=driver.findElements(By.cssSelector(".table-display th")).size();
		System.out.println("Number of column \t"+column) ;
		List<WebElement> disprow=driver.findElements(By.cssSelector(".table-display tr:nth-child(3)"));
		for(int i=0;i<disprow.size();i++)
		{
			System.out.println(disprow.get(i).getText()+"\t");
		}
	}

}
