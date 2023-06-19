package Selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_boolean_methods {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		System.out.println(driver.findElement(By.cssSelector("input[value='Search']")).isDisplayed());
		System.out.println(driver.findElement(By.cssSelector("input[value='Search']")).isEnabled());
		
		driver.findElement(By.cssSelector("input[value='1']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[value='1']")).isSelected());
		driver.findElement(By.cssSelector("input[value='1']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[value='2']")).isSelected());
		driver.findElement(By.cssSelector("input[value='1']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[value='3']")).isSelected());
		driver.findElement(By.cssSelector("input[value='1']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[value='4']")).isSelected());
		
		
		
		
		
		
		
		
		
		
		
	}

}
