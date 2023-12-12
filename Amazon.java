package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Amazon {
	@Test

	public void indamazon() throws IOException, InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("oneplus 9 pro", Keys.ENTER);
        String price = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
        System.out.println("price of the first product:"   +price);
        String ratings = driver.findElement(By.xpath("(//span[@class='a-size-base s-underline-text'])[1]")).getText();
        System.out.println("he number of customer ratings for the first displayed product:"   +ratings);
        driver.findElement(By.xpath("(//div[@class='aok-relative'])[1]")).click();
        Set<String> windowHandles = driver.getWindowHandles();
	    List<String> listofHandles=new ArrayList<>(windowHandles);	   
	    driver.switchTo().window(listofHandles.get(1));
	    Thread.sleep(3000);
	    WebElement scroll = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));  
	    Actions builder = new Actions (driver);
	    builder.scrollToElement(scroll).click().build().perform();
	    System.out.println(scroll.getText());
	    
	    
        File source = driver.getScreenshotAs(OutputType.FILE);
        File target = new File("./snaps/oneplus.png");
        FileUtils.copyFile(source, target);
        
        driver.close();
	}

}
