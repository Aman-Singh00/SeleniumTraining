package testcases;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import frameworkUtility.Base_Test;

public class DWS_Newsletter extends Base_Test {
	
	@DataProvider(name="newsletterTestData")
	public Object[][] newsletterTestData()
	{
		Object[][] data = new Object[1][1]; 
		data[0][0]="ak6838883@gmail.com";
		return data;
	}
	@Test(dataProvider = "newsletterTestData")
	public void newsletter(String username) {
		
//		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.id("newsletter-email")).sendKeys(username);
		driver.findElement(By.xpath("//input[@value='Subscribe']")).click();
		//driver.close();
	}

}
