/*Taking screenshot of a webpage
 * Website - http://zero.webappsecurity.com/
 * use implicit and explicit wait
 */
package TestNG_Task;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ScreenShot_Taking {
	public static WebDriver driver;

	@Test
	public void a_start() throws IOException {
		System.setProperty("driver.chrome.driver", "D:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://zero.webappsecurity.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//strong[text()='Online Banking']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		b_screenshot();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[contains(text(),'over 1,000,000')]")))
				.isDisplayed();
		c_quit();
	}

	public static void b_screenshot() throws IOException {
		File scr = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scr,
				new File("D:\\Selenium\\ScreenShot_demo\\OnlineBanking" + System.currentTimeMillis() + ".png"));

	}

	public static void c_quit() {
		driver.close();
	}

}
