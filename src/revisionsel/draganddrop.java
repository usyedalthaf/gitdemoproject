package revisionsel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {
	static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\installation\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	    driver.get("https://jqueryui.com/droppable");
	    driver.manage().window().maximize();
	    driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class= 'demo-frame']")));
	    //driver.findElement(By.id("draggable")).click();
	    Actions mouse = new Actions(driver);
	    WebElement source = driver.findElement(By.id("draggable"));
	    WebElement target = driver.findElement(By.id("droppable"));
	    mouse.dragAndDrop(source, target).perform();
	
	}
}