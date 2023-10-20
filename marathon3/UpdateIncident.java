package marathon3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class UpdateIncident extends ProjectSpecificMethod {

	@Test(dependsOnMethods = {"marathon3.CreateIncident.runCreateIncident"})
	
	public  void runUpdateIncident() {
		
		//String incNum = "INC0010168";
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys(incNum+Keys.ENTER);

		driver.findElement(By.xpath("//a[@class='linked formlink']")).click();
		WebElement urgency = driver.findElement(By.id("incident.urgency"));
		Select option = new Select(urgency);
		 (option).selectByVisibleText("1 - High");
		 WebElement state = driver.findElement(By.id("incident.state"));
		 Select option1 =new Select(state);
		 (option1).selectByVisibleText("In Progress");
		 driver.findElement(By.xpath("//button[@id='sysverb_update_bottom']")).click();
		 driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys(incNum+Keys.ENTER);
         driver.findElement(By.xpath("//a[@class='linked formlink']")).click();
		 String incState = driver.findElement(By.xpath("//span[text()='Incident state']/following-sibling::span")).getText();
		 if(incState.contains("In Progress")) {
			 System.out.println("Incident updated successfully");
		 }else {
			 System.out.println("Not updated");
		 }
			 
		 
		 
		 
		 

	}

}
