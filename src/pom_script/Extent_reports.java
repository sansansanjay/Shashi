package pom_script;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Extent_reports 
{
	@Test
	public void mul() 
	{
		ExtentReports rep=new ExtentReports("./reports/sanju.html");
		ExtentTest test = rep.startTest("testcase2");
		test.log(LogStatus.PASS, "passedtestcase");
		 rep.endTest(test);
		 rep.flush();
		
		
	}

}
