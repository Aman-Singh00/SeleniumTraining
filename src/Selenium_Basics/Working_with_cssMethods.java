package Selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_cssMethods {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.id("small-searchterms")).click();
		
		String color_css=driver.findElement(By.linkText("Register")).getCssValue("color");
		System.out.println(color_css);
		
//		String Font_size=driver.findElement(By.partialLinkText("Books")).getCssValue("font-size");
//		System.out.println(Font_size);
//		
//		String color=driver.findElement(By.partialLinkText("Books")).getCssValue("color");
//		System.out.println(color);
		driver.quit();
		
	}

}
