import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;

import org.openqa.selenium.devtools.v99.emulation.Emulation;
import org.openqa.selenium.devtools.v99.fetch.Fetch;
import org.openqa.selenium.devtools.v99.fetch.model.*;
import org.openqa.selenium.devtools.v99.network.Network;
import org.openqa.selenium.devtools.v99.network.model.ConnectionType;
import org.openqa.selenium.devtools.v99.network.model.ErrorReason;



public class NetworkSpeed {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rajus\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		DevTools tools=driver.getDevTools();
		tools.createSession();
		tools.send(Network.enable(Optional.empty(), Optional.empty(),Optional.empty()));
		tools.send(Network.emulateNetworkConditions(false,3000, 6000, 10000,Optional.of(ConnectionType.ETHERNET)));
		tools.addListener(Network.loadingFailed(), fail->
		{
			System.out.println(fail.getErrorText());
			System.out.println(fail.getTimestamp());
		}
				);
		
		driver.get("https://rahulshettyacademy.com/angularAppdemo/");
		driver.findElement(By.cssSelector(".btn.btn-primary")).click();
		
	}

}
