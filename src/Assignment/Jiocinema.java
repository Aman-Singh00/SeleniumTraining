package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jiocinema {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jiocinema.com/");
		
		for(int i=0;i<=50;i++)
		{
		driver.findElement(By.cssSelector("[alt='forward arrow']")).click();
		Thread.sleep(5000);
		}
		
	}

}
