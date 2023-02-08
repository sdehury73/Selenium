package section2;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoOrangeHRMShare {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(20));
		w.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='orangehrm-login-footer-sm']/a[1]")));
		String aim=driver.getWindowHandle();
		driver.findElement(By.xpath("//div[@class='orangehrm-login-footer-sm']/a[1]")).click();
		Set<String> ai1=driver.getWindowHandles();
		String a1 = null;
		String a2 = null;
		String a3 = null;
		String a4 = null;
		for(String i:ai1)
		{
			if(!(aim.equals(i)))
				a1=i;
		}
		driver.findElement(By.xpath("//div[@class='orangehrm-login-footer-sm']/a[2]")).click();
		Set<String> ai2=driver.getWindowHandles();
		for(String i:ai2)
		{
			if(!(aim.equals(i)) && !(ai1.equals(i)))
				a2=i;
		}
		driver.findElement(By.xpath("//div[@class='orangehrm-login-footer-sm']/a[3]")).click();
		Set<String> ai3=driver.getWindowHandles();
		for(String i:ai3)
		{
			if(!(aim.equals(i)) && !(ai1.equals(i)) && !(ai2.equals(i)))
				a3=i;
		}
		driver.findElement(By.xpath("//div[@class='orangehrm-login-footer-sm']/a[4]")).click();
		Set<String> ai4=driver.getWindowHandles();
		for(String i:ai4)
		{
			if(!(aim.equals(i)) && !(ai1.equals(i)) && !(ai2.equals(i)) && !(ai3.equals(i)))
			{
				a4=i;
			}
		}
		driver.close();
		driver.switchTo().window(a4);
		driver.close();
		driver.switchTo().window(a3);
		driver.close();
		driver.switchTo().window(a2);
		driver.close();
		driver.switchTo().window(a1);
		System.out.println(driver.getTitle());
		driver.quit();
	}
}
