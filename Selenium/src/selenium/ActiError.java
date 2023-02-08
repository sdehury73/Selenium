package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiError {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.cssSelector("#loginButton")).click();
		Thread.sleep(5000);
		WebElement colour=driver.findElement(By.xpath("//span[text()='Username or Password is invalid. Please try again.']"));
		System.out.println("Colour: "+colour.getCssValue("color"));
		System.out.println("Font: "+colour.getCssValue("font"));
		driver.quit();
	}
}
