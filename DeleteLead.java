package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();  
		driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
	    driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
	    driver.findElement(By.xpath("//span[contains(text(),'Phone')]")).click();
	    driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9876543210");
	    driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
	    Thread.sleep(3000);
	    String LeadID = driver.findElement(By.xpath("(//div[contains(@class,'x-grid3-cell-inner x-grid3-col-partyId')]/a)[1]")).getAttribute("value");
	    System.out.println(LeadID);
	    driver.findElement(By.xpath("(//div[contains(@class,'x-grid3-cell-inner x-grid3-col-partyId')]/a)[1]")).click();
	    driver.findElement(By.xpath("//a[contains(text(),'Delete')]")).click();
	    driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//input[@name='id']")).sendKeys("LeadID");
	    driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
		driver.close();
		  
		 
		
	}

}
