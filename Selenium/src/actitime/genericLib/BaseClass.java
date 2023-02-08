package actitime.genericLib;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import elementsRepository.ActitimeLoginLocators;

public class BaseClass {
	public WebDriver driver;
	public static WebDriver listenerdriver;
	public DataUtility du=new DataUtility();
	public CommonUtility cu=new CommonUtility();
	@Parameters("browser")
	@BeforeClass(alwaysRun = true)
	public void LaunchBrowser(String browser)
	{
		if(browser.equals("chrome"))
		{
		driver=new ChromeDriver();
		listenerdriver=driver;
		}
		else if (browser.equals("edge"))
		{
			driver=new EdgeDriver();
			listenerdriver=driver;
		} 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	@BeforeMethod(alwaysRun = true)
	public void Login() throws IOException
	{
		ActitimeLoginLocators al=new ActitimeLoginLocators(driver);
		driver.get(du.LoginData("url"));
		al.login(du.LoginData("un"),du.LoginData("pwd"));
	}
	@AfterMethod(alwaysRun=true)
	public void Logout()
	{
		driver.findElement(By.id("logoutLink")).click();
	}
	@AfterClass(alwaysRun=true)
	public void closeBrowser()
	{
		driver.close();
	}
}
