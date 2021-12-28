package revisionjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class spicecheckbox {
	static WebDriver driver;
	
	static void checkbox(String i) throws InterruptedException {
		
		
	}
	
	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "D:\\selenium\\installation\\drivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get("https://www.spicejet.com");
		driver.manage().window().maximize();
		// int chkBoxCount=driver.findElements(By.xpath("//a[@class='tool_info mobile-tooltip icon-margin']/following::input[1]")).size();
		int chkBoxCount=driver.findElements(By.xpath("//input[@type='checkbox']")).size();
		
		 System.out.println(chkBoxCount);
		for(int i=1;i<chkBoxCount;)
		{
			driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']//following::label["+i+"]")).click();	
			i=i+1;
			Thread.sleep(5000);
		}
	    //driver.findElement(By.xpath("//input[@name='ctl00$mainContent$chk_friendsandfamily']")).click();  
        //Thread.sleep(5000);
	    //String result = driver.findElement(By.xpath("//*[@id='familyandfriend']/label")).getText();
	    //String result = driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']//following::label[1]")).getText();
        //driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']//following::label[4]")).click();
		//Thread.sleep(5000);
		
		//System.out.println(result+" "+ "is selected");
		driver.close();
	     
	    
	    
	    //}
	    
	    
	    
	

}
}