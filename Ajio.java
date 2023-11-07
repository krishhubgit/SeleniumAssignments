package week3.day1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.get(" https://www.ajio.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("bags", Keys.ENTER);
	Thread.sleep(3000);
	driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-genderfilter facet-linkname-Men']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-l1l3nestedcategory facet-linkname-Men - Fashion Bags']")).click();
	List<WebElement> itemscount = driver.findElements(By.tagName("a"));
	
	List<String> Bags = new ArrayList<String>();
	 for (int i = 0; i<itemscount.size(); i++) {
		 String MenFashion = itemscount.get(i).getText();
		 System.out.println(MenFashion);
	
	

	}

}
}