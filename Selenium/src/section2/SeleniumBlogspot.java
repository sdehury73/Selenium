package section2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumBlogspot {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
		WebElement c=driver.findElement(By.xpath("//span[text()='Labels:']/../../../../div[2]/div/div/button"));
		Actions act=new Actions(driver);
		act.doubleClick(c).perform();
	}
}
