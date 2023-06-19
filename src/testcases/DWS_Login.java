package testcases;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import frameworkUtility.Base_Test;

public class DWS_Login extends Base_Test {
	
	
	@DataProvider(name="loginTestData")
	public Object[][] loginTestData()
	{
		Object[][] data = new Object[1][2];
		data[0][0]="ak6838883@gmail.com";
		data[0][1]="Aman@1234";
		return data;
		
	}
	//@Parameters({"username","password"})
	@Test(dataProvider = "loginTestData")
	public  void login(String username,String password) {
		
//		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.xpath("//input[@class='email']")).sendKeys(username); 
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		System.out.println("Successfully_User_is_able_to_login");
		//driver.close();
		
		
	}

}
