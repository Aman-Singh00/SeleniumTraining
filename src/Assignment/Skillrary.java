package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Skillrary {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://assess.skillrary.com/skillrary/whiteboard");
		WebElement text = driver.findElement(By.id("ancText"));
		String colour = text.getAttribute("id");
		System.out.println(colour);
		
		
		
		
		
	}

}
