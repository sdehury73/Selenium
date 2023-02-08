package actitime.testScript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FlipkartDataprovider {
	@Test(dataProvider ="dataSupplier")
	public void Flipkart(String product)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys(product,Keys.ENTER);
		System.out.println(driver.findElement(By.xpath("//span[contains(@class,'Ermr')]")).getText());
		driver.close();
	}
	@DataProvider
	public Object[] dataSupplier()
	{
		Object[] d=new Object[5];
		d[0]="iphone x";
		d[1]="clock";
		d[2]="watch";
		d[3]="flowers";
		d[4]="laptop";
		return d;
	}
}

