package Selenium_Basics;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relative_xpath_test_case2 {
	
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Random r = new Random();
		int num=r.nextInt(1000);
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		driver.findElement(By.xpath("//input[@id='gender-male']")).click();
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Aman");
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Singh");
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("ak"+num+"@gmail.com");
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Aman@123");
        driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("Aman@123");
        driver.findElement(By.xpath("//input[@id='register-button']")).click();
        System.out.println(driver.findElement(By.xpath("//div[@class='result']")).getText());
        driver.close();
        
        
		
		
		
	}

}
