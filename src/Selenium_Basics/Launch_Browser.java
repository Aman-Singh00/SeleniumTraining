package Selenium_Basics;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Browser {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("mobile",Keys.ENTER);
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='SAMSUNG Galaxy F04 (Opal Green, 64 GB)']")).click();
		//String mainid=driver.getWindowHandle();
		Set<String> allid=driver.getWindowHandles();
		String expTitle = "SAMSUNG Galaxy F04";
		for(String id:allid)
		{
			driver.switchTo().window(id);
			String actTitle = driver.getTitle();
			if(actTitle.contains(expTitle))
			{
				break;
			}
		}
		driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
		//Thread.sleep(2000);
		System.out.println("Cart add successfully");
		driver.quit();
		
	
		
		
	
	}

}
