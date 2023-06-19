package Selenium_Basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3_on_findElements {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		List<WebElement> all_links = driver.findElements(By.xpath("//a"));
		
		for(int i=0;i<=all_links.size()-1;i++)
		{
				String value = all_links.get(i).getAttribute("href");
				System.out.println(value);
		}
		
	}
}
