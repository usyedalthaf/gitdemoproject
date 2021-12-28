package revisionjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class spicejet {
       static WebDriver driver;
	
	static void travel(String from, String to) throws InterruptedException {
		
		  driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click(); 
		  driver.findElement(By.xpath("//a[@value='"+from+"']")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("(//a[@value='"+to+"'])[2]")).click();

	}
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\installation\\drivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get("https://www.spicejet.com");
		driver.manage().window().maximize();
		
		//calling function
		travel("BLR","IXL");
	Thread.sleep(7000);
	driver.close();
	
	}

}
