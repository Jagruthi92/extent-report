package demo;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class extentReprt 
{
	@Test
	public void test1()
	{
		
		ExtentReports reports= new ExtentReports("./extent/reports.html",false);
		
		ExtentTest tests= reports.startTest("Testscript1");
		
		tests.log(LogStatus.PASS, "pass");
		tests.log(LogStatus.FAIL, "fail");
		tests.log(LogStatus.SKIP, "skip");
		tests.log(LogStatus.WARNING, "warn");
		tests.log(LogStatus.FATAL, "fatal");
		tests.log(LogStatus.ERROR, "error");
		
		reports.endTest(tests);
		
		reports.flush();
	}
	
}
