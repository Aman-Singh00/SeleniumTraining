package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_Iframe_Assignment3 {
	
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/AMAN%20SINGH/Downloads/iframe.html");
	
	WebElement frame = driver.findElement(By.id("FR1"));
	driver.switchTo().frame(frame);
	driver.findElement(By.id("small-searchterms")).sendKeys("books",Keys.ENTER);
	
	}
}
