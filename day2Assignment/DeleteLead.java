package week2.day2Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

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
            
            //Click Leads link
            driver.findElement(By.xpath("//a[text()='Leads']")).click();
            
            //Click Find leads
            driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
            
            //Click on Phone
            driver.findElement(By.xpath("//span[text()='Phone']")).click();
            
            //Enter phone number
           WebElement dd = driver.findElement(By.xpath("//input[@name='phoneCountryCode']"));
           dd.sendKeys("1",Keys.TAB);
           WebElement dd1 = driver.findElement(By.xpath("//input[@name='phoneAreaCode']"));
           dd1.sendKeys("02",Keys.TAB);
           WebElement dd2 = driver.findElement(By.xpath("//input[@name='phoneNumber']"));
           dd2.sendKeys("123456789");
           
           //Click find leads button
           //driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
           
           //Capture lead ID of First Resulting lead
           WebElement cap = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"));
           String leadId=cap.getText();
           //String leadId=cap.getAttribute("value");
           System.out.println(leadId);
           //Click First Resulting lead
           cap.click();
           //Click Delete
           driver.findElement(By.xpath("(//div[@class='frameSectionExtra']/a)[4]")).click();
           //Click Find leads
           driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
           //Enter captured lead ID
           driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadId);
           //Click find leads button
           driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
           //Verify message "No records to display" in the Lead List. This message confirms the successful deletion
           WebElement record = driver.findElement(By.xpath("//div[text()='No records to display']"));
           String noRecord=record.getText();
           System.out.println(noRecord);
           
           //Close the browser
           driver.close();
	}

}
