package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationAlert {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt93']")).click();
		Alert ConfirmationAlert = driver.switchTo().alert();		
		ConfirmationAlert.accept();
		String okay = driver.findElement(By.id("result")).getText();
		System.out.println(okay);
		driver.close();
		
		
		
		
		

	}

}
