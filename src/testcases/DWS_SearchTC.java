package testcases;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import frameworkUtility.Base_Test;

public class DWS_SearchTC extends Base_Test {
	
	
	@DataProvider(name="searchTestData")
	public Object[][] searchTestData()
	{
		Object[][] data = new Object[1][1];
		data[0][0]="mobile";
		return data;
	}
	//@Parameters("search")
	@Test(dataProvider = "searchTestData")
	public void Search(String search)
	{
//				System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
//				WebDriver driver = new ChromeDriver();
//				driver.manage().window().maximize();
//				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//				driver.get("https://demowebshop.tricentis.com/");
				driver.findElement(By.id("small-searchterms")).sendKeys(search);
				driver.findElement(By.xpath("//input[@type='submit']")).click();
				//driver.close();
	}

}
