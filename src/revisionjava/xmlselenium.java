package revisionjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xmlselenium  {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\installation\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//LastName TextBox
		        driver.get("https://seleniumautomationpractice.blogspot.com/2017/10/functionisogramigoogleanalyticsobjectri.html");		
		        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Sugandhi");
				Thread.sleep(5000);
				
				//Using LastName TextBox i am entering data into firstname
				driver.findElement(By.xpath("//*[@name='lastname']//preceding::input[1]")).sendKeys("Abhresh");
				Thread.sleep(5000);

				//Using LastName TextBox
				driver.findElement(By.xpath("//*[@name='lastname']//following::input[9]")).click();
				Thread.sleep(5000);
				
				//Using LastName TextBox
				driver.findElement(By.xpath("//*[contains(@name,'profession')]//following::input[5]")).click();
				Thread.sleep(5000);

				//Using LastName TextBox
				//driver.findElement(By.xpath("//*[starts-with(text(),'Test')]")).click();
				Thread.sleep(5000);
				//*[contains (text(),"Selenium WebElement Interactions")]
				String title = driver.findElement(By.xpath("//*[@class='post-title entry-title']")).getText();
				System.out.println(title);
				String title1 = driver.findElement(By.xpath("//*[contains(text(),'Practice')]")).getText();
				System.out.println(title1);
				//driver.close();

}
}