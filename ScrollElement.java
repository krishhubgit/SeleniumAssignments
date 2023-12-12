package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class ScrollElement {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement scroll = driver.findElement(By.xpath("//a[text()='Conditions of Use & Sale']"));
		Actions builder = new Actions (driver);
		builder.scrollToElement(scroll);
		System.out.println(scroll.getText());	
		
		 File source = driver.getScreenshotAs(OutputType.FILE);
	        File target = new File("./snaps/amazon.png");
	        FileUtils.copyFile(source, target);

	}

}
