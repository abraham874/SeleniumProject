package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramePerform {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Driver01/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://letcode.in/frame");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("Akash");
		driver.findElement(By.xpath("//input[@name='lname']")).sendKeys("Abraham");
		
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("akash@gmail.com");

		//
		driver.quit();

	}

}
