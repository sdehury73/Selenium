package section2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YatraActions {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.yatra.com/");
		List<WebElement> yatra=driver.findElements(By.tagName("img"));
		int i=1;
		for(WebElement y:yatra)
		{
			System.out.print(i+": ");
			System.out.println(y.getAttribute("src"));
			i++;
			
		}
		System.out.println("Size: "+yatra.size());
		driver.quit();
	}
}
