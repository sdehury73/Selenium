package actitime.testScript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import actitime.genericLib.BaseClass;

public class Title extends BaseClass{
	@Test
	public void getTitle()
	{
		String actual="Enter Time-Track";
		cu.titleWait(actual, driver);
		String expected=driver.getTitle();
		cu.SoftAssertContains(actual, expected);
		System.out.println(expected);
		Reporter.log("Fetch title successfully");
		Reporter.log("TC is passed",true);
	}
}
