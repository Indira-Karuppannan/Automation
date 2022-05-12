import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class windowhandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\rajus\\Downloads\\chromedriver_win32\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/");
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.linkText("Multiple Windows"))).click().build().perform();
		a.moveToElement(driver.findElement(By.linkText("Click Here"))).click().build().perform();
		Set<String> window=driver.getWindowHandles();
		Iterator<String> iter=window.iterator();
		String parent=iter.next();
		String child=iter.next();
		driver.switchTo().window(child);
		System.out.println(driver.findElement(By.xpath("//div[@class='example']/h3")).getText());
		driver.switchTo().window(parent);
		System.out.println(driver.findElement(By.xpath("//div[@class='example']/h3")).getText());
		
		
	}

}
