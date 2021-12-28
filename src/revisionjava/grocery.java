package revisionjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class grocery {
	     
	   static WebDriver driver;
	   public void user(String name, String id){
	    	 	 
	    	
	    	
	    	
			driver.findElement(By.name("email")).sendKeys(name);
	 		driver.findElement(By.id("input-password")).sendKeys(id);
	 		driver.findElement(By.xpath("//*[@value='Login']")).click();
	 		driver.findElement(By.name("email")).clear();
			driver.findElement(By.id("input-password")).clear();
			
			
			

	     }
	

	public static void main(String[] args) throws InterruptedException  {
	    
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\installation\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	    driver.get("https://onlinegrocery.levelzcomputing.com/index.php?route=account/login");
	    driver.manage().window().maximize();
	    grocery gn = new grocery();
		gn.user("althaf","testing");
		gn.user("anees","Testing123");
		gn.user("Pushpa","Test7867");
		gn.user("Matheen","test5342");
		driver.close();
	
	}

}
