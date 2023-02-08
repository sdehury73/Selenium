package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class EbayAmazon {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com");
		Thread.sleep(4000);
		driver.get("https://www.amazon.in");
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);
		driver.navigate().back();
		System.out.println("Ebay title is: "+driver.getTitle());
		Thread.sleep(2000);
		driver.navigate().forward();
		System.out.println("Amazon title is: "+driver.getTitle());
		driver.quit();
	}
}
