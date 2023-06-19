package Selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Assignment5 {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("Aman");
		driver.findElement(By.name("lastname")).sendKeys("Singh");
		driver.findElement(By.name("reg_email__")).sendKeys("9050469462");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Aman@123");
		WebElement day = driver.findElement(By.name("birthday_day"));	
		Select s = new Select(day);
		s.selectByVisibleText("15");
		WebElement month = driver.findElement(By.name("birthday_month"));	
		Select s1 = new Select(month);
		s1.selectByVisibleText("Nov");
		WebElement year = driver.findElement(By.name("birthday_year"));	
		Select s2 = new Select(year);
		s2.selectByVisibleText("2000");
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		
		By h = By.id("username");
		
		
		
		
	
	}

}
