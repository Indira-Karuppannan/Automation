import java.util.Optional;
import java.util.function.Predicate;

import org.openqa.selenium.By;
import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.chrome.ChromeDriver;
import java.net.URI;


public class BasicAuthentication {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rajus\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		Predicate<URI> uripredicate= uri->uri.getHost().contains("httpbin.org");
	
		
		((HasAuthentication)driver).register(uripredicate,UsernameAndPassword.of("foo","bar"));
		driver.get("http://httpbin.org/basic-auth/foo/bar");
	}

}
