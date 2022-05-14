import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserTest {
	public static void main(String[] args) {
		//System.setProperty("webdriver.gecko.driver","C:\\Users\\cnbna\\eclipse-workspace\\SeleniumJavaFramework\\drivers\\geckodriver\\geckodriver.exe");
		
		String projectPath = System.getProperty("user.dir");
		System.out.println("projectPath : "+projectPath);
		
		//System.setProperty("webdriver.gecko.driver", projectPath+"\\drivers\\geckodriver\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		//System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver\\chromedriver.exe");
		//WebDriver driver =new ChromeDriver();
		
		System.setProperty("webdriver.edge.driver", projectPath+"\\drivers\\edgedriver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.get("http://biphrm-biplah-stg1.pegacloud.io/prweb/app/");
		
		//driver.findElement(By.id("txtUserID")).sendKeys("DK_TAMAManager");
		//driver.findElement(By.xpath("/html[1]/body[1]/main[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[1]/input[1]")).sendKeys("DK_TAMAManager");
		//driver.findElement(By.xpath("//input[@id='txtUserID']")).sendKeys("DK_TAMAManager");
		//driver.findElement(By.cssSelector("#txtUserID")).sendKeys("DK_TAMAManager");
		
		// Below 3re Lines Counting input elements using List by importing package java.util.List //
		List<WebElement> listOfInputElements = driver.findElements(By.xpath("//input"));
		int count = listOfInputElements.size();
		System.out.println("Count of Input elemtns : "+count);
		
		
		WebElement loginid = driver.findElement(By.id("txtUserID"));
		loginid.sendKeys("DK_TAMAManager");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		WebElement password = driver.findElement(By.id("txtPassword"));
		password.sendKeys(" Rules#137");
		
		//driver.findElement(By.id("sub")).click();
		WebElement login = driver.findElement(By.id("sub"));
		login.click();
		
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	driver.close();
	//driver.quit();
	}
}