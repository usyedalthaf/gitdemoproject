package revisionsel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

      public class airindiafor {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
      System.setProperty("webdriver.chrome.driver", "D:\\selenium\\installation\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.airindia.in/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.id("from")).sendKeys("kh");
		Thread.sleep(3000);
		List<WebElement> FromOptions = driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));
		String FromActValue = "Riyadh, King Khalid International Airport, RUH, Saudi Arabia";
			
		for(int i=0;i<FromOptions.size();i++) {
		Thread.sleep(7000);	
		
		 String Result = FromOptions.get(i).getText();
		 System.out.println(FromOptions.get(i).getText());
		
		 if(Result.equals(FromActValue)) {
			
			FromOptions.get(i).click();
			
			break;

		}
						
		}
		//driver.close();
	}
      }             
	
	
