/*package dstestcases;
import org.testng.annotations.Test;
import dsutilities.LoggerLoad;
//import LoggerLoad;
public class LoggerTest {

	public void tst01_TestingLog() throws InterruptedException
	{
		// if want to display info message
		LoggerLoad.info("<----------Testing info----------->");
		
		//if want to display warn message
		LoggerLoad.warn("<----------Testing warn----------->");
		
		//if want to display warn message
		LoggerLoad.error("<----------Testing error----------->");
	}

}*/
package dstestcases;
import org.testng.annotations.Test;

import dsutilities.LoggerLoad;

public class LoggerTest {

	@Test
	public void testInfo()
	{
		int c,a=10, b=20;
		c=a+b;
		System.out.println("Value of c :"+c);
		LoggerLoad.info("Info  - Addition of integers");
	}
	
	@Test
	public void testError()
	{
		try
			{
			int i=1/0;
			}
		catch(Exception e)
			{
			System.out.println(e);
			}
		finally
			{
			LoggerLoad.error("Error - You can not divide a number by zero");
			}
	
	}
	
	@Test
	public void testWarn()
	{
		LoggerLoad.warn("Warning - Testing");
	}
}