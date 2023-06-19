package Selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Working_with_Action_class {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
			
		//identify the webelement
		WebElement action = driver.findElement(By.xpath("(//a[contains(text(),'Computers')])[1]"));
		
		//create an object of actions class
		Actions act = new Actions(driver);
		act.moveToElement(action).perform();	
		act.moveToElement(driver.findElement(By.xpath("(//a[contains(text(),'Electronics')])[1]"))).build().perform();
		act.click(driver.findElement(By.xpath("(//a[contains(text(),'Camera, photo')])[1]"))).build().perform();

	}

}
