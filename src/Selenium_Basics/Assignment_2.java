package Selenium_Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_2 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.cssSelector("input[id='newsletter-email']")).sendKeys("ak6838883@gmail.com");
		System.out.println(driver.findElement(By.cssSelector("input[id='newsletter-email']")).isDisplayed());
		System.out.println(driver.findElement(By.cssSelector("input[id='newsletter-email']")).isEnabled());
		driver.findElement(By.cssSelector("input[id='newsletter-subscribe-button']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id='newsletter-email']")).isDisplayed());
		System.out.println(driver.findElement(By.cssSelector("input[id='newsletter-email']")).isEnabled());
		driver.quit();
	}

}
