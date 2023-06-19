package Selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Working_with_Passing_value_Action_class {
	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demowebshop.tricentis.com/");
			
			WebElement searchbox = driver.findElement(By.cssSelector("input[id='small-searchterms']"));
			
			//create object of action class
			Actions act = new Actions(driver);
			
			act.moveToElement(searchbox).click().sendKeys("computer",Keys.ENTER).perform();
			Thread.sleep(2000);
			act.sendKeys(Keys.PAGE_DOWN).perform();
			Thread.sleep(2000);
			act.sendKeys(Keys.PAGE_UP).perform();
		}

}
