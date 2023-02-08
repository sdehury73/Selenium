package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegdForm {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","D:\\Selenium\\edgedriver_win64\\msedgedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/sdehu/OneDrive/Documents/registrationForm.html");
		driver.findElement(By.xpath("/html/body/input[1]")).sendKeys("Sdehury73");
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("8877647848");
		driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("sdehury737@gmail.com");
		driver.findElement(By.xpath("/html/body/input[4]")).click();
		driver.findElement(By.xpath("/html/body/input[7]")).click();
		driver.findElement(By.xpath("/html/body/input[8]")).click();
	}
}
