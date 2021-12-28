package revisionsel;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class singleCalender {
	static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\installation\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	    driver.get("https://www.globalsqa.com/demo-site/datepicker/");
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		

	    driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
	    driver.findElement(By.id("datepicker")).click();
	    String selectday="20";
		String selectmonth="August 2022";
		String month =driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
		System.out.println(month);
	do {
			
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			
		}while(!driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText().equals(selectmonth));
			
	           List<WebElement> date = driver.findElements(By.xpath("//td[@data-handler='selectDay']"));
		System.out.println(date.size());
			for(int i=0;i<date.size();i++) {
				String day = date.get(i).getText();
				if(day.equals(selectday)) {
					date.get(i).click();
			}
		
	
	}
		}		
}
	