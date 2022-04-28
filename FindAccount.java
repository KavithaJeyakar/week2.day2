package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class FindAccount 
{	
	public static void main(String[] args) 
	{
		// Driver setup
		WebDriverManager.chromedriver().setup();
		
		// Open Chrome Browser
		ChromeDriver driver = new ChromeDriver();
		// Load the URL
		driver.get("http://leaftaps.com/opentaps/control/login");
		// Maximize the window
		driver.manage().window().maximize();
		
		// Finding the webelement
		WebElement elementUsername = driver.findElement(By.id("username"));
		// Entering some input in the text box
		elementUsername.sendKeys("Demosalesmanager");
		
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		String text = driver.findElement(By.tagName("h2")).getText();
		System.out.println(text);
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Accounts")).click();
		
		driver.findElement(By.linkText("Find Accounts")).click();
		
		driver.findElement(By.xpath("(//input[@name='accountName'])[2]")).sendKeys("Credit Limited Account");
		
		driver.findElement(By.xpath("//button[text()='Find Accounts']")).click();
		
		driver.findElement(By.linkText("Credit Limited Account")).click();
	//	driver.findElement(By.xpath("//a[@class='linktext' and text() ='Credit Limited Account']")).click();
		
	//	driver.findElement(By.xpath("//a[text()='Credit Limited Account']")).click();
		
		driver.findElement(By.linkText("Edit")).click();
		
		System.out.println("The title is :"+ driver.getTitle());
		
		
		if (driver.getTitle().contains("Edit"))
		{
		System.out.println("Edit Screen");	
		}
		else
			System.out.println("Not Edit page");
		
		String text2 = driver.findElement(By.xpath("//textarea[@name='description']")).getText();
		
		if (text2.contains("Sales account"))
		{
			System.out.println("Description displayed");
		}
		else
		{
			System.out.println("Wrong Description");
		}
		
	//	System.out.println("The Description is :"+);
		
		
	
	}
}