package practice;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;



public class Tecdemy {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://beta.tecdemy.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		

	}

}
