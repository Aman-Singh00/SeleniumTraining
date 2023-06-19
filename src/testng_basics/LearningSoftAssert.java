package testng_basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LearningSoftAssert {
	
	@Test
	public void softAssert()
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		SoftAssert ast = new SoftAssert();
		ast.assertEquals(driver.getTitle(), "Demo Web Shop", "Title Verification");
		driver.findElement(By.partialLinkText("Log")).click();
		ast.assertAll();
		driver.close();
	}
}
