package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundAssignLink {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leafground.com/pages/Link.html");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Find where am supposed to go without clicking me?")).getAttribute("href");	
		
		String attribute = driver.findElement(By.linkText("Find where am supposed to go without clicking me?")).getAttribute("href");
		
		System.out.println(attribute);
		
		if (attribute.contains("leafground.com"))
		{
			driver.findElement(By.linkText("Find where am supposed to go without clicking me?")).click();
			
			System.out.println("Find where am I go to without clicking me Page launched");
		}
		else
			System.out.println("Wrong page"); 
	}	
	
}
