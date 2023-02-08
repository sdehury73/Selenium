package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonDim {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("Television");
		search.submit();
		WebElement result=driver.findElement(By.xpath("//span[text()=\"RESULTS\"]"));
		Rectangle r=result.getRect();
		System.out.println("X co-ordinate: "+r.getX());
		System.out.println("Y co-ordinate: "+r.getY());
		System.out.println("Height: "+r.getHeight());
		System.out.println("Width: "+r.getWidth());
		Thread.sleep(5000);
		driver.quit();
	}
}
