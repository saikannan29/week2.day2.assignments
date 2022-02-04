package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2CreateContact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Kannan3");
		driver.findElement(By.id("lastNameField")).sendKeys("Loganathan");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Kannan");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Loganathan");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("QA");
		driver.findElement(By.id("createContactForm_description"))
		.sendKeys("Software Quality Assurance. Manual and Automation");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("kannan29@gmail.com");
		WebElement state = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select obj1 = new Select(state);
		obj1.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();

		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Selenium Automation");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		String str = driver.getTitle();
		System.out.println(str);

	}

}
