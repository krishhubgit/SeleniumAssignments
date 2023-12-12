package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class sampletestleaf {

	public static void main(String[] args) {
	
		EdgeDriver driver = new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Create')]")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Facebook");
		driver.findElement(By.xpath("//input[@id='createLeadForm_parentPartyId']")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Krishnan");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Mani");
		WebElement sourceDD = driver.findElement(By.xpath("//select[contains(@id,'dataSourceId')]"));
		Select sec = new Select(sourceDD);
		sec.selectByIndex(4);
		WebElement MarketingDD = driver.findElement(By.xpath("//select[contains(@id,'marketingCampaignId')]"));
		Select sec1 = new Select(MarketingDD);
		sec1.selectByIndex(2);
        WebElement IndustryDD = driver.findElement(By.xpath("//select[contains(@id,'industryEnumId')]"));
        Select sec2 = new Select(IndustryDD);
        sec2.selectByIndex(3);
        driver.findElement(By.xpath("//input[@id='ext-gen657']")).click();
        
        
        
        
	}

}
