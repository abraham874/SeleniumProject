package project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NavigationPerform {

	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","./Driver01/chromedriver.exe");
			WebDriver driver = new ChromeDriver();

			driver.get("https://www.flipkart.com/");
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

			
			WebElement arc = driver.findElement(By.xpath("//span[.='Electronics']"));
			Actions builder = new Actions(driver);
			builder.moveToElement(arc).perform();
			driver.findElement(By.linkText("Gaming")).click();
			driver.findElement(By.linkText("Games")).click();
			
			driver.navigate().back();
			driver.navigate().back();
			
			driver.navigate().refresh();

	}

}
