package section2;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartIphone24 {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","D:\\Selenium\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("Iphone X",Keys.ENTER);
		List<WebElement> iList=driver.findElements(By.xpath("//div[contains(@class,'kHMtA')]//div[contains(text(),'APPLE')]"));
		int a=1;
		for(WebElement iphone:iList)
		{
			String p=iphone.getText();
			WebElement price=driver.findElement(By.xpath("//div[text()='"+p+"']/../../div[2]/div/div/div"));
			System.out.print("	"+a+" : ");
			System.out.println(iphone.getText());
			String pr=price.getText();
			System.out.println("Price : "+pr);
			a++;
		}
		driver.quit();
	}
}
