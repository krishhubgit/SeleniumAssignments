package week6.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class RedHat {
public ChromeDriver driver;
	
	@BeforeMethod
	public void preConditions() {
		driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sso.redhat.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//button[@class='pf-c-button pf-m-link pf-m-inline pf-m-display-lg']")).click();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys();
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys();
		driver.findElement(By.xpath("//input[@label='Phone number']")).sendKeys();
	}
		
	
@AfterMethod
public void postConditions() {
	driver.close();
}}