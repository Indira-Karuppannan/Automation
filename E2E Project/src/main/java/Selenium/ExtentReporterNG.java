package Selenium;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporterNG {
	static ExtentReports report;
	public static ExtentReports getReportObjects()
	{
		String path=System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter espkreport=new ExtentSparkReporter(path);
		espkreport.config().setDocumentTitle("Web Automation results");
		espkreport.config().setReportName("Test Results");
		report=new ExtentReports();
		report.attachReporter(espkreport);
		report.setSystemInfo("Tester", "Admin");
		return report;
	}

	
}
