package revisionsel;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class levelzgrocery {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\installation\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	    driver.get("https://onlinegrocery.levelzcomputing.com/index.php?route=account/login");
	    driver.manage().window().maximize();
	   // String[] itemsList={"MTR Pav Bhaji 300g","MTR Lemon Rice 300g","MTR Navratan Kurma 300g","MTR Pongal 300g"};
	    String[] itemsList={"Ashirwad Whole Wheat Atta 2Kg"};
		driver.findElement(By.id("input-email")).sendKeys("usalthaf_81@yahoo.com");
		driver.findElement(By.id("input-password")).sendKeys("testing");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Actions mouse = new Actions(driver);
		/*mouse.moveToElement(driver.findElement(By.partialLinkText("Readymade Entree"))).perform();
		driver.findElement(By.xpath("//a[contains(text(),'MTR ready-to-eat')]")).click();
		List<WebElement> itemsToBuy = driver.findElements(By.xpath("//div[@class='caption']/h4"));
		System.out.println(itemsToBuy.size());
//		//for (WebElement i:itemsToBuy) 
		for (int i=0; i<itemsToBuy.size(); i++) {
			
		{
			
					
			String actualItem=itemsToBuy.get(i).getText();
			System.out.println(actualItem);
			
			List buyItemList = Arrays.asList(itemsList);
			if (buyItemList.contains(actualItem)) {
				Thread.sleep(5000);
				driver.findElements(By.xpath("//span[text()='Add to Cart']")).get(i).click();
				
				
		

		}
}
}*/
		mouse.moveToElement(driver.findElement(By.linkText("Atta & Rice"))).perform();
		//driver.findElement(By.xpath("//ul[@class='list-unstyled']//following:: a[7]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Atta (5)')]")).click();
		List<WebElement> itemsToBuy = driver.findElements(By.xpath("//div[@class='caption']/h4"));
		System.out.println(itemsToBuy.size());
		//for (WebElement i:itemsToBuy) 
			for (int i=0; i<itemsToBuy.size(); i++) {
				
			{
				
						
				String actualItem=itemsToBuy.get(i).getText();
				System.out.println(actualItem);
				
				List<String> buyItemList = Arrays.asList(itemsList);
				if (buyItemList.contains(actualItem)) {
					Thread.sleep(5000);
					driver.findElements(By.xpath("//span[text()='Add to Cart']")).get(i).click();
					
					
			

			}
	}
	}
	}
}