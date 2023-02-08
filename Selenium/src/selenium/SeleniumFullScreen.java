package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumFullScreen {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev");
		Thread.sleep(3000);
		driver.manage().window().fullscreen();
	}
}
