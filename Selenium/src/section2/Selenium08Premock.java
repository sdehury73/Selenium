package section2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selenium08Premock {
	public static void main(String[] args) throws IOException {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://selenium08.blogspot.com/2019/11/selenium-iframe.html");
		driver.switchTo().frame(0);
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//font[text()='Free Mock Tests']")));
		driver.findElement(By.xpath("//font[text()='Free Mock Tests']")).click();
		String mid=driver.getWindowHandle();
		Set<String> aid=driver.getWindowHandles();
		for(String id:aid)
		{
			if(!(mid.equals(aid)))
			{
				driver.switchTo().window(id);
			}
		}
		driver.findElement(By.xpath("//ul[@class='nav navbar-nav navbar-left hide-in-mobile']//a[text()='SSC']")).click();
		driver.findElement(By.xpath("/html/body/div//a[text()='SSC CHSL']")).click();
		WebElement ssc=driver.findElement(By.xpath("//ul[@class='cs-filter-bar clearfix']/li/h1"));
		File src=ssc.getScreenshotAs(OutputType.FILE);
		File trg=new File("./Screenshot/SSC.png");
		FileUtils.copyFile(src, trg);
		driver.quit();
	}
}
