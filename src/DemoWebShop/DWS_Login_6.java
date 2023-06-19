package DemoWebShop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DWS_Login_6 {
	
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
		
		//click//input[@value='Log in']//input[@value='Log in'] on login link
		driver.findElement(By.className("ico-login")).click();
		
		//identify the username provide registered email id 
		driver.findElement(By.xpath("//input[@class='email']")).sendKeys("ak6838883@gmail.com");
		
		//identify the username provide registered email id 
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Aman@123");
		
		//click on remember check box
		driver.findElement(By.id("RememberMe")).click();
		 WebElement checkbox = driver.findElement(By.id("RememberMe"));
		 if(checkbox.isSelected())
		 {
			 System.out.println("CheckBox is selected");
		 }
		 else
		 {
			 System.out.println("CheckBox is not selected");
		 }
		
		//click on login button
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
	
		
		//close the window
		driver.close();
		
		
	}

}
