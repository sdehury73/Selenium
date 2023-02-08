package elementsRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeLoginLocators {
	public ActitimeLoginLocators(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="username")
	private WebElement username;
	
	@FindBy(name="pwd")
	private WebElement password;
	
	@FindBy(id="loginButton")
	private WebElement loginButton;
	
	public WebElement getUsername()
	{
		return username;
	}
	public WebElement getPassword()
	{
		return password;
	}
	public WebElement getLoginButton()
	{
		return loginButton;
	}
	
	public void login(String un,String pwd)
	{
		getUsername().sendKeys(un);
		getPassword().sendKeys(pwd);
		getLoginButton().click();
	}
}
