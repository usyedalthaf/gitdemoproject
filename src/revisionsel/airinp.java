package revisionsel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class airinp {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	      System.setProperty("webdriver.chrome.driver", "D:\\selenium\\installation\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.airindia.in/");
			driver.manage().window().maximize();
			Thread.sleep(5000);
			driver.findElement(By.id("from")).sendKeys("bl");
			Thread.sleep(3000);
			List<WebElement> fromOptions = driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));
			String fromActValue = "Hubli, Hubli Airport, HBX, India";
			
			Thread.sleep(2000);
					
			for(WebElement option:fromOptions) {
				
				//System.out.println(Option.getText());
				
				if(option.getText().equals(fromActValue)) {
					
					option.click();
					break;
				}
				} 
			
				
			driver.findElement(By.id("to")).sendKeys("aha");//destination
			Thread.sleep(9000);
			String dest = "Udaipur, Maharana Pratap Airport, UDR, India";
			List<WebElement> tooptions = driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));
			for(WebElement option1:tooptions) {
				Thread.sleep(5000);
				
				
				if(option1.getText().equals(dest)) {
					System.out.println(option1.getText());
					Thread.sleep(3000);
					option1.click();
			           break;
	
	}
    }
		
	}
	}
