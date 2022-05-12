package qaclickacademy;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AppiumTest {
	@Test
	void getATMData()
	{
		System.out.println("Appium ATMTest");
	}
	
	
	@Test(groups= {"smoke"},dataProvider="getdata")
	void getloanData(String user,String pwd)
	{
		System.out.println("Appium loanTest");
		System.out.println(user);
		System.out.println(pwd);
	}
	
	@DataProvider
	public Object[][] getdata()
	{
		Object[][] ob=new Object[2][2];
		ob[0][0]="user1";
		ob[0][1]="password1";
		ob[1][0]="user2";
		ob[1][1]="password2";
		return ob;
		
		
		
	}
	
	
	
	
	
}
