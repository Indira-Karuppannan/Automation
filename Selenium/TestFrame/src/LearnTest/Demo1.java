package LearnTest;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Demo1 {

	
		// TODO Auto-generated method stub
		
		@Test(groups= {"smoke"})
		public void print()
		{
			System.out.println("Hello");
		}
		
		@Parameters({"URL","NAME"})
		@Test
	
		public void parametersetup(String n,String n1)
		{
			System.out.println(n+n1);
		}
		
	}


