package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundAssignButton {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leafground.com/pages/Button.html");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("size")).getCssValue("background-color");
		
		driver.findElement(By.id("size")).getText();
		
		driver.findElement(By.id("size")).getLocation();
		
		driver.findElement(By.id("size")).getTagName();
		
		System.out.println(driver.findElement(By.id("size")).getCssValue("background-color"));
		
		System.out.println(driver.findElement(By.id("size")).getText());
		
		System.out.println(driver.findElement(By.id("size")).getLocation());
		
		System.out.println(driver.findElement(By.id("size")).getTagName());
		
	}
}


