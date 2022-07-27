package seleniumCode;

/*
Perform following steps:
1. https://www.ophiropt.com/laser--measurement/laser-power-energy-meters/services/peak-power-calculator
2. Enters the following parameters:
3. Beam Profile: Tophat
4. Beam Shape: Circular
5. Diameter: 1.5mm
6. Max Average Power: 5W
7. Repetition Rate: 100kHz
8. Pulse Width: 250ps
9. Presses the Calculate button
10. Verifies the Peak Power and Peak Power Density values are correct
11. Updates the parameters:
12. Beam Profile: Gaussian
13. Ensures the Beam Shape selection area disappears
14. Presses the Calculate button
15. Verifies the Peak Power and Peak Power Density values are correct
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LaserPeakPowerCalculator {

	private static WebDriver driver = null;

	public static void main(String[] args) {

		// create chrome driver object
		System.setProperty("webdriver.chrome.driver", "/Users/mayank.gupta/Downloads/chromedriver");
		driver = new ChromeDriver();
		
		// maximize the chrome window
		driver.manage().window().maximize();
		
		// wait for 1 sec
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);

		// open the url
		driver.get("https://www.ophiropt.com/laser--measurement/laser-power-energy-meters/services/peak-power-calculator");
		
		//explicit wait to wait for page to load
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='page-title']")));

		// select tophat beam profile
		WebElement beamProfileTophatRB = driver.findElement(By.xpath("//input[@value='Tophat']"));
		beamProfileTophatRB.click();

		// select circular beam shape
		WebElement beamShapeRB = driver.findElement(By.id("beam1Circ"));
		beamShapeRB.click();

		// enter value in diameter text field
		WebElement beamDiameterTF = driver.findElement(By.id("beamDiameter"));
		beamDiameterTF.sendKeys("1.5");

		// select max power radio button
		WebElement maxPowerRB = driver.findElement(By.id("enerpow1"));
		maxPowerRB.click();

		// select max power unit as Watt
		Select maxPowerUnit = new Select(driver.findElement(By.id("pwr_unit")));
		maxPowerUnit.selectByValue("W");

		// enter value in max power text field
		WebElement maxPowerTF = driver.findElement(By.id("max_pwr"));
		maxPowerTF.sendKeys("5");

		// select repetitiom rate unit as kHz
		Select repetitionRateUnit = new Select(driver.findElement(By.id("rep_unit")));
		repetitionRateUnit.selectByValue("kHz");

		// enter value in repetitiom rate text field
		WebElement repetitionRateTF = driver.findElement(By.id("repRate"));
		repetitionRateTF.sendKeys("100");

		// select pulse Width unit as ps
		Select pulseWidthUnit = new Select(driver.findElement(By.id("pulse_unit")));
		pulseWidthUnit.selectByValue("ps");

		// enter value in pulse Width text field
		WebElement pulseWidthTF = driver.findElement(By.id("pulse"));
		pulseWidthTF.sendKeys("250");

		// click calculate button to get the results
		driver.findElement(By.id("btnCalculate")).click();

		// get the value from Peak power field
		String peakPower = driver.findElement(By.xpath("//input[@id='peakPowerRes']")).getAttribute("value");

		// get the value from Peak power density field
		String peakPowerDensity = driver.findElement(By.xpath("//input[@id='peakPowerDenRes']")).getAttribute("value");

		// validate the fetch peak power value from expected value
		//**Assertion can be used instead of if else also**
		if (peakPower.equals("200000.00"))
			System.out.println("\nPeak Power is 200000.00 which means ActualValue == ExpectedValue");
		else
			System.out.println("\nPeak Power is NOT 200000.00 which means ActualValue != ExpectedValue");

		// validate the fetch peak power density value from expected value
		if (peakPowerDensity.equals("11317684.84"))
			System.out.println("Peak Power Density is 11317684.84 which means ActualValue == ExpectedValue");
		else
			System.out.println("Peak Power Density is NOT 11317684.84 which means ActualValue != ExpectedValue");

		// updated value in beam profile as Gaussian from tophat
		WebElement beamProfileGaussianRB = driver.findElement(By.xpath("//input[@value='Gaussian']"));
		beamProfileGaussianRB.click();

		// get & validate shapebox status when gaussian value is selected as beam profile
		WebElement beamShapeBox = driver.findElement(By.id("shapeBox"));
		boolean flag = beamShapeBox.isDisplayed();

		if (flag)
			System.out.println("\nBeam Shape Selection area is displayed even after Gaussian bean profile is selected");
		else
			System.out.println("\nBeam Shape Selection area is NOT displayed after Gaussian bean profile is selected.");

		// Again click calculate button
		driver.findElement(By.id("btnCalculate")).click();
		
		// get the updated value from Peak power field
		String updatedPeakPower = driver.findElement(By.xpath("//input[@id='peakPowerRes']")).getAttribute("value");

		// get the updated value from Peak power density field
		String updatedPeakPowerDensity = driver.findElement(By.xpath("//input[@id='peakPowerDenRes']")).getAttribute("value");

		// Again validate the fetch peak power value from expected value
		if (updatedPeakPower.equals("200000.00"))
			System.out.println("\nUpdated Peak Power is 200000.00 which means ActualValue == ExpectedValue");
		else
			System.out.println("\nUpdated Peak Power is NOT 200000.00 which means ActualValue != ExpectedValue");

		// Again validate the fetch peak power density value from expected value
		if (updatedPeakPowerDensity.equals("22635369.68"))
			System.out.println("Updated Peak Power Density is 22635369.68 which means ActualValue == ExpectedValue");
		else
			System.out.println("Updated Peak Power Density is NOT 22635369.68 which means ActualValue != ExpectedValue");

		// closing the driver
		driver.quit();
	}
}