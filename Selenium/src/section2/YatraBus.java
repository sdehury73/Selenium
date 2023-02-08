package section2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class YatraBus {
	private static final int ExpectedCondition = 0;

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(20));
		driver.get("https://www.yatra.com/");
		driver.findElement(By.xpath("//span[text()='Buses']")).click();
		WebElement f=driver.findElement(By.id("BE_bus_from_station"));
		f.click();
		w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='opaque-layer abs show-depart']")));
		f.clear();
		f.sendKeys("Bangalore");
		w.until(ExpectedConditions.attributeContains(f,"value","Bangalore"));
		f.sendKeys(Keys.ENTER);
		WebElement t=driver.findElement(By.id("BE_bus_to_station"));
		w.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[class='opaque-layer abs show-arrival']")));
		t.clear();
		t.sendKeys("Pune");
		w.until(ExpectedConditions.attributeContains(t,"value","Pune"));
		t.sendKeys(Keys.ENTER,Keys.TAB,Keys.TAB,Keys.ENTER);
		WebElement res=driver.findElement(By.xpath("//div[@class='result-heading']/h1"));
		w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='result-heading']/h1")));
		File src=res.getScreenshotAs(OutputType.FILE);
		File trg=new File("./Screenshot/Result.png");
		FileUtils.copyFile(src, trg);
		driver.quit();
	}
}
