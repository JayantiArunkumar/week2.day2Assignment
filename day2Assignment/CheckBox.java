package week2.day2Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
		
		//Launch the Driver
		
		ChromeDriver driver=new ChromeDriver();
		
		//Load the URL
		
		driver.get("http://leafground.com/pages/checkbox.html");
		
		//Maximise the Browser
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.findElement(By.xpath("(//div[@class='example']//input)[1]")).click();
		driver.findElement(By.xpath("(//div[@class='example']//input)[5]")).click();
		WebElement findElement = driver.findElement(By.xpath("(//div[@class='example']//input)[6]"));
		if(findElement.isSelected())
			System.out.println("Selenium is checked");
		else
			System.out.println("Selenium is unchecked");
		WebElement findElement2 = driver.findElement(By.xpath("(//div[@class='example']//input)[8]"));
	    if(findElement2.isSelected())
	    	findElement2.click();
	    
	    driver.findElement(By.xpath("(//label[text()='Select all below checkboxes ']/following::input)[1]")).click();
	    driver.findElement(By.xpath("(//label[text()='Select all below checkboxes ']/following::input)[2]")).click();
	    driver.findElement(By.xpath("(//label[text()='Select all below checkboxes ']/following::input)[3]")).click();
	    driver.findElement(By.xpath("(//label[text()='Select all below checkboxes ']/following::input)[4]")).click();
	    driver.findElement(By.xpath("(//label[text()='Select all below checkboxes ']/following::input)[5]")).click();
	    
	
	
	}

}
