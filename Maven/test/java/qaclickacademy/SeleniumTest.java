package qaclickacademy;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SeleniumTest {
	@Parameters({"URL"}) 
	@Test
	void getATMData(String s)
	{
		System.out.println(s+ "ATMSelenium");
	}
	
	
	
	@Test(groups= {"smoke"})
	void getloanData()
	{
		System.out.println("loanSelenium");
	}
}
