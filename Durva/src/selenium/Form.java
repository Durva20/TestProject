package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Form {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C://Users//sgmor//Desktop//selenium//chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		String url="https://www.toolsqa.com/automation-practice-form/";
		driver.get(url);
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//input[@name='firstname']")).sendKeys("durva");
		driver.findElement(By.xpath(".//input[@name='lastname']")).sendKeys("narvekar");
		driver.findElement(By.xpath(".//input[@id='sex-1']")).click();
		driver.findElement(By.xpath(".//input[@id='exp-5']")).click();
		driver.findElement(By.xpath(".//input[@id='profession-1']")).click();
		WebElement a=driver.findElement(By.id("photo"));
		a.sendKeys("C:\\Users\\sgmor\\Desktop\\exit.png");
		Select sel=new Select(driver.findElement(By.id("continents")));
		sel.selectByIndex(3);;
	}

}
