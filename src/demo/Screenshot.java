package demo;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot 
{
	
	public static void getphoto(WebDriver driver) throws IOException 
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dst = new File("C:\\Users\\sansa\\OneDrive\\Pictures\\Screenshots/sanjaykumar.jpeg");
		FileHandler.copy(src, dst);
		
		
	}

}
