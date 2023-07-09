package pom_script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Loginpage 
{
	public WebDriver driver;
	@Test
	public void fum() {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
	}
	

}
