package co.seleniumTranning;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver =new ChromeDriver();
			
			
			driver.get("http://www.google.com");
			
			File scrfile =  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
			FileUtils.copyFile(scrfile, new File(".\\screenshots\\google"+LocalDate.now().toString()+"&"+LocalTime.now().format(DateTimeFormatter.ofPattern("HH-mm-ss")).toString()+".png"));
			driver.close();
			
			
			
	}
}
