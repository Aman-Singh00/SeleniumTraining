package Selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Assignment1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("Books")).click();
		//identifying sort by
		WebElement sortby = driver.findElement(By.id("products-orderby"));
		Select s = new Select(sortby);
		s.selectByVisibleText("Price: Low to High");
		Thread.sleep(2000);
		//identifying display
		WebElement display = driver.findElement(By.id("products-pagesize"));
		Select s1 = new Select(display);
		s1.selectByValue("https://demowebshop.tricentis.com/books?pagesize=8");
		Thread.sleep(2000);
		//identifying view
		WebElement view = driver.findElement(By.id("products-viewmode"));
		Select s2 = new Select(display);
		s2.selectByVisibleText("Grid");
		driver.close();
		
	}

}
