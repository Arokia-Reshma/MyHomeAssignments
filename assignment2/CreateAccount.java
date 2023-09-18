package home.assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
	
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		
        driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
        
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        
        driver.findElement(By.className("decorativeSubmit")).click();
        
        driver.findElement(By.partialLinkText("CRM/SFA")).click();
        driver.findElement(By.linkText("Create Account")).click();
        driver.findElement(By.id("accountName")).sendKeys("TestLeaf");
        driver.findElement(By.className("inputBox")).sendKeys("Selenium Automation Tester");
        WebElement select = driver.findElement(By.name("industryEnumId"));
        Select option = new Select(select);
        (option).selectByIndex(3);
        WebElement select1 = driver.findElement(By.name("ownershipEnumId"));
        Select option1 = new Select(select1);
        (option1).selectByVisibleText("S-Corporation");
        WebElement select2 = driver.findElement(By.id("dataSourceId"));
        Select option2 = new Select(select2);
        (option2).selectByValue("LEAD_EMPLOYEE");
        WebElement select3 = driver.findElement(By.id("marketingCampaignId"));
        Select option3 = new Select(select3);
        (option3).selectByIndex(6);
        WebElement select4 = driver.findElement(By.id("generalStateProvinceGeoId"));
        Select option4 = new Select(select4);
        (option4).selectByValue("TX");
        driver.findElement(By.className("smallSubmit")).click();
        driver.close();
          }

	}


