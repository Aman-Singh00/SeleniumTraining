package Selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Working_with_Multiple_Select_dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/AMAN%20SINGH/OneDrive/Desktop/html.html");
		WebElement dropdown = driver.findElement(By.id("movies"));
		Select s = new Select(dropdown);
		s.selectByIndex(0);
		Thread.sleep(2000);
		s.deselectByIndex(0);

	}

}
