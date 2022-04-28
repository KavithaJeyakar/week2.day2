package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundAssignEdit {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leafground.com/pages/Edit.html");
		
		driver.manage().window().maximize();
		
		System.out.println("The title is :"+ driver.getTitle());
		
		System.out.println("The current URL is :" + driver.getCurrentUrl());
		
	//	System.out.println("The source code is : " + driver.getPageSource());
		
		driver.findElement(By.name("username")).getAttribute("value");
		
		
		System.out.println(driver.findElement(By.name("username")).getAttribute("value"));
		
		//driver.close();
		
	}
	
}
