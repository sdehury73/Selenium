package actitime.testScript;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import actitime.genericLib.BaseClass;
import actitime.genericLib.CommonUtility;
import elementsRepository.DropdownHandlingLocators;

@Listeners(actitime.genericLib.ListenerImplementation.class)
public class DropdownHandling extends BaseClass{
	@Test
	public void DropDown() throws InterruptedException
	{
		DropdownHandlingLocators dl=new DropdownHandlingLocators(driver);
		dl.HomePage();
		CommonUtility cu=new CommonUtility();
		cu.getSelectByVisibleText(dl.getTGLDropdown(),"Product");
		System.out.println(dl.notificationBox());
	}
}
