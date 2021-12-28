package revisionjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class spicedropdown {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "D:\\selenium\\installation\\drivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get("https://www.spicejet.com");
		driver.manage().window().maximize();
		Select oselect = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")));
		Thread.sleep(9000);
		oselect.selectByIndex(9);
	
	}

}
