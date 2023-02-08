package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumSponsors {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver","D:\\Selenium\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//li[@class=\"nav-item dropdown\"]/a")).click();
		driver.findElement(By.xpath("//div[@class=\"dropdown-menu show\"]/a[7]")).click();
		Thread.sleep(4000);
		System.out.println(driver.findElement(By.xpath("//main/div[2]/h2")).getText());
		driver.quit();
		}
}
