package actitime.genericLib;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class CommonUtility {
	public int RandomNum(int range)
	{
		Random r=new Random();
		int num=r.nextInt(range);
		return num;
	}
	public void getSelectByVisibleText(WebElement dropdown,String visibletext)
	{
		Select s=new Select(dropdown);
		s.selectByVisibleText(visibletext);
	}
	public void titleWait(String title,WebDriver driver)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.titleContains(title));
	}
	public void textToBePresentWait(WebDriver driver,By w,String text)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.textToBePresentInElementLocated(w,text));
	}
	public String getMsg(WebDriver driver)
	{
		Alert alt=driver.switchTo().alert();
		String msg=alt.getText();
		return msg;
	}
	public void ok(WebDriver driver)
	{
		Alert alt=driver.switchTo().alert();
		alt.accept();
	}
	public void SoftAssertContains(String actual,String expected)
	{
		SoftAssert sa=new SoftAssert();
		sa.assertTrue(actual.contains(expected));
		sa.assertAll();
	}
}
