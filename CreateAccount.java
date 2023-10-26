package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Accounts')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Create Account')]")).click();
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Debit Limited Account");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("ABC");
		driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("XYZ");
		driver.findElement(By.xpath("//input[@id='annualRevenue']")).sendKeys("");
		WebElement IndustryDD = driver.findElement(By.xpath("//select[@name='industryEnumId']"));
		Select sec = new Select(IndustryDD);
		sec.selectByIndex(3);
		WebElement OwnershipDD = driver.findElement(By.xpath("//select[@name='ownershipEnumId']"));
		Select sec1 = new Select(OwnershipDD);
		sec1.selectByIndex(4);
		WebElement SourceDD = driver.findElement(By.xpath("//select[@id='dataSourceId']"));
		Select sec2 = new Select(SourceDD);
		sec2.selectByIndex(4);
		WebElement MarketingDD = driver.findElement(By.xpath("//select[@id='marketingCampaignId']"));
		Select sec3 = new Select(MarketingDD);
		sec3.selectByIndex(6);
		WebElement StateDD = driver.findElement(By.xpath("//select[@id='generalStateProvinceGeoId']"));
		Select sec4 = new Select(StateDD);	
		sec4.selectByIndex(50);
		driver.findElement(By.xpath("//input[@value='Create Account']")).click();
		
		
		
		
		

	}

}
