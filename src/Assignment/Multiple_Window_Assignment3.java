package Assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_Window_Assignment3 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/AMAN%20SINGH/Downloads/MultipleWindow.html");
		

		//Identify the parent window
		String parent_window = driver.getWindowHandle();
		System.out.println(parent_window);
		
		//click on food sites which will open the child window
		driver.findElement(By.cssSelector("input[type='button']")).click();
		Thread.sleep(2000);
		
		//get the child window along with parent window
		Set<String> child_window = driver.getWindowHandles();
		System.out.println(child_window);
		
		//switch to child window
		for(String window:child_window)
		{
			driver.switchTo().window(window);
			System.out.println(driver.getTitle());
			Thread.sleep(2000);
		}
		
		driver.quit();
	}

}
