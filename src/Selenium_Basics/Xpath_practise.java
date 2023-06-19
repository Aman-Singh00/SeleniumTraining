package Selenium_Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_practise {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.youtube.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='search_query']")).sendKeys("selenium tutorial");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']/yt-icon")).click();
		driver.findElement(By.xpath("//yt-formatted-string[text()='Introduction to Selenium WebDriver']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"segmented-like-button\"]/ytd-toggle-button-renderer/yt-button-shape/button/yt-touch-feedback-shape/div/div[2]")).click();
		
	}

}
