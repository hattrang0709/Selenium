package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Driver {
	public WebDriver driver;
	public WebDriverWait wait; 
	
	
	/**
	 *  set up and choose Browes
	 * @param browser
	 * @param timeout
	 */
	@SuppressWarnings("deprecation")
	public void browser(String browser, int timeout) {
		if(browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver","./browser/geckodriver.exe");
			DesiredCapabilities desired = new DesiredCapabilities();
			desired.setCapability("marionette", false);  // to disable marionette, by default trgeckodriverue
			 driver = new FirefoxDriver(desired);
		}
		else if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","./browser/chromedriver.exe");
			 driver =new ChromeDriver();	
		}
		else if(browser.equals("ie")) {
			System.setProperty("webdriver.ie.driver","./browser/IEDriverServer.exe");
			@SuppressWarnings("unused")
			DesiredCapabilities ieCaps = DesiredCapabilities.internetExplorer();
			driver=new InternetExplorerDriver();
		}
		//Create a wait. All test and page classes use this wait.
		wait = new WebDriverWait(driver, timeout);
		
		//Maximize Window
		driver.manage().window().maximize();
	}
}
