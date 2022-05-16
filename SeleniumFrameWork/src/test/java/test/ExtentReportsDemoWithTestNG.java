package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportsDemoWithTestNG {
	ExtentSparkReporter htmlReporter;
	ExtentReports extent;
	//WebDriver driver;

	@BeforeSuite
	public void setup() {

		// start reporters
		 htmlReporter = new ExtentSparkReporter("extent.html");

		// create ExtentReports and attach reporter(s)
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		//String projectPath = System.getProperty("user.dir");
		//System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");
		//driver = new ChromeDriver();
	}


	@Test
	public void test1() {
		// creates a toggle for the given test, adds all log events under it    
        ExtentTest test = extent.createTest("MyFirstTest", "Sample description");
        
     // log(Status, details)
        test.log(Status.INFO, "This step shows usage of log(status, details)");

        // info(details)
        test.info("This step shows usage of info(details)");
        
        // log with snapshot
        test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        
        // test with snapshot
        test.addScreenCaptureFromPath("screenshot.png");
		
	}
	
	@Test
	public void test2() {
		  
        ExtentTest test = extent.createTest("My2ndTest", "Sample description");
        test.log(Status.INFO, "This step shows usage of log(status, details)");
        test.info("This step shows usage of info(details)");
        test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        test.addScreenCaptureFromPath("screenshot.png");
		
	}

	@AfterSuite
	public void tearDown() {
		// calling flush writes everything to the log file
        extent.flush();
	}
}
