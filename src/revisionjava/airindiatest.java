package revisionjava;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class airindiatest {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		    System.setProperty("webdriver.chrome.driver", "D:\\selenium\\installation\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.airindia.in/");
			driver.manage().window().maximize();
			driver.findElement(By.id("from")).sendKeys("ja");
			Thread.sleep(9000);
			String Actval = "Jaffna, Jaffna International Airport, JAF, Sri Lanka";
			List<WebElement> options = driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));
			for(WebElement option:options) {
				//System.out.println(option.getText());
			if(option.getText().equals(Actval)) {
			option.click();
			break;
	} 

}
			driver.findElement(By.id("to")).sendKeys("aha");//destination
			Thread.sleep(9000);
			String Actval1 = "Udaipur, Maharana Pratap Airport, UDR, India";
			List<WebElement> options1 = driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));
			for(WebElement option:options1) {
				Thread.sleep(5000);
				
			if(option.getText().equals(Actval1)) {
				System.out.println(option.getText());
				option.click();
			break;
	
	}
}
	}	
	}