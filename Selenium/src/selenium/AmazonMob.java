package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonMob {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver","D:\\Selenium\\edgedriver_win64\\msedgedriver.exei");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:/www.amazon.in/");
		Thread.sleep(3000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile");
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(4000);
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.quit();
	}
}
