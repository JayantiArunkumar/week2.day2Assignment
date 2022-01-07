package week2.day2Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

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
            
            //Enter first name
            driver.findElement(By.xpath("//input[@name='id']/following::input")).sendKeys("Jayanti");

	       //Click Find leads button
           //driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
           
           System.out.println("Hello");
            
            //Click on first resulting lead
            driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a")).click();
            //driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	
	       //Verify title of the page
            String title=driver.getTitle();
            if(title.contains("View"))
            	System.out.println("Title is verified");
            else
            	System.out.println("Your are at wrong page");
            
            WebElement findElement1 = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']"));
            String companyName=findElement1.getText();
            System.out.println("Company name  "+companyName);
            
            //Click Edit
            driver.findElement(By.xpath("(//div[@class='frameSectionExtra']/a)[3]")).click();
            
            driver.findElement(By.id("updateLeadForm_companyName")).clear();
            //Change the company name
            driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Cognizant");
            
            //Click Update
            driver.findElement(By.xpath("//input[@name='submitButton']")).click();
            
            //Confirm the changed name appears
            WebElement findElement = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']"));
            String newCompanyName=findElement.getText();
            System.out.println("Company name changed to "+newCompanyName);
            
            if(companyName.equalsIgnoreCase(newCompanyName))
            	System.out.println("The company name not updated");
            else
            	System.out.println("The company name is updated");
            
            //driver.close();
	
	}

}
