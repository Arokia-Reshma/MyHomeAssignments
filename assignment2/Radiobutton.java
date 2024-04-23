package home.assignment2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/radio.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.manage().window().maximize();
	    driver.findElement(By.xpath("//label[text()='Edge']")).click();
		
		WebElement defaultradio = driver.findElement(By.xpath("//table[@id='j_idt87:console2']/tbody[1]/tr[1]/td[3]/div[1]/div[2]/span[1]"));
		if (defaultradio.isSelected()) {
            System.out.println("The default radio button is selected.");
        } else {
            System.out.println("The default radio button is not selected.");
        }
WebElement agegroup= driver.findElement(By.xpath("//div[@id='j_idt87:age']/div[1]/div[2]/div[1]/div[2]/span[1]"));
		agegroup.click();
		if(agegroup.isSelected()) {
			System.out.println("radio button is selected");
		}else {
			System.out.println("radio button is not selected");
		}
		

	}

}
