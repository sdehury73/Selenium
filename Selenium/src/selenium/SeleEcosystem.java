package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleEcosystem {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//li[@class=\"nav-item dropdown\"]/a")).click();
		driver.findElement(By.xpath("//div[@class=\"dropdown-menu show\"]/a[4]")).click();
		WebElement ts=driver.findElement(By.cssSelector("[class='display-1 mt-0 mt-md-5 pb-1']"));
		File src=ts.getScreenshotAs(OutputType.FILE);
		File trg=new File("./Screenshot/Ecosystem.png");
		FileUtils.copyFile(src, trg);
		driver.quit();
	}
}
