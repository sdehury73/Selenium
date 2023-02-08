package selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSize {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.manage().window().setSize(new Dimension(200,600));
		driver.manage().window().setPosition(new Point(400,300));
		System.out.println("The size is: "+driver.manage().window().getSize());
		Thread.sleep(3000);
		driver.quit();
	}
}
