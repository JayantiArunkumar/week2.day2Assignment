package week2.day2Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ACMESystem {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
		
		//Launch the Driver
		
		ChromeDriver driver=new ChromeDriver();
		
		//Load the URL
		
		driver.get("https://acme-test.uipath.com/login");
		
		//Maximise the Browser
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Enter email
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("kumar.testleaf@gmail.com");
		
		//Enter Password
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("leaf@12");
		
		//login
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		String title=driver.getTitle();
		System.out.println(title);
		
		//logout
		driver.findElement(By.xpath("//a[text()='Log Out']")).click();
		
		driver.close();
	}

}
