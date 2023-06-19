package DemoWebShop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DWS_Login_7 {
	
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
		
		//identify the forgot password link and click on it
		driver.findElement(By.xpath("//a[text()='Forgot password?']")).click();
		
		//identify email id text field is and provide email id
		driver.findElement(By.xpath("//input[@class='email']")).sendKeys("ak6838883@gmail.com");
		
		//click on recover button
		driver.findElement(By.xpath("//input[@value='Recover']")).click();
		
		//fetch confirmation message
		String confirmation_msg = driver.findElement(By.xpath("//div[contains(text(),'Email with instructions')]")).getText();
		//System.out.println(confirmation_msg);
		
		//actual confirmation message
		
		String Actual_confirmation_msg="Email with instructions has been sent to you.";
		//validation
		if(Actual_confirmation_msg.equalsIgnoreCase(confirmation_msg))
		{
			System.out.println("Email sent to your registered email id");
		}
		else
		{
			System.out.println("Email is invalid");
		}
		
		//close the window
		driver.close();
		
		
	}

}
