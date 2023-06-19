package Selenium_Basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_on_findElements {
	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		
		List<WebElement> all_radio_buttons = driver.findElements(By.xpath("//ul[@class='poll-options']//input"));
		
		for(int i=0;i<=all_radio_buttons.size()-1;i++)
		{
			
			all_radio_buttons.get(i).click();
			
		}
		
	}

}
