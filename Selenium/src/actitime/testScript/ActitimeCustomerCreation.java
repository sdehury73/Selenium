package actitime.testScript;

import java.io.IOException;
import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import actitime.genericLib.DataUtility;

public class ActitimeCustomerCreation {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		DataUtility d=new DataUtility();
		driver.get(d.LoginData("url"));
		driver.findElement(By.id("username")).sendKeys(d.LoginData("un"),Keys.TAB,d.LoginData("pwd"),Keys.ENTER);
		driver.findElement(By.cssSelector("[id=container_tasks]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Add New')]")).click();
		driver.findElement(By.xpath("//div[@class=\"item createNewCustomer\"]")).click();
		Random r=new Random();
		int num=r.nextInt(1000);
		String customerName=d.Excel("sheet1",3,0);
		customerName=customerName+num;
		driver.findElement(By.xpath("//div[@class=\"customerNameDiv\"]/input[@placeholder=\"Enter Customer Name\"]")).sendKeys(customerName);
		driver.findElement(By.xpath("//div[@class=\"inputContainer\"]/textarea[@placeholder=\"Enter Customer Description\"]")).sendKeys(d.Excel("sheet1",3,1));
		driver.findElement(By.xpath("//div[contains(text(),\"Create Customer\")]")).click();
	}
}
