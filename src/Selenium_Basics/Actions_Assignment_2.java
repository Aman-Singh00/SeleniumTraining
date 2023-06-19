package Selenium_Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Assignment_2 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		
		WebElement job = driver.findElement(By.xpath("//div[text()='Jobs']"));
		
		//create the object of Actions class
		Actions act = new Actions(driver);
		act.moveToElement(job).perform();
		act.click(driver.findElement(By.xpath("//div[text()='Jobs by skill']"))).build().perform();
		//act.click(driver.findElement(By.xpath("//a[text()='View all Top IT Skills']"))).build().perform();
		act.click(driver.findElement(By.cssSelector("a[title='Java Jobs']"))).build().perform();
		
	}

}
