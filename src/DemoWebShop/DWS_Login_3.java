package DemoWebShop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DWS_Login_3 {
	
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
		
		//identify the username provide invalid email id 
		driver.findElement(By.xpath("//input[@class='email']")).sendKeys("akgmail.com");
		
		//identify the username provide  invalid password 
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Aman@123");
		
		//click on login button
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		String Expected_email_error_msg = driver.findElement(By.xpath("//span[contains(text(),'valid email address')]")).getText();
		System.out.println(Expected_email_error_msg);
		
		String Actual_email_error_msg="Please enter a valid email address.";
		
		if(Actual_email_error_msg.equalsIgnoreCase(Expected_email_error_msg))
		{
			System.out.println("user is not able to login");
		}
		else
		{
			System.out.println("user is able to login");
		}
		
		//close the window
		driver.close();
		
		
	}

}
