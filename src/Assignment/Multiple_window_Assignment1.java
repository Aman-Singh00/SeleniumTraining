package Assignment;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_window_Assignment1 {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		
		//click on facebook it will open child window
		driver.findElement(By.xpath("//a[text()='Facebook']")).click();
		Thread.sleep(2000);
		
		//String parent_window = driver.getWindowHandle();
		Set<String> child_window = driver.getWindowHandles();
		for(String window:child_window)
		{
			driver.switchTo().window(window);
			if(driver.getTitle().contains("Facebook"))
			{
				driver.close();
			}
		}
		}

}
