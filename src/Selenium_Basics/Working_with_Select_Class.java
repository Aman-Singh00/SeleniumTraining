package Selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Working_with_Select_Class {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/AMAN%20SINGH/Downloads/demo.html");
		
		
		//identify the select tag webelement
		WebElement wb = driver.findElement(By.id("standard_cars"));
		
		//create an object of select class
		Select s = new Select(wb);
		//select by index
		s.selectByIndex(5);
		Thread.sleep(2000);
		//select by visible text
		s.selectByVisibleText("Audi");
		Thread.sleep(2000);
		//select by value
		s.selectByValue("lr");
	}

}
