package Selenium_Basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Assignment4 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("Books")).click();
		//identifying sort by
		WebElement sortby = driver.findElement(By.id("products-orderby"));
		Select s = new Select(sortby);
		 List<WebElement> list = s.getOptions();
		 for(int i=0;i<=list.size()-1;i++)
		 {
			 String value = list.get(i).getText();
			 if(value.equalsIgnoreCase("Price: Low to High"))
			 {
				 s.selectByIndex(i);
				 System.out.println("The index is "+i);
				 break;
			 }
			 Thread.sleep(2000);
		 }
		 driver.close();
		
		
	}

}
