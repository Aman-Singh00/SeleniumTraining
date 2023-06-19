package Selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_iframe {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/AMAN%20SINGH/Downloads/iframe.html");
		
		//switch to demo web shop and click on login
		
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		
		
	}

}
