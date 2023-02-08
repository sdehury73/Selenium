package section2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActitimeCal {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		FileInputStream fis=new FileInputStream("D:\\Selenium\\actitime.properties");
		Properties p=new Properties();
		p.load(fis);
		String URL=p.getProperty("url");
		String UN=p.getProperty("un");
		String PWD=p.getProperty("pwd");
		driver.get(URL);
		driver.findElement(By.id("username")).sendKeys(UN,Keys.TAB,PWD,Keys.TAB,Keys.SPACE,Keys.ENTER);
		driver.findElement(By.className("x-btn-text")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='x-layer x-menu x-menu-plain x-date-menu']//button[@class='x-btn-text']")));
		String date=driver.findElement(By.xpath("//div[@class='x-layer x-menu x-menu-plain x-date-menu']//button[@class='x-btn-text']")).getText();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[@class='x-date-right']/a")));
		while(!(date.contains("August 2023")))
		{
			driver.findElement(By.xpath("//td[@class='x-date-right']/a")).click();
			date=driver.findElement(By.xpath("//div[@class='x-layer x-menu x-menu-plain x-date-menu']//button[@class='x-btn-text']")).getText();
		}
		driver.findElement(By.xpath("//span[text()='14']")).click();
	}
}
