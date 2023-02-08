package selenium;

import org.openqa.selenium.edge.EdgeDriver;

public class D1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","D:\\Selenium\\edgedriver_win64\\msedgedriver.exe");
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.cowin.gov.in");
	}
}
