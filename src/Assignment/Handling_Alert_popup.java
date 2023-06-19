package Assignment;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handling_Alert_popup {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement right_click = driver.findElement(By.xpath("//span[text()='right click me']"));
		List<WebElement> options = driver.findElements(By.xpath("//li[contains(@class,'context-menu-item context-menu-icon')]"));
		for(WebElement option:options)
		{
			Actions act = new Actions(driver);
			act.contextClick(right_click).perform();
			option.click();
			Alert alert = driver.switchTo().alert();
			String msg = alert.getText();
			System.out.println(msg);
			alert.accept();
			Thread.sleep(2000);
		}
		driver.close();
	
	}

}
