package pom_script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parellel_execution 
{
	public WebDriver driver;
	@Test
	@Parameters({"browser"})
	public void execute(String browser) 
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		if(browser.equals("firefox"))
		{
			driver=new FirefoxDriver();
			driver.get("https://www.amazon.in");
		}
		else
		{
			driver=new ChromeDriver();
			driver.get("https://www.amazon.in");
			
		}
		
		
		
	}

}
