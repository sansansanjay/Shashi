package demo;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Generic {
	public WebDriver driver;
	@BeforeMethod
	public void open() {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		 driver = new FirefoxDriver();
	}
	@AfterMethod
	public void close(ITestResult res) throws IOException 
	{
		if(ITestResult.FAILURE==res.getStatus())
		{
			Screenshot.getphoto(driver);
			
		}
		
		
		
	}

}
