package project;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsPerform {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Driver01/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@onclick=\"alertbox()\"]")).click();
		Alert al=driver.switchTo().alert();
		String s = al.getText();
		System.out.println("Simple text : " +s);
		al.accept();
		
		driver.findElement(By.xpath("//a[@href=\"#CancelTab\"]")).click();

		driver.findElement(By.xpath("//button[@onclick=\"confirmbox()\"]")).click();
		Alert al1=driver.switchTo().alert();
		String s1 = al1.getText();
		System.out.println("Simple text : " +s1);
		al1.accept();
		
		driver.findElement(By.xpath("//a[@href=\"#Textbox\"]")).click();
		driver.findElement(By.xpath("//button[@onclick=\"promptbox()\"]")).click();
		Alert al2=driver.switchTo().alert();
		al2.sendKeys("Bruce");
		al2.accept();

	}

}
