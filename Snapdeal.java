package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Snapdeal {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);		
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement elemenfashion = driver.findElement(By.xpath("(//span[@class='catText'])[1]"));
		Actions builder = new Actions (driver);
		builder.moveToElement(elemenfashion).perform();
		Thread.sleep(3000);		
		WebElement elesport = driver.findElement(By.xpath("(//span[@class='linkTest'])[1]"));
		builder.moveToElement(elesport).click().perform();
		WebElement count = driver.findElement(By.xpath("//*[@class='category-name category-count']"));
		System.out.println("Count of Sport Shoes is " +count.getText());		
		driver.findElement(By.xpath("(//*[contains(text(),'Training Shoes')])[1]")).click();
		driver.findElement(By.xpath("//div[@class='sort-drop clearfix']")).click();
		driver.findElement(By.xpath("(//li[@class='search-li'])[2]")).click();
		WebElement price = driver.findElement(By.xpath("//input[@name='toVal']"));
		price.clear();
		price.sendKeys("700");		
		driver.findElement(By.xpath("//div[@class='price-go-arrow btn btn-line btn-theme-secondary']")).click();
		Thread.sleep(1000);
		WebElement scroll = driver.findElement(By.xpath("//*[@for='Color_s-White%20%26%20Blue']"));
		builder.scrollToElement(scroll).click().perform();
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
