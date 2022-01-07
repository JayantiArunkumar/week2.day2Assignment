package week2.day2Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookTestCase {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		//Launch the Driver
		
		ChromeDriver driver=new ChromeDriver();
		
		//Load the URL
		
		driver.get("https://en-gb.facebook.com/");
		
		//Maximise the Browser
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Jayanti");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Arun");
		driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys("123456789");
		driver.findElement(By.xpath("//input[@autocomplete='new-password']")).sendKeys("Jayanti@123");
		WebElement dd = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select dropdown=new Select(dd);
		dropdown.selectByValue("3");
		
		WebElement dd1 = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select dropdown1=new Select(dd1);
		dropdown1.selectByValue("11");
		
		WebElement dd2 = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select dropdown2=new Select(dd2);
		dropdown2.selectByValue("1992");
		
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		
		
		
	}

}
