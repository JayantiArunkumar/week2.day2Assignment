package week2.day2Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLeads {

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
            
            //Click on Email
            driver.findElement(By.xpath("//span[text()='Email']")).click();
            
            //Enter Email
            driver.findElement(By.name("emailAddress")).sendKeys("jayu@gmail.com");
            
            //Click find leads button
            //driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
            //Capture name of First Resulting lead
            WebElement nn = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[1]"));
            String firstName=nn.getText();
            System.out.println(firstName);
            //Click First Resulting lead
            nn.click();
            //Click Duplicate Lead
            driver.findElement(By.xpath("(//div[@class='frameSectionExtra']/a)[1]")).click();
            //Verify the title as 'Duplicate Lead'
            String title=driver.getTitle();
            if(title.contains("Duplicate"))
            	System.out.println("Title is verified");
            else
            	System.out.println("Your are at wrong page");
            
            //Click Create Lead
            driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
            
            //Confirm the duplicated lead name is same as captured name
            WebElement lead = driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']"));
            String leadName=lead.getText();
            System.out.println(leadName);
            if(leadName.equalsIgnoreCase(firstName))
            	System.out.println("Duplicate lead name is same as captured name");
            else
            	System.out.println("Duplicate lead name is not same as captured name");
            
            driver.close();
	}

}
