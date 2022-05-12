package LearnTest;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Demo {
	
	@BeforeClass()
	public void printclass()
	{
		System.out.println("I am executing before any method get executed");
	}
	@AfterClass()
	public void printafterclass()
	{
		System.out.println("I am executing after all method get executed");
	}

	@BeforeMethod
	public void printbefore()
	{
		System.out.println("I will execute before every method in Demo class");
	}
	
	@AfterMethod
	public void printafter()
	{
		System.out.println("I will execute after every method in Demo class");
	}
	
	
	
	@AfterSuite
	public void atlast()
	{
		System.out.println("I am executed atlast");
	}
	
	@AfterTest
	public void lastexec()
	{
		System.out.println("I get executed last");
	}
	
	@Test
	public void print()
	{
		System.out.println("Hello");
		Assert.assertTrue(false);
	}
	@Test
	public void print1()
	{
		System.out.println("World");
	}
}
