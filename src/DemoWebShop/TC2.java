package DemoWebShop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
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
		Thread.sleep(3000);
		//Clicking on cart
		driver.findElement(By.xpath("(//span[@class=\"cart-label\"])[1]")).click();
		//Terms and conditions
		driver.findElement(By.id("termsofservice")).click();
		//Checkout
		driver.findElement(By.id("checkout")).click();
		//Billing Continue
		driver.findElement(By.xpath("//input[@onclick='Billing.save()']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@onclick='PaymentMethod.save()']")).click();
		//Selecting CC
		driver.findElement(By.xpath("//input[@value='Payments.Manual']")).click();
		Thread.sleep(9000);
		
		//Selecting type of CC
//		Thread.sleep(3000);
//		WebElement card=driver.findElement(By.id("CreditCardType"));
//		Select s=new Select(card);
//		s.selectByVisibleText("Visa");
//		//Card Name
//		driver.findElement(By.id("CardholderName")).sendKeys("Manu");
//		//Card Num
//		driver.findElement(By.id("CardNumber")).sendKeys("1000 2000 3000 4000");
//		//Selecting Expire Month
//		WebElement expmon=driver.findElement(By.id("ExpireMonth"));
//		Select s1=new Select(expmon);
//		s1.selectByVisibleText("05");
//		//Selecting Expire Year
//		WebElement expyear=driver.findElement(By.id("ExpireYear"));
//		Select s2=new Select(expmon);
//		s2.selectByVisibleText("2025");
//		
//		
//		driver.findElement(By.xpath("//input[@onclick='PaymentInfo.save()']")).click();
//		
//		System.out.println(driver.findElement(By.className("validation-summary-errors")));
//		
		
		//driver.findElement(By.xpath("//input[@value='Payments.CashOnDelivery']")).click();
//		Thread.sleep(1000);
//		
//		Thread.sleep(2000);
		
//		Confirming payment option
		driver.findElement(By.xpath("//input[@onclick='PaymentInfo.save()']")).click();
		Thread.sleep(3000);
		//Confirming Order
		driver.findElement(By.xpath("//input[@onclick='ConfirmOrder.save()']")).click();
		Thread.sleep(3000);
		//Printing SUccessfull msg
		String msg=driver.findElement(By.className("title")).getText();
		System.out.println(msg);
		driver.close();
		
	}

}