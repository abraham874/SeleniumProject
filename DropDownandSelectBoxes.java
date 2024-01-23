package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownandSelectBoxes {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Driver01/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://letcode.in/dropdowns");
		driver.manage().window().maximize();

		WebElement d1 = driver.findElement(By.xpath("//select[@id='fruits']"));
		Select mf = new Select(d1);
		mf.selectByVisibleText("Orange");
		
		WebElement c = driver.findElement(By.xpath("//select[@id='country']"));
		Select myc = new Select(c);
		myc.selectByValue("India");
		WebElement selectedCo = myc.getFirstSelectedOption();
		System.out.println(selectedCo.getText());
		
		WebElement l = driver.findElement(By.xpath("//select[@id='lang']"));
		Select myl = new Select(l);
		myl.selectByValue("py");
		WebElement selectedla = myl.getFirstSelectedOption();
		System.out.println(selectedla.getText());
		
		WebElement hero = driver.findElement(By.xpath("//select[@id='superheros']"));
		Select h = new Select(hero);
		boolean isMul = h.isMultiple();
		System.out.println("Is Multiple?" +isMul);
		h.selectByIndex(5);
		



	}

}
