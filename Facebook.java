package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Facebook {

	public static void main(String[] args) {
		EdgeDriver driver = new  EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("krishnanvels");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Yazhini@2020");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		

	}

}
