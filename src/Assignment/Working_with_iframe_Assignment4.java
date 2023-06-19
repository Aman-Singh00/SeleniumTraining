package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_iframe_Assignment4 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/AMAN%20SINGH/Downloads/iframe.html");
		
		
		driver.switchTo().frame(0);
		driver.findElement(By.id("small-searchterms")).sendKeys("books",Keys.ENTER);
		
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[text()='Google']")).click();
		Thread.sleep(2000);
		driver.quit();
	}

}
