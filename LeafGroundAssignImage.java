package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundAssignImage {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leafground.com/pages/Image.html");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//img[@src='../images/home.png']")).isDisplayed();
		
		System.out.println(driver.findElement(By.xpath("//img[@src='../images/home.png']")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//img[@src='../images/abcd.jpg']")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//img[@src='../images/abcd.jpg']")).isEnabled());
		
	}
	
}
