import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v99.emulation.Emulation;
import org.openqa.selenium.devtools.v99.fetch.Fetch;
import org.openqa.selenium.devtools.v99.network.Network;
import org.openqa.selenium.devtools.v99.network.model.Request;
import org.openqa.selenium.devtools.v99.network.model.Response;

public class MockURL {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rajus\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		DevTools tools=driver.getDevTools();
		tools.createSession();
		tools.send(Fetch.enable(Optional.empty(), Optional.empty()));
		tools.addListener(Fetch.requestPaused(),request->
		{
			String url=request.getRequest().getUrl();
			if(url.contains("shetty"))
				
			{
				String mockurl=url.replace("=shetty","=BadGuy");
				tools.send(Fetch.continueRequest(request.getRequestId(),Optional.of(mockurl),Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty()));
			}
			else
			{
				tools.send(Fetch.continueRequest(request.getRequestId(),Optional.of(url),Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty()));
			}
				
			
		});
		
		
		driver.get("https://rahulshettyacademy.com/angularAppdemo/");
		driver.findElement(By.cssSelector(".btn.btn-primary")).click();
		
	}

}
