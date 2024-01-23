package project;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {
		
		//Synchhronization in Selenium - Implicit Wait Method
		//Advantages - it is applicable for all elements when we declare it once
		//disadvantages - static hardcode time, chance of exception
		
		System.setProperty("webdriver.chrome.driver","./Driver01/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
		
		driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys("Selenium");
		driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys(Keys.RETURN);
		driver.findElement(By.xpath("//a[@href=\"https://www.selenium.dev/documentation/webdriver/\"]")).click();
		

	}

}
