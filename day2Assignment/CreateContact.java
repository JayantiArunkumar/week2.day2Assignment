package week2.day2Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
		
		//Launch the Driver
		
		ChromeDriver driver=new ChromeDriver();
		
		//Load the URL
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		//Maximise the Browser
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Enter UserNAme
		 driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
			//Enter Password
			
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
			
			
			//click Login Button
			
			driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
			//input[@class='decorativeSubmit']
			
			//click on CRM/SFA
            driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
            //click on contacts
            driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
            //click on Create Contacts
            driver.findElement(By.xpath("//a[text()='Create Contact']")).click();
           
            //firstName and LAstNAme 
            
            WebElement firstName = driver.findElement(By.id("firstNameField"));
			firstName.sendKeys("Jayanti");
			driver.findElement(By.id("lastNameField")).sendKeys("Arunkumar");
            
			//local firstName and LastNAme
			driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Jayu");
			driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Arunkumar");

            //Enter Department Field Using any Locator of Your Choice
			driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Computer");
		
		 //Enter Description Field Using any Locator of your choice 
			driver.findElement(By.id("createContactForm_description")).sendKeys("Joined Selenium Course in December");
			
			//Enter your email in the E-mail address Field using the locator of your choice
			driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("jayu@gmail.com");
			
			// Select State/Province as NewYork Using Visible Text
			WebElement dd = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
			Select dropDown=new Select(dd);
			dropDown.selectByVisibleText("New York");
			
			// Click on Create Contact
			driver.findElement(By.name("submitButton")).click();
			
			//Click on edit button 
			driver.findElement(By.xpath("//a[text()='Edit']")).click();
			
			//Clear the Description Field using .clear
			driver.findElement(By.id("updateContactForm_description")).clear();
			
			// Fill ImportantNote Field with Any text
			driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Week2 of Selenium Course has started");
			
			//Click on update button using Xpath locator
			driver.findElement(By.xpath("//input[@value='Update']")).click();
			
			//Get the Title of Resulting Page.
			String title = driver.getTitle();
			System.out.println(title);
			
			
			
			
		
	}

}
