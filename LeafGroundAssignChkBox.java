package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundAssignChkBox {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leafground.com/pages/checkbox.html");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//label[contains(text(),'languages that you know?')]"));
		
		driver.findElement(By.xpath("(//label[@for='java']/following-sibling::input)[6]")).isSelected();
		
		System.out.println(driver.findElement(By.xpath("(//label[@for='java']/following-sibling::input)[6]")).isSelected());
		
		System.out.println(driver.findElement(By.xpath("(//label[@for = 'java']/following-sibling::input)[2]")).isSelected());
		
		//div[@for='java']/input[contains(text(),'Selenium']

	}

}
