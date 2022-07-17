package seleniumCode;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrangeHRM {

	private static WebDriver driver = null;
	private static WebDriverWait wait = null;

	@BeforeClass
	public static void setUp() {

		System.setProperty("webdriver.gecko.driver",
				"/Users/mayank.gupta/practiceProgramDemo/src/test/resources/geckodriver");

		// create firefox driver object
		driver = new FirefoxDriver();

		// create explicit wait object
		wait = new WebDriverWait(driver, 30);

		// open urrl
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

		// maximize window
		driver.manage().window().maximize();
	}

	@Test
	public void validateLoginPage() {

		// wait and get the expected text on login page
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='logInPanelHeading']")));
		String loginPageHeader = driver.findElement(By.xpath("//div[@id='logInPanelHeading']")).getText();//
		Assert.assertEquals(loginPageHeader, "LOGIN Panel");

	}

	@Test
	public void validateLogin() {

		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='branding']/a")));
		String mainPageHeader = driver.findElement(By.xpath("//div[@id='branding']/a")).getAttribute("href");
		Assert.assertTrue(mainPageHeader.contains("http://www.orangehrm.com/"));
	}

	@Test
	public void validateLoginUser() {

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='panelTrigger']")));
		String loginUser = driver.findElement(By.xpath("//a[@class='panelTrigger']")).getText();//
		Assert.assertEquals(loginUser, "Welcome 125");
	}

	@AfterClass
	public static void tearDown() {

		driver.quit();
	}
}