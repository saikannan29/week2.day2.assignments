package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriverManager.chromedriver().setup();
		    ChromeDriver driver=new ChromeDriver();
		    driver.get("http://leaftaps.com/opentaps/control/login");
		    driver.manage().window().maximize();
		    driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();
			driver.findElement(By.linkText("CRM/SFA")).click();
			driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
			driver.findElement(By.linkText("Find Leads")).click();
			driver.findElement(By.xpath("(//em[@class='x-tab-left'])[3]")).click();
			driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("kannan29@gmail.com");
			driver.findElement(By.xpath("(//td[@class='x-btn-center'])[7]")).click();
			Thread.sleep(1000);
			String str=driver.findElement(By.xpath("(//a[@class='linktext'])[6]")).getText();
			System.out.println(str);
			
			driver.findElement(By.xpath("(//a[@href='/crmsfa/control/viewLead?partyId=10425'])[4]")).click();
			driver.findElement(By.linkText("Duplicate Lead")).click();
			if((driver.getTitle()).contains("Duplicate Lead"))
			{
				System.out.println("Title is verified as Duplicate Lead");
			}
			driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
			String str1=driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']")).getText();
			System.out.println(str1);
            if(str.equals(str1))
            {
            	System.out.println("Duplicate Lead name is same as captured one. Verified!");
            }
            driver.close();
	
	}
	
}
