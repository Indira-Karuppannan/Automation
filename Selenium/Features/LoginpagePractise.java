import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginpagePractise {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rajus\\Downloads\\chromedriver_win32\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		String s=driver.findElement(By.cssSelector("p.text-center.text-white")).getText();
		String[] details=s.split("is");
		String[] password1=details[2].split("[)]");
	    String password=password1[0].trim();  
		String [] details1=details[1].split("and");
		String User=details1[0].trim();
		System.out.println(User+"\n"+password);
        	  driver.findElement(By.id("username")).sendKeys(User);
        	  driver.findElement(By.id("password")).sendKeys(password);
       
         
        driver.findElement(By.xpath("//input[@value='user']")).click();
        WebDriverWait dwait=new WebDriverWait(driver,5);
        dwait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button#okayBtn")));
        
          
        driver.findElement(By.cssSelector("button#okayBtn")).click();
        driver.findElement(By.cssSelector("select.form-control")).click();
        WebElement elem= driver.findElement(By.cssSelector("select.form-control"));
        Select user=new Select(elem);
        user.selectByVisibleText("Consultant");
        driver.findElement(By.id("terms")).click();
        driver.findElement(By.id("signInBtn")).click();
        additems(driver);
        
	}
	
	public static void additems(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		String[] item= {"iphone X","Samsung Note 8","Nokia Edge","Blackberry"};
		List<WebElement> screenitem=driver.findElements(By.cssSelector("h4.card-title"));
		List<String> listed=Arrays.asList(item);
		int j=0;
		while(j<item.length)
		{
		for(int i=0;i<screenitem.size();i++)
		{
			if(listed.contains(screenitem.get(i).getText()))
			{
				driver.findElements(By.cssSelector("button.btn.btn-info")).get(i).click();
				j++;
			}
			else
			{
				break;
			}
				
			}
			
			
		}
		
		
		
	}
}

		

	


