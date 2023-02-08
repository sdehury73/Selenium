package actitime.testScript;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import actitime.genericLib.BaseClass;
import actitime.genericLib.CommonUtility;

public class CustomerCreation extends BaseClass {
	@Test
	public void createCustomer() throws EncryptedDocumentException, IOException
	{
	CommonUtility cu=new CommonUtility();
	int num=cu.RandomNum(10000);
	String customerName=du.Excel("sheet1",3,0);
	customerName=customerName+num;
	driver.findElement(By.cssSelector("[id=container_tasks]")).click();
	driver.findElement(By.xpath("//div[contains(text(),'Add New')]")).click();
	driver.findElement(By.xpath("//div[@class=\"item createNewCustomer\"]")).click();
	driver.findElement(By.xpath("//div[@class=\"customerNameDiv\"]/input[@placeholder=\"Enter Customer Name\"]")).sendKeys(customerName);
	driver.findElement(By.xpath("//div[@class=\"inputContainer\"]/textarea[@placeholder=\"Enter Customer Description\"]")).sendKeys(du.Excel("sheet1",3,1));
	driver.findElement(By.xpath("//div[contains(text(),\"Create Customer\")]")).click();
	cu.textToBePresentWait(driver,By.xpath("//div[@class=\"titleEditButtonContainer\"]/div"),customerName);
	String expectedName=driver.findElement(By.xpath("//div[@class=\"titleEditButtonContainer\"]/div")).getText();
	cu.SoftAssertContains(customerName, expectedName);
	System.out.println(expectedName);
	}
}
