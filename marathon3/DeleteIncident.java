package marathon3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class DeleteIncident extends ProjectSpecificMethod {
@Test(dependsOnMethods = {"marathon3.UpdateIncident.runUpdateIncident"})
	public  void runDeleteIncident() {
		
		//String incNum = "INC0010001";
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys(incNum+Keys.ENTER);

		driver.findElement(By.xpath("//a[@class='linked formlink']")).click();
	driver.findElement(By.xpath("//button[text()='Delete']")).click();
	driver.findElement(By.xpath("//button[@id='ok_button']")).click();
	driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys(incNum+Keys.ENTER);
	String record = driver.findElement(By.xpath("//div[@class='list2_empty-state-list']")).getText();
	if(record.contains("No records to display")) {
		System.out.println("Incident num is deleted");
	}else {
		System.out.println("Incident Num is not deleted");
	}
	}
	

}
