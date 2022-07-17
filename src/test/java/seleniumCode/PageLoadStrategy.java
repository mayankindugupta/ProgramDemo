package seleniumCode;

//import static org.openqa.selenium.PageLoadStrategy.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLoadStrategy {


	public static void main(String[] args) {
		
		ChromeOptions chromeOptions = new ChromeOptions();
		//chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		WebDriver driver = new ChromeDriver(chromeOptions);
		try {
			driver.get("https://google.com");
		} finally {
			driver.quit();
		}
	}
}


//normal	: complete	: Used by default, waits for all resources to download
//eager	:interactive	: DOM access is ready, but other resources like images may still be loading
//none	:Any:	Does not block WebDriver at all
