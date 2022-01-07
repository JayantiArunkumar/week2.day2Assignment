package week2.day2Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Button {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
		
		//Launch the Driver
		
		ChromeDriver driver=new ChromeDriver();
		
		//Load the URL
		
		driver.get("http://leafground.com/pages/Button.html");
		
		//Maximise the Browser
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//button[@id='home']")).click();
		System.out.println(driver.findElement(By.xpath("//button[@id='position']")).getLocation());
		
		System.out.println(driver.findElement(By.xpath("//button[@id='color']")).getCssValue("color"));

		System.out.println(driver.findElement(By.xpath("//button[@id='size']")).getSize());
	}

}
