package LearnTest;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestResult;


public class ListenerInterface implements ITestListener{

	
	
	
		  
		  public void onTestStart(ITestResult result) {
		    // not implemented
		  }

		  
		  public void onTestSuccess(ITestResult result) {
		    // not implemented
			  
			  System.out.println("I successfully executed listeners");
		  }

		  
		  public void onTestFailure(ITestResult result) {
		    // not implemented
			  System.out.println("listeners got failed"+result.getMethod());
		  }

		  public void onTestSkipped(ITestResult result) {
		    // not implemented
		  }

		  
		  public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		    // not implemented
		  }

		  
		  public void onTestFailedWithTimeout(ITestResult result) {
		    onTestFailure(result);
		  }

		
		  public void onStart(ITestContext context) {
		    // not implemented
		  }

		  
		  public void onFinish(ITestContext context) {
		    // not implemented
		  }
		
	
}
