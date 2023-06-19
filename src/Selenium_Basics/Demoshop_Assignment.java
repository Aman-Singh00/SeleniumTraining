package Selenium_Basics;

import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoshop_Assignment {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver  = new ChromeDriver();
		Random r = new Random();
		int num=r.nextInt(10000);
		System.out.println(num);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.className("ico-register")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Aman");
		driver.findElement(By.id("LastName")).sendKeys("Singh");
		driver.findElement(By.id("Email")).sendKeys("ak"+num+"@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Aman@123");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Aman@123");
		driver.findElement(By.id("register-button")).click();
		driver.quit();
		
		
	
	}

}
