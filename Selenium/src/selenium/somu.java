package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class somu {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver","D:\\Selenium\\edgedriver_win64\\msedgedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("MOBILE");
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(5000);
		String title=driver.getTitle();
		System.out.println(title);
		Thread.sleep(5000);
		driver.quit();
		
	}

}
