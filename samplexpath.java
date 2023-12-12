package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class samplexpath {

	public static void main(String[] args) {
        EdgeDriver driver = new EdgeDriver();	         
	      
        driver.get("http://leaftaps.com/opentaps/control/main");	         
    
        driver.manage().window().maximize();
        
     	 driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
        
        //enter the password
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
        
        //click on Login button
        driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
        
        //click crmsfa link
        driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
        
        //click Leads link
        driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();

        //click createLead
        driver.findElement(By.xpath("(//a[contains(text(),'Lead')])[3]")).click();
        
        //enter companyname
        driver.findElement(By.xpath("  //input[@id='createLeadForm_companyName'] ")).sendKeys("TestLeaf");
        
        //enter firstname
        driver.findElement(By.xpath("  //input[@id='createLeadForm_firstName'] ")).sendKeys("Subraja");
        
        //enter lastname
        driver.findElement(By.xpath("  //input[@id='createLeadForm_lastName'] ")).sendKeys("S");
        
        //click source dropdown
        WebElement sourceDD = driver.findElement(By.xpath("//select[contains(@id,'createLeadForm_dataSourceId')]"));
        
        //
        Select sec = new Select(sourceDD);
        
        //select cold call option
        sec.selectByIndex(1);
        
        //click Industry dropdown
        WebElement industryDD = driver.findElement(By.xpath("//select[contains(@id,'createLeadForm_industryEnumId')]"));
        
        //Instantiate Select class
        Select sec1 = new Select(industryDD);
        
        //select computer software option
        sec1.selectByVisibleText("Computer Software");
        
        //select marketing campaign dropdown
        WebElement marketingDD = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
        
        Select sec2 = new Select(marketingDD);
        //select pay by option
        sec2.selectByValue("9001");
        
        
        //click submit
//        driver.findElement(By.name("submitButton")).click();
//        
//        //verify the text by using getText()
//        String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
//        System.out.println("Company name is :"+text);
	}





	}


