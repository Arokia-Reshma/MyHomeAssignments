package marathon3;


    import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

	public class CreateIncident extends ProjectSpecificMethod{

		@Test
		public void runCreateIncident() throws InterruptedException {
			
			
			driver.findElement(By.xpath("//button[@id='sysverb_new']")).click();
			incNum = driver.findElement(By.xpath("//input[@id='incident.number']")).getAttribute("value");
			driver.findElement(By.id("incident.short_description")).sendKeys("Create via automation");
			driver.findElement(By.xpath("//button[text()='Submit']")).click();
			driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys(incNum+Keys.ENTER);
			String text1 = driver.findElement(By.xpath("//a[@class='linked formlink']")).getText();
			if(incNum.equals(text1)) {
				System.out.println("Incident number is created");
			}else {
				System.out.println("Incident number is not created");
			}
			
			}
		
		
	}

	
