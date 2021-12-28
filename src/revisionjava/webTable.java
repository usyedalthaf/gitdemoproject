package revisionjava;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webTable {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\installation\\drivers\\chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://money.rediff.com/indices");
		driver.findElement(By.id("showMoreLess")).click();
		List<WebElement>row = driver.findElements(By.xpath("//*[@id=\"dataTable\"]//tbody/tr"));
		System.out.println(row.size());
		int rowindex = 0;
		int colindex = 0 ;
		List<WebElement>col = driver.findElements(By.xpath("//*[@id=\"dataTable\"]/thead/tr/th"));
		System.out.println(col.size());
			//System.out.println(col.getText());
			
			for(int j=0;j<col.size();j++) {
				String stringtext = col.get(j).getText();
				System.out.println(stringtext);
				if("Change (Pts)".equals(col.get(j).getText())) {
				colindex = j;
				break;
					
					
				
				}
			}
		
		//for(int i =1;i<row.size();i++) {
		List<WebElement> rowlen =	driver.findElements(By.xpath("//*[@id=\'dataTable\']/tbody/tr[1]"));
			System.out.println(rowlen);
		
		}
		//System.out.println(rowindex);

		//System.out.println(colindex);
	
	}

	
	


