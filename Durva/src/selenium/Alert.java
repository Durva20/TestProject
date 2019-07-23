package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C://Users//sgmor//Desktop//selenium//chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
	String url="http://demo.guru99.com/test/delete_customer.php";
	driver.get(url);
	driver.manage().window().maximize();
	driver.findElement(By.xpath(".//input[@type='submit']")).click();
	driver.switchTo().alert().accept();
	}
}
