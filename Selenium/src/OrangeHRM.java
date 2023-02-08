import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.orangehrm.com/");
		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/div[2]/ul/li[1]/a/button")).click();
		WebElement signup=driver.findElement(By.xpath("/html/body/div[3]/div/div/section[2]/div/div[1]/div/div/h4"));
		JavascriptExecutor jsc=(JavascriptExecutor) driver;
		jsc.executeScript("arguments[0].scrollIntoView(true);",signup);
		driver.findElement(By.xpath("//*[@id=\"Form_getForm_FullName\"]")).sendKeys("Sabyasachi",Keys.TAB);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"Form_getForm_Email\"]")).sendKeys("sdehury737@gmail.com",Keys.TAB,"",Keys.TAB,"9337211082",Keys.TAB,Keys.ENTER);
	}
}
