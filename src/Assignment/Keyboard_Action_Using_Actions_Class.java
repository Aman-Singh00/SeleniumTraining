package Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_Action_Using_Actions_Class {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		WebElement searchbox = driver.findElement(By.id("small-searchterms"));
		
		Actions act = new Actions(driver);
		act.keyDown(Keys.SHIFT).sendKeys(searchbox,"mobile" ).perform();
		act.keyUp(Keys.SHIFT).perform();
		act.keyDown(Keys.CONTROL).sendKeys(searchbox,"a").perform();
		act.keyUp(Keys.CONTROL).perform();
		act.keyDown(Keys.CONTROL).sendKeys(searchbox,"C").perform();
		act.keyDown(Keys.CONTROL).sendKeys(searchbox,"v").perform();
		
		
	
		
		
	}

}
