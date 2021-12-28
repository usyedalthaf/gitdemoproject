package revisionjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class spicecomplex {
static WebDriver driver;
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "D:\\selenium\\installation\\drivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get("https://www.spicejet.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();
		String style = driver.findElement(By.xpath("//div[@id='Div1']")).getAttribute("style");
		System.out.println(style);
		if (style.contains("0.5")) {
			System.out.println("it is disabled");
		}
		else {
			System.out.println("it is not disabled");
		}

	}

}
