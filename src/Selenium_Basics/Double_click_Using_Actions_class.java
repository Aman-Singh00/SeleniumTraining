package Selenium_Basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_click_Using_Actions_class {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		//WebElement double_click = driver.findElement(By.xpath("//button[contains(text(),'Double-Click')]"));
		WebElement right = driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions act = new Actions(driver);
		//act.doubleClick(double_click).perform();
		act.contextClick(right).perform();
		act.click(driver.findElement(By.xpath("//span[text()='Delete']"))).perform();
		Thread.sleep(5000);
		Alert alt = driver.switchTo().alert();
		alt.accept();
	}

}
