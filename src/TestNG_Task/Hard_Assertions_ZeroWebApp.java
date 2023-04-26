package TestNG_Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Hard_Assertions_ZeroWebApp {
	WebDriver driver;
	String Element1;

	@Test
	public void a_start() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://zero.webappsecurity.com/");
		driver.manage().window().maximize();
	}

	@Test
	public void b_assertEquals() {
		String Element1 = driver.findElement(By.xpath("//strong[contains(text(),'Online Banking')]")).getText();
		System.out.println(Element1);
		System.out.println("ASSERT EQUALS");
		Assert.assertEquals(Element1, "ONLINE BANKING");
	}

	@Test
	public void c_assertNotEquals() {
		System.out.println("ASSERT NOT EQUALS");
		Assert.assertNotEquals(Element1, "online banking");
	}

	@Test
	public void d_assertTrue() {
		Assert.assertTrue("ONLINE BANKING"
				.equals(driver.findElement(By.xpath("//strong[contains(text(),'Online Banking')]")).getText()));
		System.out.println("Assert True Pass");
	}

	@Test
	public void e_assertFalse() {
		Assert.assertFalse("Online Banking".equals(Element1));
		System.out.println("Assert False Pass");
	}

	@Test
	public void f_assertNotNull() {
		Object obj2 = driver.getTitle();
		Assert.assertNotNull(obj2);
		System.out.println(obj2);
		System.out.println("Assert Not Null Pass");
	}

	@Test
	public void g_assertNull() {
		Object obj3 = null;
		System.out.println(obj3);
		Assert.assertNull(obj3);
		System.out.println("Assert Null Pass");
	}

	@Test
	public void h_quit() {
		driver.close();
	}
}
