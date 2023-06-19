package Selenium_Basics;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_1 {
	
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
		//validation for register button
		System.out.println(driver.findElement(By.className("ico-register")).isDisplayed());
		driver.findElement(By.id("gender-male")).click();
		//validation for radio button
		System.out.println(driver.findElement(By.id("gender-male")).isSelected());
		driver.findElement(By.id("FirstName")).sendKeys("Aman");
		//validation for first name text box
		System.out.println(driver.findElement(By.id("FirstName")).isEnabled());
		driver.findElement(By.id("LastName")).sendKeys("Singh");
		//validation for last name text box
		System.out.println(driver.findElement(By.id("LastName")).isEnabled());
		driver.findElement(By.id("Email")).sendKeys("ak"+num+"@gmail.com");
		//validation
		System.out.println(driver.findElement(By.id("Email")).isDisplayed());
		driver.findElement(By.id("Password")).sendKeys("Aman@123");
		//validation
		driver.findElement(By.id("Password")).isDisplayed();
		driver.findElement(By.id("Password")).isEnabled();
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Aman@123");
		//validation
		driver.findElement(By.id("ConfirmPassword")).isDisplayed();
		driver.findElement(By.id("register-button")).click();
		
		System.out.println(driver.findElement(By.cssSelector("div[class='result']")).getText());
		
		
		
		
		driver.close();
		
		
	}

}
