package testcases;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import frameworkUtility.Base_Test;

public class DWS_Register extends Base_Test {
	
	@DataProvider(name="testData")
	public Object[][] testData()
	{
		Object[][] data = new Object[2][5];
		data[0][0]="Aman";
		data[0][1]="Singh";
		data[0][2]="abcd@gmail.com";
		data[0][3]="abcde";
		data[0][4]="abcde";
		
		data[1][0]="Manoj";
		data[1][1]="Singh";
		data[1][2]="efgh@gmail.com";
		data[1][3]="efgh";
		data[1][4]="efgh";
		
		return data;
		
		
	}
	
	@Test(dataProvider = "testData")
	public void demotest(String FN,String LN, String Email,String Password,String ConfirmPassword) {
		
//		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.className("ico-register")).click();
		driver.findElement(By.id("FirstName")).sendKeys(FN);
		driver.findElement(By.id("LastName")).sendKeys(LN);
		driver.findElement(By.id("Email")).sendKeys(Email);
		driver.findElement(By.id("Password")).sendKeys(Password);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(ConfirmPassword);
	
		
		
	}
	

}
