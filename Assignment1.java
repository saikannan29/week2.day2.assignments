package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    WebDriverManager.chromedriver().setup();
    ChromeDriver driver=new ChromeDriver();
    driver.get("https://en-gb.facebook.com/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
    driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[1]")).sendKeys("Kannan");
    driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[2]")).sendKeys("Loganathan");
    driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[3]")).sendKeys("5129996785");
    driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Logankannan");
    WebElement day=driver.findElement(By.id("day"));
    Select obj1=new Select(day);
    obj1.selectByVisibleText("18");
    WebElement month=driver.findElement(By.id("month"));
    Select obj2=new Select(month);
    obj2.selectByVisibleText("Mar");
    WebElement year=driver.findElement(By.id("year"));
    Select obj3=new Select(year);
    obj3.selectByVisibleText("1985");
    driver.findElement(By.xpath("(//label[@class='_58mt'])[2]")).click();
    
    
	}

}
