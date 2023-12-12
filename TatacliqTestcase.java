package week5.day1.testNG;

import java.time.Duration;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TatacliqTestcase {
	public WebDriver driver;
	
	@Test
	public void tataCliq() {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
	    driver= new ChromeDriver(options);
		driver.get("https://www.tatacliq.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//driver.findElement(By.xpath("//button[@id='wzrk-cancel']")).click();
		WebElement Brand = driver.findElement(By.xpath("(//div[@class='DesktopHeader__categoryAndBrand'])[2]"));
		Actions acc = new Actions (driver);
		acc.moveToElement(Brand).perform();
		WebElement watch = driver.findElement(By.xpath("//div[@class='DesktopHeader__categoryDetailsValueWithArrow']"));
		acc.moveToElement(watch).click().perform();
		WebElement featured = driver.findElement(By.xpath("(//div[@class='DesktopHeader__brandsDetails'])[1]"));
		acc.moveToElement(featured).click().perform();
		WebElement NewArrivals = driver.findElement(By.xpath("//select[@class='SelectBoxDesktop__hideSelect']"));
		Select sec = new Select(NewArrivals);
		sec.selectByVisibleText("isProductNew");
		driver.findElement(By.xpath("(//div[@class='FilterDesktop__newFilCheckbox'])[1]")).click();
		//List<WebElement> price = driver.findElement(By.xpath("(//h3[@class='ProductDescription__boldText'])[2]"));
		
		
		
		
		
		
		
		
	}

}
