package snippet;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Listen.class)
public class Snippet 
{
	
	@Test(priority = -1)
	public void rum() {
		System.out.println("daddy");
	}
	@Test
	public void tum1() {
		System.out.println("ssss");
		Assert.fail();
	}
	@Test(dependsOnMethods = "tum1")
	public void rum2() 
	{
		System.out.println("sssssssss");
	}
		
	
}

