package Assignment;

import javax.swing.Action;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Chatgpt {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement element = driver.findElement(By.xpath("//button[contains(text(),'Double')]"));
		
		Actions act = new Actions(driver);
		act.doubleClick(element).perform();
		Thread.sleep(5000);
		Alert alert = driver.switchTo().alert();
		
		
		String msg = alert.getText();
		System.out.println(msg);
		alert.accept();
		driver.close();
		
		
		
		
	}

}
