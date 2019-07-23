package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C://Users//sgmor//Desktop//selenium//chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		String url="http://demo.guru99.com/test/write-xpath-table.html";
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement a=driver.findElement(By.xpath("/html/body/center/table/tbody/tr/td[2]"));
		System.out.println(a.getText());
	}

}
