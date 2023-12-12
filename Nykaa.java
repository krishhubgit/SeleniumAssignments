package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Nykaa {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement elebrand = driver.findElement(By.xpath("(//a[@class='css-1mavm7h'])[2]"));
		Actions builder = new Actions (driver);
		builder.moveToElement(elebrand).perform();
		driver.findElement(By.xpath("//input[@placeholder='Search on Nykaa']")).sendKeys("L'Oreal Paris",Keys.ENTER);
		WebElement scroll = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]/*[name()='svg'][1]/*[name()='path'][1]"));
		builder.scrollToElement(scroll).click().perform();
		
	
		
		
		
		
		

	}

}
