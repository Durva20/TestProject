package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UsingDragnDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C://Users//sgmor//Desktop//selenium//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Actions a=new Actions(driver);
		WebElement src= driver.findElement(By.xpath("//*[@id=\'fourth\']/a"));
	
		WebElement dest=driver.findElement(By.xpath("//*[@id=\'amt8\']/li"));
		a.dragAndDrop(src, dest).build().perform();
		//a.release(dest).build().perform();
		
	

	}

}
