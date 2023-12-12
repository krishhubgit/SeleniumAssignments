package week5.day1.testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends BaseClass {
	@Test(dataProvider ="fetchData")

	public void runCreateLead(String cName, String fname, String lName, String pNo) {
			
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(pNo);
		driver.findElement(By.name("submitButton")).click();
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains("Testleaf")) {
			System.out.println("Lead created successfully");
		}
		else {
			System.out.println("Lead is not created");
		}
			}
	@DataProvider(name="fetchData")
	public String [] [] sendData() {
		String[][] data =new String[2][4];
		data[0][0] ="TestLeaf";
		data[0][1] ="Subraja";
		data[0][2] ="S";
		data[0][3] ="91";
		
		data[1][0] ="Qeagle";
		data[1][1] ="Vidhya";
		data[1][2] ="R";
		data[1][3] ="99";
		
		
				
		return data;
		
		
	}

}
