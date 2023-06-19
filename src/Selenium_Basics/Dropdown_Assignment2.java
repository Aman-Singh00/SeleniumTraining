package Selenium_Basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Assignment2 {
	public static void main(String[] args) {
		
	
	
	System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.partialLinkText("Books")).click();
	//identifying sort by
	WebElement sortby = driver.findElement(By.id("products-orderby"));
	Select s = new Select(sortby);
	List<WebElement> sort = s.getOptions();
	for(WebElement by:sort)
	{
		System.out.println(by.getText());
	}
	driver.quit();

}
}
