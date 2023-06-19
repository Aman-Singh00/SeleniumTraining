package Selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_comtainsXpath {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/AMAN%20SINGH/OneDrive/Desktop/xpath.html");
		driver.findElement(By.xpath("//input[contains(@type,'User')]")).sendKeys("Aman");
		driver.findElement(By.xpath("//input[contains(@type,'Pass')]")).sendKeys("Singh");
		driver.findElement(By.xpath("//button[contains(text(),'Sign')]")).click();
	}

}
