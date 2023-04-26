package TestNG_Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SwagLabs_TestNG {
WebDriver driver;
@Test
public void a_Start()
{
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
	driver.manage().window().maximize();
}
@Test
public void  b_login() throws InterruptedException
{
	driver.findElement(By.id("user-name")).sendKeys("standard_user");
	driver.findElement(By.id("password")).sendKeys("secret_sauce");
	driver.findElement(By.id("login-button")).click();
	Thread.sleep(2000);
	}
@Test
public void c_logout() throws InterruptedException
{
	driver.findElement(By.id("react-burger-menu-btn")).click();
	Thread.sleep(3000);
	driver.findElement(By.id("logout_sidebar_link")).click();
	}
@Test
public void d_quit() throws InterruptedException
{	Thread.sleep(3000);
	driver.quit();
	}
}
 
