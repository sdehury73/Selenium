package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActGeneric {
	ChromeDriver driver;
	public static void main(String[] args) throws InterruptedException {
		ActGeneric a=new ActGeneric();
		a.launchBrowser();
		a.login();
		Thread.sleep(5000);
		a.addCustomer();
		Thread.sleep(4000);
		String customerName=a.getCustomerName();
		System.out.println(customerName);
		Thread.sleep(5000);
		a.closeBrowser();
	}
	public void launchBrowser()
	{
		System.setProperty("webdriver.edge.driver","D:\\Selenium\\edgedriver_win64\\msedgedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	public void login() throws InterruptedException
	{
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("[placeholder='Username']")).sendKeys("admin");
		driver.findElement(By.cssSelector("[name='pwd']")).sendKeys("manager");
		driver.findElement(By.cssSelector("[name='remember']")).click();
		driver.findElement(By.xpath("//a[@id=\"loginButton\" and @class=\"initial\"]")).click();
	}
	public void addCustomer() throws InterruptedException
	{
		driver.findElement(By.cssSelector("[id=container_tasks]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Add New')]")).click();
		driver.findElement(By.xpath("//div[@class=\"item createNewCustomer\"]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class=\"customerNameDiv\"]/input[@placeholder=\"Enter Customer Name\"]")).sendKeys("DSabyasachi");
		driver.findElement(By.xpath("//div[@class=\"inputContainer\"]/textarea[@placeholder=\"Enter Customer Description\"]")).sendKeys("Love you");
		driver.findElement(By.xpath("//div[contains(text(),\"Create Customer\")]")).click();
		//Thread.sleep(4000);
		//System.out.println(driver.findElement(By.xpath("//div[@class=\"titleEditButtonContainer\"]/div")).getText());
	}
	public String getCustomerName()
	{
		String name=driver.findElement(By.xpath("//div[@class=\"titleEditButtonContainer\"]/div")).getText();
		return name;
	}
	public void closeBrowser()
	{
		driver=new ChromeDriver();
		driver.quit();
	}
}
