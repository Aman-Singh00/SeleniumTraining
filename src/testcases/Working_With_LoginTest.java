package testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import testng_basics.LearningReadExcel;

public class Working_With_LoginTest {
	
	
	@Test(dataProvider = "LoginData")
	public void Login(String UserName, String PassWord)
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.xpath("//input[@class='email']")).sendKeys(UserName); 
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(PassWord);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		driver.close();
	}
	
	@DataProvider(name="LoginData")
	public String[][] loginData() throws IOException
	{
		return LearningReadExcel.objectArray("Login");
	}
	
	

}
