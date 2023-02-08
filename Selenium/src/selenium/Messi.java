package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Messi {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","D:\\Selenium\\edgedriver_win64\\msedgedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.className("gLFyf")).sendKeys("Messi");
		driver.findElement(By.cssSelector("[data-ved='0ahUKEwjNzbq5o4_8AhWf2DgGHTPbA1UQ4dUDCAg']")).click();
		
	}
}
