package week2.day2Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Image {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
		
		//Launch the Driver
		
		ChromeDriver driver=new ChromeDriver();
		
		//Load the URL
		
		driver.get("http://leafground.com/pages/Image.html");
		
		//Maximise the Browser
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.findElement(By.xpath("//div[@class='large-6 small-12 columns']/img")).click();
		driver.navigate().back();
		WebElement findElement = driver.findElement(By.xpath("//label[@for='position']/following::img"));
        String s=findElement.getAttribute("src");
        if(s.contains("abcd"))
        	System.out.println("Yes your a broken img");
        else
        	System.out.println("No your not");
        
        driver.findElement(By.xpath("//label[@for='position']/following::img[contains(@src,'keyboard')]")).click();
        //driver.navigate().back();
	}

}
