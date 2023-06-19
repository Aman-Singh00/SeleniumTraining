package Selenium_Basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class print_all_options {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/AMAN%20SINGH/Downloads/demo.html");
		
		
		//identify the select tag webelement
		WebElement wb = driver.findElement(By.id("standard_cars"));
		Select s = new Select(wb);
		List<WebElement> all_options = s.getOptions();
		
		for( WebElement option:all_options)
		{
			System.out.println(option.getText());
		}
		driver.close();
	}

}
