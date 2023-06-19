package Selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise1 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		//using class name
		//driver.findElement(By.className("search-box-text")).sendKeys("mobile");
		//driver.findElement(By.className("search-box-button")).click();
		
		//using tag name
		driver.findElement(By.tagName("input")).sendKeys("shoes");
		//the return type of find element is the first matching web element
		
	}

}
