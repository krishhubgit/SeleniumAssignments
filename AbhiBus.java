package week3.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbhiBus {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.abhibus.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); 
		driver.findElement(By.xpath("//input[@placeholder='From Station']")).sendKeys("Chennai");
		driver.findElement(By.xpath("//li[text()='Chennai']")).click();
		driver.findElement(By.xpath("//input[@placeholder='To Station']")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//li[text()='Bangalore']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Onward Journey Date']")).click();
		driver.findElement(By.xpath("//div[@class='container date ']/span[text()='2']")).click();
		driver.findElement(By.xpath("//div[@id='search-button']")).click();
		System.out.println(driver.findElement(By.xpath("//div[@id='service-operator-agent-name-1732661225']")).getText());
		driver.findElement(By.xpath("//span[text()='Sleeper']")).click();
		System.out.println(driver.findElement(By.xpath("(//div[@class='text-grey'])[1]")).getText());
		driver.findElement(By.xpath("(//button[text()='Show Seats'])[1]")).click();
		driver.findElement(By.xpath("(//button[@class='seat sleeper'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='container checkbox-container  md '][2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='container checkbox-container  md '])[3]")).click();
		System.out.println(driver.findElement(By.xpath("(//span[@class='text-primary'])[1]")).getText());
		System.out.println(driver.findElement(By.xpath("(//span[@class='text-primary'])[2]")).getText());
		System.out.println(driver.getTitle());		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
