package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AcmeSysSelAssign {
	
	public static void main(String[] args) {
		
		//Driver setup		
		WebDriverManager.chromedriver().setup();
		
		//open chromeDriver
		
		ChromeDriver driver = new ChromeDriver();
		
		//open URL
		
		driver.get("https://acme-test.uipath.com/login");
			
		//maximize the window
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");
		
		driver.findElement(By.id("password")).sendKeys("leaf@12");
		
		driver.findElement(By.xpath("//button[@class = 'btn btn-primary']")).click();
		
		driver.findElement(By.linkText("Log Out")).click();
		
		driver.close();
		
		
	}

}
