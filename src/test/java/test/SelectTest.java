package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class SelectTest {
		
		WebDriver driver;
		
		@Test
		public void Selectclass() {
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			driver.get("https://objectspy.space/");
			
			
			//selectclass
			//Select continets, then Africa
			Select select = new Select(driver.findElement(By.id("continents")));
			select.selectByVisibleText("Africa");
			
			
			
			
			
			
			
			
			
			
			WebDriverWait wait = new WebDriverWait(driver, 3);
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//h2"))));
			
			
			}		
			

		@AfterTest
		public void close() {
			driver.close();
			driver.quit();
		}		
		
			
		}
		

		
		
		
		
	
	
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	

