import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v99.emulation.Emulation;

public class SetGeoLocation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rajus\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		DevTools tools=driver.getDevTools();
		tools.createSession();
		//tools.send(Emulation.setGeolocationOverride(Optional.of(40), Optional.of(3), Optional.of(1)));
		Map<String,Object> geolocation=new HashMap<String,Object>();
		geolocation.put("latitude",40);
		geolocation.put("longitude",3);
		geolocation.put("accuracy",1);
		driver.executeCdpCommand("Emulation.setGeolocationOverride", geolocation);
		driver.get("http://google.com/");
		driver.findElement(By.xpath("//div[text()='I agree']")).click();
		
		driver.findElement(By.name("q")).sendKeys("netflix",Keys.ENTER);
		
		driver.findElements(By.cssSelector(".LC20lb")).get(0).click();
		System.out.println(driver.findElement(By.cssSelector("[data-uia='hero-title']")).getText());
	}

}
