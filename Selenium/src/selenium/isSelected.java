package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class isSelected {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver","D:\\Selenium\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement select=driver.findElement(By.id("username"));
		boolean s=select.isSelected();
		if (s==true) {
			System.out.println("Selected");
		}
		else
			System.out.println("Not selected");
		Thread.sleep(5000);
		driver.quit();
	}
}
