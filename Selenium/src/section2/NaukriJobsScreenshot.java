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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NaukriJobsScreenshot {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		driver.get("https://www.naukri.com/");
		Actions act=new Actions(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Jobs']")));
		act.moveToElement(driver.findElement(By.xpath("//div[text()='Jobs']"))).perform();
		driver.findElement(By.xpath("//div[text()='IT jobs']")).click();
		driver.findElement(By.cssSelector("[title='CitiusTech hiring For VB.NET developer']")).click();
		String mid=driver.getWindowHandle();
		Set<String> aid=driver.getWindowHandles();
		for(String id:aid)
		{
			if(!(mid.equals(id)))
			{
				driver.switchTo().window(id);
			}
		}
		WebElement job=driver.findElement(By.xpath("//section[@class='sim-jobs-right']/h2"));
		File src=job.getScreenshotAs(OutputType.FILE);
		File trg=new File("./Screenshot/job.png");
		FileUtils.copyFile(src, trg);
		driver.quit();
		
	}
}
