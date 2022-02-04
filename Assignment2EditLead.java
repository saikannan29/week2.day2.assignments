package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2EditLead {

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
            driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("kannan");
			driver.findElement(By.xpath("(//td[@class='x-btn-center'])[7]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//a[@class='linktext'])[6]")).click();
			System.out.println(driver.getTitle());
			driver.findElement(By.linkText("Edit")).click();
			driver.findElement(By.id("updateLeadForm_companyName")).clear();
			driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("IGT");
			driver.findElement(By.xpath("//input[@value='Update']")).click();
			String str1=driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText();
			if(str1.contains("IGT"))
			{
				System.out.println("Name changed.Verified!");
			}
			driver.close();
			
	}

}
