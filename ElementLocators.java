package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementLocators {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Driver01/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("student");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("stduent123@gmail.com");
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("8523697412");
		driver.findElement(By.xpath("//textarea[@id='textarea']")).sendKeys("No 156/87, Nasvhville, USA");
		
		WebElement radio1 = driver.findElement(By.xpath("//input[@id='male']"));
		
		radio1.click();
		
		
		
		

		
	}

}
