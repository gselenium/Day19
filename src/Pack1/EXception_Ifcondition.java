package Pack1;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class EXception_Ifcondition {
	@Test
	public void test(){
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://google.com");
		String title=driver.getTitle();
		System.out.println(title);
		if(title.equalsIgnoreCase("Google")){
			System.out.println("Title is correct");
		}else{
			System.err.println("Page title is not correct");
			Assert.fail("Title is not meet the expected");
		}
		
	}
	
	@Test
	public void quikr(){
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://quikr.com");
	}
	

}
