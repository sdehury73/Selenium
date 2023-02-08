package actitime.testScript;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import actitime.genericLib.DataUtility;

public class Settings {
	public static void main(String[] args) throws IOException {
		DataUtility d=new DataUtility();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(d.LoginData("url"));
		driver.findElement(By.id("username")).sendKeys(d.LoginData("un"),Keys.TAB,d.LoginData("pwd"),Keys.ENTER);
		driver.findElement(By.xpath("//div[@class='menuTable']/div[2]")).click();
		driver.findElement(By.xpath("//div[text()='Manage system settings & configure actiTIME']/../div[1]")).click();
		Select s=new Select(driver.findElement(By.id("firstHierarchyLevelCodeSelect")));
		s.selectByVisibleText("Product Line");
		System.out.println(driver.findElement(By.id("FormModifiedTextCell")).getText());
		driver.quit();
	}
}
