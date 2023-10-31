package home.assignment7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class EditLead extends ProjectSpecifiedMethod {
	
	@DataProvider(name="fetchData") 
	
	public String[][] SendData(){
		String[][] data= new String[2][2];
		
		data[0][0]="TestLeaf";
		data[0][1]="98";
	
		
		data[1][0]="TestLeaf";
		data[1][1]="99";
		
		
		
		
		
		return data;
		
		
	}
	
	
	@Test(dataProvider ="fetchData")
	

	public  void runEditLead(String compName, String pNumber) throws InterruptedException {
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(pNumber);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(compName);
		driver.findElement(By.name("submitButton")).click();
		
}
}






