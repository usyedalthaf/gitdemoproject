package Loans;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTour {
  

	// openBrowser @BeforeSuite
	// Open AUT @BeforeTest
	// Login @Test
	// Logout @AfterMethod
	// Close Browser @AfterSuit
	
	 WebDriver driver;
	 @Test(priority = 1)
	  public void openBrowser() {
	   System.setProperty("webdriver.chrome.driver", "D:\\selenium\\installation\\drivers\\chromedriver.exe");
	   driver = new ChromeDriver();
	 
	 }
	 @Test(priority = 2)
	 public void openAUT() {
	   driver.get("http://demo.guru99.com/test/newtours/");
	 }
		
	@Test(priority = 3)
       public void TestLogin() throws InterruptedException {
  
		// Enter UserID
		driver.findElement(By.name("userName")).sendKeys("tutorial");

		// Enter Password
		driver.findElement(By.name("password")).sendKeys("tutorial");

		// Click on Sign in button
		driver.findElement(By.name("submit")).click();
		Thread.sleep(3000);
	
	}
  

	@Test(priority = 4, groups = {"smoke"})
  public void Logout() throws InterruptedException {
	// Click on Sign off
	driver.findElement(By.linkText("SIGN-OFF")).click();
	Thread.sleep(3000);
  
  }

  

 
	@Test(priority = 5)
  public void closeBrowswer() {
  driver.quit();
  
  }

}
