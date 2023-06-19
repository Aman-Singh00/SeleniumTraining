package DemoWebShop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		//For Login
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("ak6838883@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Aman@123");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		//Test Script
		//Clicking on Digital Downloads
		driver.findElement(By.xpath("(//a[@href='/digital-downloads'])[1]")).click();
		//Adding cart
		driver.findElement(By.xpath("//div[@data-productid='53']/div[2]/div[3]/div[2]/input")).click();
		//Thread.sleep(3000);
		//Clicking on cart
		driver.findElement(By.xpath("(//span[@class=\"cart-label\"])[1]")).click();
		//Terms and conditions
		driver.findElement(By.id("termsofservice")).click();
		//Checkout
		driver.findElement(By.id("checkout")).click();
		//Billing Continue
		driver.findElement(By.xpath("//input[@onclick='Billing.save()']")).click();
		Thread.sleep(3000);
		//Selecting Money order
		driver.findElement(By.xpath("//input[@value='Payments.CheckMoneyOrder']")).click();
		//Clicking Confirm for money order
		Thread.sleep(6000);
		driver.findElement(By.xpath("//input[@onclick=\"PaymentMethod.save()\"]")).click();
		//Clicking Confirm on payment option
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@onclick='PaymentInfo.save()']")).click();
		
		Thread.sleep(3000);
		
		//Confirming Order
		driver.findElement(By.xpath("//input[@onclick='ConfirmOrder.save()']")).click();
		Thread.sleep(3000);
		//Printing Successfull msg
		String msg=driver.findElement(By.className("title")).getText();
		System.out.println(msg);
		driver.close();
		
	}

}