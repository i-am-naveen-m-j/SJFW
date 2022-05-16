package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtendReportsBasicDemo {
	private static WebDriver driver = null;
	public static void main(String[] args) {
		ExtentSparkReporter htmlReporter = new ExtentSparkReporter("extentReports.html");
		
		 // create ExtentReports and attach reporter(s)
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        
        
     // creates a toggle for the given test, adds all log events under it    
        ExtentTest test1 = extent.createTest("Google Seartch Test One","this is a test to validate google search functionality");
	
        String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		test1.log(Status.INFO, "starting Test Case");
		driver.get("https://google.com");
		test1.pass("Navigated to google.com");
		
		driver.findElement(By.name("q")).sendKeys("Automationaerhgjjkkk");
		test1.pass("Enterd text in Searchbox");
		
		//driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		//driver.findElement(By.name("btnK")).click();
		//test1.pass("Pressed keyboard enter key");
		
		driver.close();
		//driver.quit();
		test1.pass("Closed the browser");
		
		test1.info("Test Completed");
		
		
		//
		
		// creates a toggle for the given test, adds all log events under it    
        ExtentTest test2 = extent.createTest("Google Seartch Test Two","this is a test to validate google search functionality");
	
        //String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		test2.log(Status.INFO, "starting Test Case");
		driver.get("https://google.com");
		test2.pass("Navigated to google.com");
		
		driver.findElement(By.name("q")).sendKeys("Automationaerhgjjkkk");
		test2.pass("Enterd text in Searchbox");
		
		//driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		//driver.findElement(By.name("btnK")).click();
		//test2.fail("Pressed keyboard enter key");
		
		driver.close();
		//driver.quit();
		//test2.pass("Closed the browser");
		test2.fail("Closed the browser");
		
		test2.info("Test Completed");
        
		// calling flush writes everything to the log file
        extent.flush();
	}
}
