package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Users//sgmor//Desktop//selenium//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
String url="http://www.londonfreelance.org/courses/frames/index.html";
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement b=driver.switchTo().frame("navbar").findElement(By.linkText("home.html"));
		b.click();
		System.out.println(b);
	}

}
