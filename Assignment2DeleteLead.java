package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2DeleteLead {

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
			String str=driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).getText();
			System.out.println(str);
			driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
			driver.findElement(By.linkText("Delete")).click();
			driver.findElement(By.linkText("Find Leads")).click();
			driver.findElement(By.xpath("(//input[@type='text'])[28]")).sendKeys(str);
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//td[@class='x-btn-right'])[7]")).click();
			Thread.sleep(1000);
			String str1=driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();
			//System.out.println(str1);
			String str3="No records to display";
			if(str1.equals(str3))
			{
			System.out.println("Lead is deleted as expected");
			}
			driver.close();
	}

}
