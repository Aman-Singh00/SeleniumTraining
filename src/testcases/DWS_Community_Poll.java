package testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import frameworkUtility.Base_Test;

public class DWS_Community_Poll extends Base_Test {
	

	
	@Test()
	public void vote() {
	driver.findElement(By.id("pollanswers-1")).click();
	driver.findElement(By.id("vote-poll-1")).click();
	//driver.close();
	
	
	}
	@Test(enabled = false)
	public  void login() {
		
//		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.xpath("//input[@class='email']")).sendKeys("ak6838883@gmail.com"); 
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Aman@123");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		System.out.println("Successfully_User_is_able_to_login");
		//driver.close();
		
		
	}

}
