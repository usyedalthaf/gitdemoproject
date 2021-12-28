package revisionsel;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class doubcal {
	static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\installation\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.spicejet.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		//Thread.sleep(9000);
		String selectday="9";
		String selectmonth="July 2021";
		//String date = driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']//div[@class='ui-datepicker-title']")).getText();
		driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
		for (int header=0;header<9; header++){

			String Firstheader= driver.findElement(By.xpath("//div[contains(@class,'ui-datepicker-group-first')] //div[@class='ui-datepicker-title']")).getText();
			//System.out.println(Firstheader);
			String Secondheader= driver.findElement(By.xpath("//div[contains(@class,'ui-datepicker-group-last')] //div[@class='ui-datepicker-title']")).getText();
			//System.out.println(Secondheader);
			if (Firstheader.equals(selectmonth)) {
				List<WebElement> alldays= driver.findElements(By.xpath("//div[contains(@class,'ui-datepicker-group-first')] //td[@data-handler='selectDay']"));
				for (int i=0;i<alldays.size();i++) {
					String day=alldays.get(i).getText();
					if (day.equals(selectday)) {
						alldays.get(i).click();
						break;
					}
			}
				break;
			}
			else if (Secondheader.equals(selectmonth)){
				List<WebElement> alldays= driver.findElements(By.xpath("//div[contains(@class,'ui-datepicker-group-last')] //td[@data-handler='selectDay']"));
				for (int i=0;i<alldays.size();i++) {
					String day=alldays.get(i).getText();
					if (day.equals(selectday)) {
						alldays.get(i).click();
						break;
					}
			}
				break;
			}

			else {
				driver.findElement(By.xpath("//a[@data-handler='next']")).click();
			}
			
		}

	}

}
