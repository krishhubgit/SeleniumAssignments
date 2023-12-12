package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTable {
	@Test

	public void table() {
		ChromeDriver driver = new ChromeDriver ();
		driver.get("https://www.dezlearn.com/webtable-example/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement table = driver.findElement(By.xpath("//div[@class='elementor-widget-container']//following::table[1]/tbody"));
		List<WebElement> listofrows = table.findElements(By.tagName("tr"));
		System.out.println(listofrows.size());
		List<WebElement> listofcolumns = driver.findElements(By.xpath("//div[@class='elementor-widget-container']//following::table[1]//th"));
        System.out.println(listofcolumns.size());
        List<WebElement> rowdata = driver.findElements(By.xpath("//div[@class='elementor-widget-container']//following::table[1]/tbody/tr[4]/td"));
	    for (WebElement eachdata : rowdata) {			
			    	System.out.println(eachdata.getText());			
		}
	    System.out.println("************************************");
	    List<WebElement> columndata = driver.findElements(By.xpath("//div[@class='elementor-widget-container']//following::table[1]/tbody/tr/td[1]"));
	    for (WebElement eachcolumn : columndata) {
	    System.out.println(eachcolumn.getText());
	}
	    System.out.println("************************************");
        List<WebElement> entiredata = driver.findElements(By.xpath("//div[@class='elementor-widget-container']//following::table[1]/tbody/tr/td"));
        for (WebElement alldata : entiredata) {
        	System.out.println(alldata.getText());			
		}
        System.out.println("************************************");
        for (int i = 0; i <=listofrows.size(); i++) {
        	 WebElement rows = driver.findElement(By.xpath("//div[@class='elementor-widget-container']//following::table[1]/tbody/tr["+i+"]/td"));
        	for (int j = 0; j <=listofcolumns.size(); j++) {
        		WebElement datas = rows.findElement(By.xpath("//div[@class='elementor-widget-container']//following::table[1]/tbody/tr["+i+"]/td["+j+")]"));
        		String text = datas.getText();
        		if(!text.isEmpty());
        		System.out.println(text);
				
			}
        	
			
		}
}
}