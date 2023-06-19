package Selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_Webelement {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		String text_value = driver.findElement(By.linkText("Computers")).getText();
		System.out.println(text_value);
		
		String Register_value=driver.findElement(By.linkText("Log in")).getText();
		System.out.println(Register_value);
		
		String id_value=driver.findElement(By.id("small-searchterms")).getAttribute("id");
		System.out.println(id_value);
		
		//value attribute
		System.out.println(driver.findElement(By.id("small-searchterms")).getAttribute("value"));
		//when you pass some value in the searchbox it will change.
		driver.findElement(By.id("small-searchterms")).sendKeys("mobile");
		System.out.println(driver.findElement(By.id("small-searchterms")).getAttribute("value"));
		
		
		
		driver.quit();
		
		
	}

}
