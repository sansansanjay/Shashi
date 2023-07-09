package pom_script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider 
{
	@Test(dataProvider = "testdata")
	public void run(String s,String n) 
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525804797%7Cb%7Cfacebook%20%27%7C&placement=&creative=550525804797&keyword=facebook%20%27&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696220912%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-327195741349%26loc_physical_ms%3D1007768%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMIlf3psLL6_wIVGlgrCh2l0QkhEAAYASAAEgLXQ_D_BwE");
		driver.findElement(By.xpath("//input[@aria-label='First name']")).sendKeys(s);
		driver.findElement(By.xpath("//input[@aria-label='Surname']")).sendKeys(n);
		
	}
	@DataProvider(name="testdata")
	public Object[][]run1()
	{
		Object[][]arr=new Object[2][2];
		arr[0][0]="sanjay";
		arr[0][1]="kumar";
		arr[1][0]="naveen";
		arr[1][1]="kumar";
		
		return arr;
		
	
		
	
	}
}
		
	

