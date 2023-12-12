package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class salesforce {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://login.salesforce.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("krishnanvels-bzjk@force.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Qaz1Qaz2");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("(//button[@class='slds-button'])[3]")).click();
		driver.findElement(By.xpath("(//*[@class='slds-app-launcher__tile-body slds-truncate'])[1]")).click();
		driver.findElement(By.xpath("(//*[@class='slds-context-bar__label-action dndItem'])[5]")).click();
		driver.findElement(By.xpath("//*[@title='New']")).click();
		driver.findElement(By.xpath("//*[@placeholder='Search Accounts...']")).sendKeys("Global");
		driver.findElement(By.xpath("(//*[@class='slds-input'])[2]")).sendKeys("Salesforce Automation by Krishnan");
		driver.findElement(By.xpath("(//*[@class='slds-input'])[4]")).click();
		
		
		
		

	}

}
