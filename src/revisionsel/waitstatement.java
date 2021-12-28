package revisionsel;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class waitstatement {
	static WebDriver driver;
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\installation\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	    driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
	    driver.manage().window().maximize();
	    //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.findElement(By.id("display-other-button")).click();
	    WebDriverWait wait = new WebDriverWait(driver, 10);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='hidden']")));
	   // wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@id='hidden']")));
	    //File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    TakesScreenshot scrShot =((TakesScreenshot)driver);
	    File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
	   
	    //Files.copy(SrcFile, new File("C:\\Users\\DELL\\Desktop\\anees class"));
	    File DestFile=new File("C:\\Users\\DELL\\Desktop\\anees class\\anees.png");

        //Copy file at destination

        FileUtils.copyFile(SrcFile, DestFile);

        driver.findElement(By.xpath("//button[@id='hidden']")).click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//button[@id='hidden']")));
        driver.findElement(By.xpath("//button[@id='enable-button']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='disable']")));
        driver.findElement(By.xpath("//button[@id='checkbox']")).click();
	}

}