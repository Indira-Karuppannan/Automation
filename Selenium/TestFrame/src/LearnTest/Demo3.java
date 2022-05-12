package LearnTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;




public class Demo3 {

	
	@Test(dataProvider="getData")
	public void webcarloanprint(String username,String password)
	{
		System.out.println("WebCarloan");
		System.out.println(username);
		System.out.println(password);
		
	}
	
	@DataProvider
	public Object[][] getData()
	
	{
		//1st combination- good credit history
		//2nd combination - no credit history
		//3rd combination- bad credit history
		
		Object[][] data=new Object[3][2];
		data[0][0]="firstusername";
		data[0][1]="firstpwd";
		data[1][0]="secondusername";
		data[1][1]="secondpwd";
		data[2][0]="thirdusername";
		data[2][1]="thirspwd";
		return data;
				
	}
	
	@Test(timeOut=400)
	public void mobilecarloansignin()
	{
		System.out.println("Carloanmobile Signin");
	}
	@Test(dependsOnMethods= {"webcarloanprint"})
	public void mobilecarloansignout()
	{
		System.out.println("Carloanmobile Signout");
	}
	
	@Test(enabled=false) 
	public void beforeexec()
	{
		System.out.println("I get executed first");
	}
	
	}
	

