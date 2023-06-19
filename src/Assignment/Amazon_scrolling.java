package Assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_scrolling {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		//identify search button and click on search button
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile",Keys.ENTER);
		
		//identify one webelement and click on that
		driver.findElement(By.xpath("(//span[contains(text(),'Samsung Galaxy M33 5G')])[1]")).click();
		
		//it will return all id of the window
		Set<String> all_id = driver.getWindowHandles();
		
		for(String id:all_id)
		{
			driver.switchTo().window(id);
			if(driver.getTitle().contains("Samsung Galaxy M33 5G (Emerald Brown, 8GB, 128GB Storage) "))
			{
				break;
			}
		}
		
		driver.findElement(By.cssSelector("i[title='Share']")).click();
		Thread.sleep(5000);
		driver.quit();
		
	}

}
