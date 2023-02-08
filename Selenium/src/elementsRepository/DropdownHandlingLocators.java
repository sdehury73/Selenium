package elementsRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DropdownHandlingLocators {
	public DropdownHandlingLocators(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//div[@class='menuTable']/div[2]")
	private WebElement Settings;
	
	@FindBy(xpath="//div[text()='Manage system settings & configure actiTIME']/../div[1]")
	private WebElement generalSettings;
	
	@FindBy(id="firstHierarchyLevelCodeSelect")
	private WebElement topGroupingLevelDropdown;
	
	@FindBy(id="FormModifiedTextCell")
	private WebElement notification;
	
	public WebElement getSettings()
	{
		return Settings;
	}
	public WebElement getGSettings()
	{
		return generalSettings;
	}
	public WebElement getTGLDropdown()
	{
		return topGroupingLevelDropdown;
	}
	public WebElement getNotification()
	{
		return notification;
	}
	
	public void HomePage()
	{
		getSettings().click();
		getGSettings().click();
	}
	public String notificationBox()
	{
		String not=getNotification().getText();
		return not;
	}
	
}
