package home.assignment6;

import java.time.Duration;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandling {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();
        driver.findElement(By.xpath("//div[@for='crmsfa']//a[1]")).click();
        driver.findElement(By.linkText("Contacts")).click();
        driver.findElement(By.linkText("Merge Contacts")).click();	
        driver.findElement(By.xpath("//input[@id ='partyIdFrom']/following-sibling::a")).click();
        Set<String> windowHandles = driver.getWindowHandles();
        List<String> window =new LinkedList<String>(windowHandles);
        driver.switchTo().window(window.get(1));
        driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a")).click();
        driver.switchTo().window(window.get(0));
        driver.findElement(By.xpath("//input[@id='partyIdTo']/following-sibling::a")).click();
         windowHandles = driver.getWindowHandles();
         window =new LinkedList<String>(windowHandles);
         driver.switchTo().window(window.get(1));
         driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[2]")).click();
         driver.switchTo().window(window.get(0));
        driver.findElement(By.className("buttonDangerous")).click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        }
}


