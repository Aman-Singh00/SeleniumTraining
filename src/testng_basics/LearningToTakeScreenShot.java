package testng_basics;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class LearningToTakeScreenShot {
	
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		
		//How to take the screenshot 
		TakesScreenshot ts = (TakesScreenshot)driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("./Screenshots/FirstScreenshot.png");
		FileHandler.copy(temp, destination);
		
		//How to take the screenshot of a particular webelement
		WebElement log = driver.findElement(By.partialLinkText("Log"));
		File temp1=log.getScreenshotAs(OutputType.FILE);
		File dest1=new File("./Screenshots/element.png");
		FileHandler.copy(temp1, dest1);
		
		
		
	}

}
