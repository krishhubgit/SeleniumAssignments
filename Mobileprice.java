package week3.day2;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Mobileprice {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Oneplus",Keys.ENTER);
		List<WebElement> OnePlusPrice = driver.findElements(By.className("a-price-whole"));
		
		List<String> Mobile = new ArrayList<String>();
		 for (int i = 0; i<OnePlusPrice.size(); i++) {
			 String MobileOnePlus = OnePlusPrice.get(i).getText();
			 System.out.println(MobileOnePlus);
		 }
		

	}

}
