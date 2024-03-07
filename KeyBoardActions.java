package project;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions {

	//cmd

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Driver01/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))).click().sendKeys("Iphone 15").build().perform();
		a.sendKeys(Keys.RETURN).build().perform();
		

	}

}
