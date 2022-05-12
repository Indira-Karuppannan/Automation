import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;

import org.openqa.selenium.devtools.v99.emulation.Emulation;
import org.openqa.selenium.devtools.v99.fetch.Fetch;
import org.openqa.selenium.devtools.v99.fetch.model.*;
import org.openqa.selenium.devtools.v99.network.model.ErrorReason;



public class HandleFailRequest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rajus\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		DevTools tools=driver.getDevTools();
		tools.createSession();
		Optional<List<RequestPattern>> pattern= Optional.of(Arrays.asList(new RequestPattern(Optional.of("*GetBook*"),Optional.empty(),Optional.empty())));
		tools.send(Fetch.enable(pattern, Optional.empty()));
		tools.addListener(Fetch.requestPaused(),request->
		{
			tools.send(Fetch.failRequest(request.getRequestId(),ErrorReason.FAILED));
			
		});
		
		
		driver.get("https://rahulshettyacademy.com/angularAppdemo/");
		driver.findElement(By.cssSelector(".btn.btn-primary")).click();
		
	}

}
