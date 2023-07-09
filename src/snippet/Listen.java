package snippet;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listen implements ITestListener
{

	

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("succesed testcae");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("fails");
	}

	
	@Override
	public void onStart(ITestContext context) {
		System.out.println("starts");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("finish");
	}
	
	

}
