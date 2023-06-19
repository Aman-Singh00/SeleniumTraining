package Selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_for_demoshop {
	
	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[3]/form[1]/input[1]")).sendKeys("mobile");
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[3]/form[1]/input[2]")).click();
		
		//click on register enter this details using xpath captures the msg
		//click on 
	}

}
