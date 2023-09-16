package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get(" http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
	 WebElement select = driver.findElement(By.id("createLeadForm_dataSourceId"));
	 Select opt=new Select(select);
	 opt.selectByIndex(4);
	 WebElement select1 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select opt1=new Select(select1);
		opt1.selectByVisibleText("Automobile");
		WebElement select2 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select opt2=new Select(select2);
		opt2.selectByValue("OWN_CCORP");
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("mgc");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("arokia");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("reshma");
		driver.findElement(By.className("smallSubmit")).click();
	 
	 
		
		

	}

}
