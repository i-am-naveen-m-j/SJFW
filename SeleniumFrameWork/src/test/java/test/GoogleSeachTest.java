package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//importing GoogleSearchPage.java from pages package
import pages.GoogleSearchPage;

public class GoogleSeachTest {
	private static WebDriver driver = null;
	
	public static void main(String[] args) {
		googleSearch();
	}
	
	
	public static void googleSearch() {
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		
		//goto google.com
		driver.get("https://google.com");
		
		//enter text in search textbox
			//driver.findElement(By.name("q")).sendKeys("AutomationStepbyStep");
		GoogleSearchPage.textbox_search(driver).sendKeys("AutomationStepbyStep");
		
		
		//click on search button
		//driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		//driver.findElement(By.name("btnk")).sendKeys(Keys.ENTER);
		//driver.findElement(By.name("btnK")).click();
		GoogleSearchPage.button_search(driver).click();
		//GoogleSearchPage.button_search(driver).sendKeys(Keys.RETURN);
		
		//close browser
		driver.close();
		
		System.out.println("Test Completed Successfully");
		
		
	}

}