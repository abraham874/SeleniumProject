package project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementLocators {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Driver01/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://google.com/");
		driver.manage().window().maximize();
		
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);	
		
		driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys("amazon registration");
		driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys(Keys.RETURN);
		
		driver.findElement(By.xpath("//a[@href='https://www.amazon.in/ap/register?openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fref%3Drhf_sign_in&openid.assoc_handle=inflex']")).click();
		
		//locating the textboxes
		
		driver.findElement(By.xpath("//input[@id='ap_customer_name']")).sendKeys("student");
		driver.findElement(By.xpath("//input[@id='ap_phone_number']")).sendKeys("8654123788");
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("student123@gmail.com");
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("123456789hello");
		
		
		
		
		

		
	}

}
