package LearnTest;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Demo4 {
	
	
	@Test
	public void homeprint()
	{
		System.out.println("homeloan");
		
	}
	
	@Test(groups= {"smoke"})
	public void homeprintmobile()
	{
		System.out.println("homeloanmobile");
	}
	
	@BeforeSuite
	public void first()
	{
		System.out.println("I am first of all");
	}
	
	
	

}
