package revisionsel;

import java.util.Set;
import java.util.Iterator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandle {
		static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\installation\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	    driver.get("http://demo.automationtesting.in/Windows.html");
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//button[contains(@class,'btn-info')]")).click();
	    Set<String> parent= driver.getWindowHandles();
	    Iterator <String> it = parent.iterator();  
	 	String parentid = it.next();
	 	System.out.println(parentid );
	    //Iterator <String> it= parent.iterator(); 
	 	String childid = it.next();
	 	driver.switchTo().window(childid);
	 	String message = driver.findElement(By.xpath("//section[@class='hero homepage']/h1[1]")).getText();
	 	System.out.println(message);
	 	driver.switchTo().window(parentid);
		
		driver.findElement(By.xpath("//ul[@class='nav nav-tabs nav-stacked']//following::a[2]")).click();
		driver.findElement(By.className("btn-primary")).click();
		driver.quit();
	}

}
