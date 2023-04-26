/*Registeration form fill 
 * Website- https://petstore.octoperf.com/actions/Account.action?newAccountForm=
 * Use priority and disability as false 
 */
package TestNG_Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class JPetStore {
	WebDriver driver;

	@Test(priority = 1)
	public void pageLoad() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://petstore.octoperf.com/actions/Account.action?newAccountForm=");
		driver.manage().window().maximize();
	}

	@Test(priority = 2)
	public void userInfo() {
		driver.findElement(By.name("username")).sendKeys("fsa");
		driver.findElement(By.name("password")).sendKeys("1as2;lkdfasdfjhgfd34");
		driver.findElement(By.name("repeatedPassword")).sendKeys("f");
	}

	@Test(priority = 3)
	public void accountInfo() {
		driver.findElement(By.name("account.firstName")).sendKeys("sd");
		driver.findElement(By.name("account.lastName")).sendKeys("asasasasasas");
		driver.findElement(By.name("account.email")).sendKeys("emjgmail.com");
		driver.findElement(By.name("account.phone")).sendKeys("12345678df90");
		driver.findElement(By.name("account.address1")).sendKeys("Address 10");
		driver.findElement(By.name("account.address2")).sendKeys("Addrasdfess 02");
		driver.findElement(By.name("account.city")).sendKeys("Cheasnnai");
		driver.findElement(By.name("account.state")).sendKeys("asasas");
		driver.findElement(By.name("account.zip")).sendKeys("69");
		driver.findElement(By.name("account.country")).sendKeys("lkjhgfdsa");
	}

	@Test(priority = 4)
	public void profileInfo() throws InterruptedException {
		Select Language = new Select(driver.findElement(By.name("account.languagePreference")));
		Language.selectByVisibleText("japanese");

		Select FavCategory = new Select(driver.findElement(By.name("account.favouriteCategoryId")));
		FavCategory.selectByVisibleText("DOGS");

		WebElement MyList = driver.findElement(By.name("account.listOption"));
		MyList.click();

		WebElement MyBanner = driver.findElement(By.name("account.bannerOption"));
		MyBanner.click();
		driver.findElement(By.name("newAccount")).click();
		Thread.sleep(3000);
}
	@Test (enabled=false)
	public void disability()
	{
		System.out.println("Disabling Test Cases");
	}

}
