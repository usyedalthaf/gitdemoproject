package revisionjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDown {
	static WebDriver driver; 
	static void travel(String from,String to) throws InterruptedException {
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		 
		 driver.findElement(By.xpath("//a[contains(@value,'"+from+"')]")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.name("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("(//a[@value='"+to+"'])[2]")).click();
		 Thread.sleep(5000);
			
	}
	
	
	
	
	
	
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\installation\\drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://www.spicejet.com/");
			driver.manage().window().maximize();
			
			 //Select dropdown = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
			 //String x=dropdown.getFirstSelectedOption().getText();
			 //System.out.println(x);
			 //System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
			// dropdown.selectByIndex(5);
			//Thread.sleep(5000);
			 //dropdown.selectByValue("GBP");
			 //Thread.sleep(5000);
			/* driver.findElement(By.id("divpaxinfo")).click();
			 Select dropdown = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
			 Thread.sleep(5000);
			 dropdown.selectByIndex(4);*/
			 Thread.sleep(5000);
			 travel("BLR","IXE");
			 driver.close();
		
	}

}
