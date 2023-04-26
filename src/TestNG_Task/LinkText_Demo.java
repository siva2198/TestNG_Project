package TestNG_Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LinkText_Demo {
	WebDriver driver;
	public void a_start()
	{
	 System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
     driver = new ChromeDriver();
     driver.get("https://formy-project.herokuapp.com/form");
     driver.manage().window().maximize();
	}
	@Test
	public void b_LinkText()
	{
		//driver.findElement(By.xpath("//a[contains(text(),'Forgot')]")).click();
		//linktext
		driver.findElement(By.linkText("Forgot your password ?")).click();
		//partical linktext
		driver.findElement(By.partialLinkText("Forgot")).click();
	}
	
	
}
