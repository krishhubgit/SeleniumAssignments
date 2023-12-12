package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Button {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[1]")).click();
		String title = driver.getTitle();
		WebElement disabled = driver.findElement(By.xpath("//button[contains(@class,'ui-state-disabled')]"));
	    
	       boolean enabled = disabled.isEnabled();
	       if(enabled) {
	           System.out.println("it is not Disabled");
	           }else {
	               System.out.println("it is  Disabled");
	       }
	}

}
