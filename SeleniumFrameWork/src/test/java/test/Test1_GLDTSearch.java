package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1_GLDTSearch {

	public static void main(String[] args) {
		googleSearch();
		
	}
	public static void googleSearch() {
		String projectPath = System.getProperty("user.dir");
		//System.out.println("projectPath : "+projectPath);
		System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		/*
		 * 
		 */
		//goto https://biphrm-biplah-stg1.pegacloud.io/prweb/
					//driver.get("https://google.com");
				driver.get("https://biphrm-biplah-stg1.pegacloud.io/prweb/");
				
		//enter text in UserName textbox
					//driver.findElement(By.name("q")).sendKeys("AcelSolutions");
				driver.findElement(By.id("txtUserID")).sendKeys("DK_TAMAManager");
					//WebElement loginid = driver.findElement(By.id("txtUserID"));
					//loginid.sendKeys("DK_TAMAManager");
				
		//enter text in Password textbox
				driver.findElement(By.id("txtPassword")).sendKeys(" Rules#137");
					//WebElement password = driver.findElement(By.id("txtPassword"));
					//password.sendKeys(" Rules#137");
				
		//click on Login button
					driver.findElement(By.id("sub")).click();
					//WebElement login = driver.findElement(By.id("sub"));
					//login.click();
		//Login by using enter button when google it auto suggestion time we use it.
					//driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
				
		//close browser
				driver.close();
				
				System.out.println("Test Completed Successfully");
		
	}
}
