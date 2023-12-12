package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Basiccheckbox {

	public static void main(String[] args) throws InterruptedException {
		//EdgeDriver driver = new EdgeDriver();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[text()='Basic']/preceding-sibling::*[1]")).click();
		driver.findElement(By.xpath("//*[text()='Ajax']/preceding-sibling::*[1]")).click();
		driver.findElement(By.xpath("//*[text()='Java']/preceding-sibling::*[1]")).click();	
		driver.findElement(By.xpath("//*[text()='Python']/preceding-sibling::*[1]")).click();
		driver.findElement(By.xpath("//*[text()='Javascript']/preceding-sibling::*[1]")).click();
		driver.findElement(By.xpath("//*[text()='C-Sharp']/preceding-sibling::*[1]")).click();
		driver.findElement(By.xpath("//*[text()='Others']/preceding-sibling::*[1]")).click();
		driver.findElement(By.xpath("(//div[@class='grid formgrid'])[4]//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']")).click();
	    Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-triangle-1-s']")).click();
	    //System.out.println("true");
	    //WebElement MultipleDD = driver.findElement(By.xpath("//ul[@data-label='Cities']"));
	    //Select sec = new Select(MultipleDD);
	    //sec.deselectByVisibleText("London");
	    
	    
	    
	}
      
	
	
}


//*[text()='Basic']/preceding-sibling::*[1]
//*[text()='Ajax']/preceding-sibling::*[1]


//following-sibling:: forward or After
//preceding-sibling:: backward or before
