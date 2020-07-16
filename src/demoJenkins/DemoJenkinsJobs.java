package demoJenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DemoJenkinsJobs {

	@Test
	public void testJenkins() {

		System.out.println("Welcome to Jenkins World");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		System.out.println("Title is: "+driver.getTitle());
		
		driver.quit();

	}

}
