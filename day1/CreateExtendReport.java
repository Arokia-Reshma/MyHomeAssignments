package week7.day1;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class CreateExtendReport {

	public static void main(String[] args) throws IOException {
		
	
        ExtentHtmlReporter repo=new ExtentHtmlReporter("./snaps/report.html");
    
        repo.setAppendExisting(true);
         ExtentReports extent=new ExtentReports();
        extent.attachReporter(repo);
        ExtentTest test=extent.createTest("LoginPage", "Login with valid credential");
    test.assignAuthor("Reshma");
    test.assignCategory("regression");
    test.pass("enter username");
    test.pass("enter password");
    test.pass("login button");
    test.pass("crmsfa", MediaEntityBuilder.createScreenCaptureFromPath(".././snaps/img1.png").build());
test.pass("leads",MediaEntityBuilder.createScreenCaptureFromPath(".././snaps/img2.png").build());

ExtentTest test2=extent.createTest("CreatePage", "ceeateLead with valid credential");
    
    test2.assignAuthor("Arokia");
    test2.assignCategory("smoke");
    
    test2.pass("enter username");
    test2.fail("enter password");
    test2.pass("login button");
    
    extent.flush();
    System.out.println("done");
	}
}