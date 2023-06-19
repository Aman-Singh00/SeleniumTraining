package Selenium_Basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2_on_Findelements {
	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/AMAN%20SINGH/Downloads/demo.html");
		List<WebElement> all_box = driver.findElements(By.xpath("//input[@name='fname']"));
		for(int i=0;i<=all_box.size()-1;i++)
		{
			all_box.get(i).sendKeys("Aman");
		}
		
		
	}

}
