package Assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_window_Assignment4 {

	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/AMAN%20SINGH/Downloads/MultipleWindow.html");
		
		driver.findElement(By.cssSelector("input[type='button']")).click();
		Thread.sleep(2000);
		
		//String parent_window = driver.getWindowHandle();
		Set<String> child_window = driver.getWindowHandles();
		for(String window:child_window)
		{
			driver.switchTo().window(window);
			if(driver.getTitle().contains("Olive Garden"))
			{
				driver.close();
			}
		}
		}
	}

