package testng_basics;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class Working_With_Testng_Attribute {
	
	
	
	@Test(groups = "smoketest")
	public void searchText()
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.id("small-searchterms")).sendKeys("mobile",Keys.ENTER);
		driver.close();
	}
	//(dependsOnMethods = "register")
	@Test
	public void loginTest()
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.xpath("//input[@class='email']")).sendKeys("ak6838883@gmail.com"); 
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Aman@123");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		System.out.println("Successfully_User_is_able_to_login");
		driver.close();
	}
	@Test
	public void register()
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver  = new ChromeDriver();
		Random r = new Random();
		int num=r.nextInt(10000);
		//System.out.println(num);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.className("ico-register")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Aman");
		driver.findElement(By.id("LastName")).sendKeys("Singh");
		driver.findElement(By.id("Email")).sendKeys("ak"+num+"@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Aman@123");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Aman@123");
		driver.findElement(By.id("register-button")).click();
		driver.close();	
	}
	@Test(enabled = false)
	public void subscribe()
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.id("newsletter-email")).sendKeys("ak6838883@gmail.com");
		driver.findElement(By.id("newsletter-subscribe-button")).click();
		driver.close();
	}
}


