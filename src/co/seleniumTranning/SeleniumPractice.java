package co.seleniumTranning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class SeleniumPractice {
	public static void main(String[] args) {
		
//	System.setProperty("webdriver.gecko.driver", "C:\\Users\\admin\\Downloads\\geckodriver-v0.20.0-win64\\geckodriver.exe");
//		WebDriver driver =new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver =new ChromeDriver();
		
		
		driver.get("http://www.dhtmlx.com/docs/products/dhtmlxTree/index.shtml");
		
		WebElement from = driver.findElement(By.xpath("//*[@id='treebox1'] and //span[text()='Horror']"));
		
		WebElement to = driver.findElement(By.xpath("//*[@id='treebox2']"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(from, to);
		
	}

}
