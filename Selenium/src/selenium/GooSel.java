package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class GooSel {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in");
		Thread.sleep(3000);
		driver.get("https://www.selenium.dev/");
	}
}
