package DemoWebShop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DWS_Login_5 {
	
	public static void main(String[] args) {
		
		//set the property
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		
		//launch chrome browser
		WebDriver driver = new ChromeDriver();
		
		//open the application
		driver.get("https://demowebshop.tricentis.com/");
		
		//maximize the window
		driver.manage().window().maximize();
		
		//implicit wait
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//click on login link
		driver.findElement(By.className("ico-login")).click();
		
		//identify the username provide valid email id
		driver.findElement(By.xpath("//input[@class='email']")).sendKeys("ak6838883@gmail.com");
		
		//identify the username provide invalid password
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("xyz");
		
		//click on login button
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		//Actual error message
		String Actual_error_message="Login was unsuccessful. Please correct the errors and try again.";
		
		//fetch error message
		String Expected_error_message = driver.findElement(By.xpath("//span[contains(text(),'Login was unsuccessful')]")).getText();
		//System.out.println(Expected_error_message);
		
		//validation
		if(Expected_error_message.equalsIgnoreCase(Actual_error_message))
		{
			System.out.println("Test case is Pass");
		}
		else
		{
			System.out.println("Test case is Fail");
		}
		
		//close the window
		driver.close();
		
		
	}

}
