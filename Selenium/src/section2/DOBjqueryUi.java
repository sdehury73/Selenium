package section2;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DOBjqueryUi {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://jqueryui.com/datepicker/");
		driver.switchTo().frame(0);
		WebElement a=driver.findElement(By.className("hasDatepicker"));
		a.click();
		for(;;)
		{
			driver.findElement(By.xpath("//span[text()='Prev']")).click();
			String month=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']/span[1]")).getText();
			String year=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']/span[2]")).getText();
			if(month.equals("December") && year.equals("1999"))
			{
				System.out.println(month+" "+year);
				WebElement date=driver.findElement(By.cssSelector("[data-date='30']"));
				date.click();
				break;
			}
		}
		System.out.println(a.getAttribute("value"));
		driver.quit();
	}
}
