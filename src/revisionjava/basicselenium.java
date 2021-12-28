package revisionjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basicselenium {


		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "D:\\selenium\\installation\\drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://en-gb.facebook.com//");
			//driver.findElement(By.id("email")).sendKeys("Althaf");
			//driver.findElement(By.className(className))
			//driver.findElement(By.linkText("Create a Page")).click();
			//driver.findElement(By.partialLinkText("Forgotten")).click();
			//driver.findElement(By.cssSelector("#email")).sendKeys("Althaf");
			//driver.findElement(By.xpath("//div[@class=\"_6lux\"]/input[1]")).sendKeys("althaf");
			//driver.findElement(By.linkText("Forgotten password?")).click();
			driver.findElement(By.xpath("//*[contains(@ href,'recover')]")).click();
			Thread.sleep(5000);
			driver.quit();
	}

}
