package revisionsel;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bbasket {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\installation\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/pc/fruits-vegetables/fresh-vegetables/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		for (int i=0;i<10;i++) {
		String text = driver.findElement(By.xpath("//div[contains(text(),'all folks')]")).getAttribute("class");
		Thread.sleep(5000);
		System.out.println(text);
		if(text.equals("ng-hide")) {
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			Thread.sleep(5000);
		}else {
			System.out.println("all porducts are displayed");
			js.executeScript("window.scrollTo(0, -document.body.scrollHeight)");
			Thread.sleep(5000);
			break;
			
		}
			
			
		}
	
		List <WebElement> products = driver.findElements(By.xpath("//div[@qa='product_name']/a"));
		Thread.sleep(5000);
		System.out.println(products.size());
		for (int i=0;i<products.size();i++) {
			Thread.sleep(1000);
			String buyProduct=products.get(i).getText();
			System.out.println(buyProduct);
			if (buyProduct.equals("Cucumber - English")) {
				Thread.sleep(9000);
				driver.findElements(By.xpath("//button[@qa='add']")).get(i).click();
				Thread.sleep(3000);
				break;
			}
		}
		
		}

}


	


