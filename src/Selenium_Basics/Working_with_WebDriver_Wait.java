package Selenium_Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_WebDriver_Wait {
	
	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		//Thread.sleep(3000);
		
		//webdriver wait 
		//WebDriverWait wait = new WebDriverWait(driver, 10);
		//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.linkText("Register"))));
		
		driver.findElement(By.id("small-searchterms")).sendKeys("mobiles");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
		//Thread.sleep(2000);
		//webdriver wait
		//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//strong[@class='result']"))));
		
		String result_msg = driver.findElement(By.xpath("//strong[@class='result']")).getText();
		System.out.println(result_msg);
		
		driver.close();
	}

}
