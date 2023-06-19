package testng_basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DWS_AddToCArt {

		
		@Test
		public void addToCart()
		{
			System.setProperty("webdriver.chrome.driver", "./src/main/resources/Driver/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://demowebshop.tricentis.com/");
			driver.findElement(By.partialLinkText("Log")).click();
			driver.findElement(By.cssSelector("input[id='Email']")).sendKeys("ak6838883@gmail.com");
			driver.findElement(By.cssSelector("input[id='Password']")).sendKeys("Aman@123");
			driver.findElement(By.cssSelector("input[value='Log in']")).click();
		}
		
		

	}


