package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.co.in/");
		WebElement logo=driver.findElement(By.cssSelector("[jsmodel='hspDDf']"));
		File src=logo.getScreenshotAs(OutputType.FILE);
		File trg=new File("./Screenshot/google1.png");
		FileUtils.copyFile(src, trg);
		driver.quit();
	}
}
