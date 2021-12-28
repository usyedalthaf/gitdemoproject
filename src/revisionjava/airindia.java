package revisionjava;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class airindia {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
      System.setProperty("webdriver.chrome.driver", "D:\\selenium\\installation\\drivers\\chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.airindia.in/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.id("from")).sendKeys("ban");
		Thread.sleep(5000);
		//String result= driver.findElement(By.xpath("//*[@id='ui-id-228']")).getText();
	
		//String name = driver.findElement(By.xpath("//*[@id='ui-id-2']//following::a[2]")).getText();
			//System.out.println(name);
		List<WebElement>options=driver.findElements(By.xpath("//*[@id='ui-id-2']//following::a[1]"));
          Thread.sleep(9000);
		String Actualval="Bhubaneswar, Biju Patnaik Airport, BBI, India";
		
for (WebElement option:options) {
	System.out.println(option.getText());
	if(option.getText().equals(Actualval)) {
		option.click();
		break;

	}

	}
	
	}
}	
