package week6.day1;


	

	import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



	public class CreateLeads1 extends ProjectSpecificMethod{
@BeforeTest		
public void setData() {
	filename = "CreateLead";
}
		
	@Test(dataProvider ="fetchData")
		public  void runCreateLead  ( String cname , String fname, String lname) {
			
			
			driver.findElement(By.linkText("Leads")).click();
			driver.findElement(By.linkText("Create Lead")).click();
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
			driver.findElement(By.name("submitButton")).click();
}
}