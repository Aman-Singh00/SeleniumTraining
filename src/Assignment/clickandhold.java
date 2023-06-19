package Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class clickandhold {
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
	WebElement boxa= driver.findElement(By.name("A"));
	//WebElement boxb =driver.findElement(By.name("B"));
	Actions act = new Actions(driver);
	//Thread.sleep(2000);
	act.clickAndHold(boxa).build().perform();
	

}
}
