package pom_script;

import org.testng.Assert;
import org.testng.annotations.Test;
import demo.Generic;
public class Screenshot extends Generic
{
	@Test
	public void run()
	{
		driver.get("https://www.facebook.in");
		Assert.fail();
		
	}
	

}
