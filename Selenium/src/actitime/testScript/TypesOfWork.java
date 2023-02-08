package actitime.testScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import actitime.genericLib.BaseClass;
@Listeners(actitime.genericLib.ListenerImplementation.class)
public class TypesOfWork extends BaseClass{
	@Test
	public void work() throws EncryptedDocumentException, IOException
	{
		driver.findElement(By.cssSelector(".popup_menu_button.popup_menu_button_settings")).click();
		driver.findElement(By.xpath("//a[text()='Types of Work']")).click();
		driver.findElement(By.cssSelector("[class='i']")).click();
		driver.findElement(By.cssSelector("[name='name']")).sendKeys(du.Excel("sheet1",3,1),Keys.TAB,Keys.ARROW_DOWN,Keys.TAB);
		driver.findElement(By.xpath("//input[@onclick='handleCancel();']")).click();
		System.out.println(cu.getMsg(driver));
		cu.ok(driver);
	}
}
