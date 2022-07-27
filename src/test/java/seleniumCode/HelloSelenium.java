package seleniumCode;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class HelloSelenium {
	
    private static WebDriver driver = null;
	
    public static void main(String[] args) {
    	
    	System.setProperty("webdriver.chrome.driver","/Users/mayank.gupta/Downloads/chromedriver");
        driver = new ChromeDriver();
    	//System.setProperty("webdriver.gecko.driver","/Users/mayank.gupta/practiceProgramDemo/src/test/resources/geckodriver" );  
        //driver = new FirefoxDriver();

        driver.get("https://google.com");
        
        driver.getTitle(); // => "Google"

        driver.manage().timeouts().implicitlyWait( 1000, TimeUnit.MILLISECONDS);
        
        WebElement searchBox = driver.findElement(By.name("q"));
       // WebElement searchButton = driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[1]"));// name("btnK"));
        
        searchBox.sendKeys("Selenium"+Keys.ENTER);
        //searchButton.click();
        
        searchBox = driver.findElement(By.name("q"));
        searchBox.getAttribute("value"); // => "Selenium"
        
        driver.quit();
    }
}