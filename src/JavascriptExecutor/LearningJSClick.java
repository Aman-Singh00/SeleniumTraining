package JavascriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningJSClick {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.get("https://www.oracle.com/in/java/technologies/downloads/");
		
		driver.findElement(By.xpath("//a[text()='jdk-8u371-linux-aarch64.rpm']")).click();
		
		WebElement disablebutton = driver.findElement(By.xpath("//a[text()='Download jdk-8u371-linux-aarch64.rpm']"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", disablebutton);
		
		
		
	}

}
