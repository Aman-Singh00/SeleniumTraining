
package Selenium_Basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Working_with_select_class_facebook {
	
	
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2000);
		WebElement month = driver.findElement(By.name("birthday_month"));	
		Select s1 = new Select(month);
		List<WebElement> all_option = s1.getOptions();
		
		TreeSet<String> a = new TreeSet();
		for(WebElement option:all_option)
		{
			a.add(option.getText());
		}
		for(String s:a)
		{
			System.out.println(s);
		}
	
		
		
		driver.close();
	}

}
