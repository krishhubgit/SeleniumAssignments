package week2.day1;

import java.time.Duration;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.*;

public class FacebookAccountCreation {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		//List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		
		//System.out.println("The Total number of links in this page: "+allLinks.size());
		//System.out.println(allLinks.get(5)).getText();
		
		/*
		 * driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).
		 * click();
		 * driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Rose");
		 * driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Marry");
		 * driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys(
		 * "9876543210");
		 * driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys(
		 * "Xyz@746$"); WebElement DayDD =
		 * driver.findElement(By.xpath("//select[@id='day']")); Select sec = new
		 * Select(DayDD); sec.selectByIndex(15); WebElement MonthDD =
		 * driver.findElement(By.xpath("//select[@id='month']")); Select sec1 = new
		 * Select(MonthDD); sec1.selectByIndex(10); WebElement YearDD =
		 * driver.findElement(By.xpath("//select[@id='year']")); Select sec2 = new
		 * Select(YearDD); sec2.selectByIndex(25); WebElement radio =
		 * driver.findElement(By.xpath("//input[@type='radio']")); radio.click();
		 */
		
		

	}

}
