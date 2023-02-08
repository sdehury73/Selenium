package section2;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonCycle {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Cycle");
		Thread.sleep(3000);
		List<WebElement> l=driver.findElements(By.xpath("//div[@class='autocomplete-results-container']/div"));
		int i=1;
		for (WebElement sugg : l)
		{
			System.out.print(i+": ");
			System.out.println(sugg.getText());
			i++;
		}
		driver.quit();
	}
}
