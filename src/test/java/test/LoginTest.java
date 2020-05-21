package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class LoginTest {
	WebDriver driver;
	
	
	@Test
	public void Usershouldbeabletologin() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		/*Scenario:Valid user should be able to login
		Steps #StepsExpected ResultActual ResultStatus
		1Open Chrome BrowserBrowser launched
		2Go to TechFios Website
		3Type username in the username field
		4Type password in the password field
		5Click on the submit button
		6Dashboard page title should display*/
		
		driver.get("http://techfios.com/test/billing/?ng=login/");
		driver.findElement(By.id("username")).sendKeys("techfiosdemo@gmail.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 3);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//h2"))));
		
		
		}		
		

	@AfterTest
	public void close() {
		driver.close();
		driver.quit();
	}		
	
		
	}
	

