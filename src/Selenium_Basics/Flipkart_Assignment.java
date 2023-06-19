package Selenium_Basics;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_Assignment {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.findElement(By.xpath("//input[@class='email']")).sendKeys("ak6838883@gmail.com");
		driver.findElement(By.xpath("//input[@class='password']")).sendKeys("Aman@123",Keys.ENTER);
		driver.findElement(By.xpath("//a[text()='Log out']")).click();
		driver.quit();
		
		
		
	}

}
