package week3.day2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PVR {

	public static void main(String[] args) throws InterruptedException, ParseException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.pvrcinemas.com/ ");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); 
		driver.findElement(By.xpath("//span[text()='Chennai']")).click();
		driver.findElement(By.xpath("//div[@class='nav-icon']")).click();
		driver.findElement(By.xpath("//a[@class='ng-star-inserted']")).click();
		Thread.sleep(3000);
		WebElement CityDD = driver.findElement(By.xpath("//select[@name='city']"));
		Select sec = new Select(CityDD); 
		sec.selectByVisibleText("Chennai");
		WebElement GenreDD = driver.findElement(By.xpath("//select[@name='genre']"));
		Select sec1 = new Select(GenreDD);
		sec1.selectByVisibleText("ANIMATION");
		WebElement LanguageDD = driver.findElement(By.xpath("//select[@name='lang']"));
		Select sec2 = new Select(LanguageDD);
		sec2.selectByVisibleText("ENGLISH");
		driver.findElement(By.xpath("//button[@class='btn btn-submit btn-primary']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Paw Patrol']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();
		WebElement CinemaDD = driver.findElement(By.xpath("//select[@name='cinemaName']"));
		Select sec3 = new Select(CinemaDD);
		sec3.selectByVisibleText("PVR Heritage RSL ECR Chennai");
		WebElement ShowTimeDD = driver.findElement(By.xpath("//select[@name='timings']"));
		Select sec4 = new Select(ShowTimeDD);
		sec4.selectByVisibleText("09:00 AM - 12:00 PM");
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Krishnan");
		driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys("9876543210");
		driver.findElement(By.xpath("//input[@name='comment']")).sendKeys("NA");
		driver.findElement(By.xpath("//div[@class='datepicker-container datepicker-default']")).click();
		String expectedDate = "11/16/2023";
		String[] dateVal =expectedDate.split("/");
		int monthToSelect = Integer.parseInt(dateVal[1]);
		String selectMonth = driver.findElement(By.xpath("//span[@class='month-year-text']")).getText();
		System.out.println(selectMonth);
		SimpleDateFormat inputFormat =new SimpleDateFormat("MMMMM");
		Calendar cal = Calendar.getInstance();
		cal.setTime(inputFormat.parse(selectMonth));
		SimpleDateFormat outputFormat = new SimpleDateFormat("MM");
		System.out.println(outputFormat.format(cal.getTime()));
		int presentMonth = Integer.parseInt(outputFormat.format(cal.getTime()));
		System.out.println(presentMonth);
		if (monthToSelect > presentMonth) {
			driver.findElement(By.xpath("//span[text()='November 2023']")).click();
			
		}
		driver.findElement(By.xpath("//input[@name='noOfTickets']")).sendKeys("5");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("xyz@gmail.com");
		WebElement FoodDD = driver.findElement(By.xpath("//select[@name='food']"));
		Select sec5 = new Select(FoodDD);
		sec5.selectByIndex(1);
		driver.findElement(By.xpath("//label[@class='custom-control custom-radio']")).click();
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		driver.findElement(By.xpath("(//button[@class='btn already-member'])[4]")).click();
		driver.findElement(By.xpath("//button[@class='swal2-close']")).click();
		System.out.println(driver.getTitle());		
			}
}
