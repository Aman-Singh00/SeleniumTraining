package Selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_And_Drop_Actions {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		Actions act = new Actions(driver);
		
		act.dragAndDrop(driver.findElement(By.xpath("(//div[text()='Rome'])[2]")), driver.findElement(By.xpath("//div[text()='Italy']"))).perform();
		act.dragAndDrop(driver.findElement(By.xpath("(//div[text()='Madrid'])[2]")), driver.findElement(By.xpath("//div[text()='Spain']"))).perform();
		act.dragAndDrop(driver.findElement(By.xpath("(//div[text()='Oslo'])[2]")), driver.findElement(By.xpath("//div[text()='Norway']"))).perform();
		act.dragAndDrop(driver.findElement(By.xpath("(//div[text()='Copenhagen'])[2]")), driver.findElement(By.xpath("//div[text()='Denmark']"))).perform();
		act.dragAndDrop(driver.findElement(By.xpath("(//div[text()='Seoul'])[2]")), driver.findElement(By.xpath("//div[text()='South Korea']"))).perform();
		act.dragAndDrop(driver.findElement(By.xpath("(//div[text()='Stockholm'])[2]")), driver.findElement(By.xpath("//div[text()='Sweden']"))).perform();
		act.dragAndDrop(driver.findElement(By.xpath("(//div[text()='Washington'])[2]")), driver.findElement(By.xpath("//div[text()='United States']"))).perform();
		
		//reverse
		act.dragAndDrop(driver.findElement(By.xpath("//div[text()='Italy']")), driver.findElement(By.xpath("(//div[text()='Rome'])[2]"))).perform();
		act.dragAndDrop(driver.findElement(By.xpath("//div[text()='Spain']")), driver.findElement(By.xpath("(//div[text()='Madrid'])[2]"))).perform();
		//act.dragAndDrop(driver.findElement(By.xpath("(//div[text()='Oslo'])[2]")), driver.findElement(By.xpath("(//div[text()='Oslo'])[2]"))).perform();
		//act.dragAndDrop(driver.findElement(By.xpath("(//div[text()='Copenhagen'])[2]")), driver.findElement(By.xpath("//div[text()='Denmark']"))).perform();
		//act.dragAndDrop(driver.findElement(By.xpath("(//div[text()='Seoul'])[2]")), driver.findElement(By.xpath("//div[text()='South Korea']"))).perform();
		//act.dragAndDrop(driver.findElement(By.xpath("(//div[text()='Stockholm'])[2]")), driver.findElement(By.xpath("//div[text()='Sweden']"))).perform();
		//act.dragAndDrop(driver.findElement(By.xpath("(//div[text()='Washington'])[2]")), driver.findElement(By.xpath("//div[text()='United States']"))).perform();
		
		
	}
}
