package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandingAssignment {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Merge Contacts')]")).click();
		driver.findElement(By.xpath("(//*[@alt='Lookup'])[1]")).click();
		Set<String> firstcontact = driver.getWindowHandles();
		List<String> listofHandles=new ArrayList<>(firstcontact);
		 driver.switchTo().window(listofHandles.get(1));
		 driver.findElement(By.xpath("(//a[contains(text(),'kannan')])[1]")).click();		
		 driver.switchTo().window(listofHandles.get(0));
		 driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		 Set<String> child = driver.getWindowHandles();
		 List<String>childhandles = new ArrayList<>(child);
		 driver.switchTo().window(childhandles.get(1));
		 driver.findElement(By.xpath("(//a[contains(text(),'kannan')])[1]")).click();	
		 driver.switchTo().window(childhandles.get(0));
		driver.findElement(By.xpath("//a[@class='buttonDangerous']")).click();
	    driver.switchTo().alert().accept();
	    String MergeContacts = driver.getTitle();
	    System.out.println(MergeContacts);
	    
	    
		
		
		
	}

}
