package week2.day2Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Link {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
		
		//Launch the Driver
		
		ChromeDriver driver=new ChromeDriver();
		
		//Load the URL
		
		driver.get("http://leafground.com/pages/Link.html");
		
		//Maximise the Browser
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.findElement(By.xpath("//a[text()='Go to Home Page']")).click();
		WebElement ff = driver.findElement(By.xpath("//a[text()='Find where am supposed to go without clicking me?']"));
		String s=ff.getAttribute("href");
		
		System.out.println(s);
		
		WebElement ff1 = driver.findElement(By.xpath("//a[text()='Verify am I broken?']"));
		String error=ff1.getAttribute("href");
		System.out.println(error);
		
		if(driver.getTitle().contains("error"))
			System.out.println("Yes your broken");
		else
			System.out.println("No your not broken");
		
		driver.navigate().back();
		
		driver.findElement(By.xpath("//a[text()='Go to Home Page']")).click();
		driver.navigate().back();
		
		

	}

}
