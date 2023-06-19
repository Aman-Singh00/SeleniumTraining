package DemoWebShop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DWS_DD_9 {

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
		
		driver.findElement(By.xpath("(//a[@href='/digital-downloads'])[1]")).click();
		//Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@data-productid='53']/div[2]/div[3]/div[2]/input")).click();
		//Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[@class=\"cart-label\"])[1]")).click();
		driver.findElement(By.id("termsofservice")).click();
		driver.findElement(By.id("checkout")).click();
		driver.findElement(By.xpath("//input[@onclick='Billing.save()']")).click();
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Payments.CashOnDelivery']")).click();
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@onclick='PaymentMethod.save()']")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@onclick='PaymentInfo.save()']")).click();
		//driver.findElement(By.xpath("//input[@onclick='PaymentInfo.save()']")).click();
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@onclick='ConfirmOrder.save()']")).click();
		//Thread.sleep(3000);
		String msg=driver.findElement(By.xpath("//div[@class='title']")).getText();
		System.out.println(msg);
		driver.close();
		
	}

}