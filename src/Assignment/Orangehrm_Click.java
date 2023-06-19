package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Orangehrm_Click {

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement gmail = driver.findElement(By.linkText("Gmail"));
		
		//by default it will take build
		Actions act = new Actions(driver);
		
		act.moveToElement(gmail).contextClick().click().perform();
		
		
		
	}
}
