package Selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_on_xpath1 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/AMAN%20SINGH/OneDrive/Desktop/xpath1.html");
		driver.findElement(By.xpath("/html/body/div[1]/input[1]")).sendKeys("Aman");
		driver.findElement(By.xpath("/html/body/div[1]/input[2]")).sendKeys("Singh");
	}

}
