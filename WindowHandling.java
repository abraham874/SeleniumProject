package project;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","./Driver01/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/");
		driver.manage().window().maximize();
		
		String windowhandle = driver.getWindowHandle();
		String s = driver.getCurrentUrl();
		
		System.out.println("First Window - "+windowhandle);
		System.out.println("First Window - "+s);
		
		driver.findElement(By.xpath(""//a[@class='user-anonymous tnb-certificates-btn w3-bar-item w3-button w3-right w3-white ga-top ga-top-certificates']")).click();
		
		Set<String>windowhandles = driver.getWindowHandles();
		System.out.println(windowhandles);
		
		List<String>l = new ArrayList<String>(windowhandles);
		
		driver.switchTo().window(l.get(0));
		driver.close();
		
		
		
		
		
		

	}

}
