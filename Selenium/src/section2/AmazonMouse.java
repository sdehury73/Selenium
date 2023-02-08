package section2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonMouse {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");
		driver.findElement(By.linkText("Mobiles")).click();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id=\"nav-subnav\"]/a[3]/span[1]")));
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//div[@id=\"nav-subnav\"]/a[3]/span[1]"))).perform();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id=\"nav-flyout-aj:https://images-eu.ssl-images-amazon.com/images/G/31/img18/Electronics/Megamenu/megamenumar18f.json:subnav-sl-megamenu-2:0\"]/div[2]/div/div[1]/h3[2]")));
		driver.findElement(By.xpath("//div[@id=\"nav-flyout-aj:https://images-eu.ssl-images-amazon.com/images/G/31/img18/Electronics/Megamenu/megamenumar18f.json:subnav-sl-megamenu-2:0\"]/div[2]/div/div[1]/ul[2]/li[4]/a")).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='RESULTS']")));
		driver.findElement(By.xpath("//span[text()='Featured']")).click();
		act.keyDown(Keys.ARROW_DOWN).perform();
		act.keyUp(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id=\"search\"]/div[1]")));
		TakesScreenshot t=(TakesScreenshot)driver;
		File src=t.getScreenshotAs(OutputType.FILE);
		File trg=new File("./Screenshot/Laptop.png");
		FileUtils.copyFile(src, trg);
		driver.quit();
	}
}
