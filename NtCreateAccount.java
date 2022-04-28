	package week2.day2;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	import io.github.bonigarcia.wdm.WebDriverManager;


	public class NtCreateAccount 
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
			
			driver.findElement(By.linkText("Create Account")).click();
				
			driver.findElement(By.name("description")).sendKeys("NRI Account");
			
			driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("Debit");
			
			driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("Leaftaps.com");
			
			Select dropdown= new Select(driver.findElement(By.id("currencyUomId")));
			 
			//selectByValue
			dropdown.selectByValue("INR"); 
			
			driver.findElement(By.xpath("(//input[@class='inputBox'])[5]")).sendKeys("100000");
			
			driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();

			System.out.println(driver.findElement(By.xpath("//li[@class='errorMessage']")).getText());
			
}
}
	