package home.assignment8;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class W3Schools extends BaseClass1 {
	@BeforeTest
	
	public void setData() {
		filename="W3School";
	}
@Test(dataProvider="fetchData")

	public  void runW3Schools(String fName,String email,String Address, String City,String State, String Zip, String ExpYear, String CVV,String ExpMonth, String CCNum,String NameonCard) {
		
	    driver.findElement(By.id("fname")).sendKeys(fName);
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("adr")).sendKeys(Address);
		driver.findElement(By.id("city")).sendKeys(City);
		driver.findElement(By.id("state")).sendKeys(State);
		driver.findElement(By.id("zip")).sendKeys(Zip);
		driver.findElement(By.id("expyear")).sendKeys(ExpYear);
		driver.findElement(By.id("cvv")).sendKeys(CVV);
		driver.findElement(By.id("expmonth")).sendKeys(ExpMonth);
		driver.findElement(By.id("ccnum")).sendKeys(CCNum);
		driver.findElement(By.id("cname")).sendKeys(NameonCard);
		
}

}

