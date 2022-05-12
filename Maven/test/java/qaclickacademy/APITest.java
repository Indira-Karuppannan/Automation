package qaclickacademy;

import org.testng.annotations.Test;

public class APITest {

	@Test
	void getATMData()
	{
		System.out.println("API ATMTest");
	}
	
	@Test(groups= {"smoke"})
	void getloanData()
	{
		System.out.println("API loan Test");
	}
	
	
}
