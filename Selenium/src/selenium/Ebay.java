package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Ebay {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		System.out.println("Title is: "+driver.getTitle());
		System.out.println("Url is: "+driver.getCurrentUrl());
	}
}
