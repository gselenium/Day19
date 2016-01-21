package Pack1;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Exception_TryCatchBlack {
	@Test
	public void test() throws IOException, InterruptedException{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		try{
		driver.get("http://gmail.com");
		driver.findElement(By.id("Email")).sendKeys("govardhan.selenium");
		driver.findElement(By.id("next")).click();
		driver.findElement(By.id("Passwd")).sendKeys("testing123");
		driver.findElement(By.id("sign888In")).click();	
		Thread.sleep(2000);
		}catch(Exception t){	
			//System.err.println("Element not found");			
			File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(srcFile, new File("D:/screenshots/sitegoogle.png"));
			System.out.println("Screenshot taken");
		}
		
		driver.get("http://quikr.com");
		
	}
	

}
