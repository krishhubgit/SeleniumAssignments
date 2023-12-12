package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String pTitle = driver.getTitle();
	    System.out.println("Parent Title: "+pTitle);	      
	    driver.findElement(By.xpath("//span[@class='allcircle circleone']")).click();
	    Set<String> windowHandles = driver.getWindowHandles();
	    List<String> listofHandles=new ArrayList<>(windowHandles);
	    //String childHandle = listofHandles.get(1);
	    driver.switchTo().window(listofHandles.get(1));
	    String cTile =driver.getTitle();
	    System.out.println(cTile);
	    driver.switchTo().window(listofHandles.get(0));	   
	    driver.findElement(By.xpath("//span[@class='allcircle circletwo']")).click();
	    driver.switchTo().window(listofHandles.get(1));
		String cTile1 =driver.getTitle();
		System.out.println(cTile1);
	    driver.close();
	       

	}

}
