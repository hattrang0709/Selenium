package common;

import java.io.File;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.w3c.dom.Document;

//Read file config for test
public class Configure  {

	public static WebDriver driver;
	public static WebDriverWait wait;
	public static int timeOutElement;
	public static int timeOutPageLoad;
	public static String url;
	public static String browser;
	public static String timeout;
	
	/**
	 * Read xml File
	 * @param Path
	 * @return file
	 */
	public Document readXmlFile(String Path) {
		try {
			File configFile=new File(Path);
			DocumentBuilderFactory dFactory=DocumentBuilderFactory.newInstance();//create a object 'DocumentBuilderFactory' from mothod its
			DocumentBuilder dBuilder=dFactory.newDocumentBuilder();
			return dBuilder.parse(configFile);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	/**
	 * Read tag content in config file
	 * @param tag
	 * @return
	 */
	public String readConfig(String tag) {
		Document configFile=readXmlFile("src/main/java/interfaces/HomePage.xml");
		return configFile.getElementsByTagName(tag).item(0).getTextContent();
	}
	
	//Read browser from xml file
	public String readBrowser() {
		switch(readConfig("browser")) {
			case "chrome":return "chrome";
			case "ie":return "ie";
			case "firefox":return "firefox";
			default: return "wrong enter browser";
		}
	}
	
	/**
	 *  Read timeOut from xml file
	 * @return
	 */
	public int readTimeOut() {
		try {
			return Integer.parseInt(readConfig("timeout"));
		}
		catch (Exception e) {
			return 30;
		}
	}
	
	/**
	 * set up before run test
	 * @param browser
	 * @param timeout
	 * @param url
	 */
	public void setUp(String browser,String timeout , String url) {
		Driver dri=new Driver();
		Configure.browser = browser;
		Configure.timeout = timeout;
		dri.browser(browser,Integer.parseInt(timeout));
		Configure.driver=dri.driver;
		Configure.wait=dri.wait;
		Configure.url = url;
	}	
	
	/**
	 * Wait pageload with timeout default
	 * @param timeOut
	 */
	public static void waitPageLoad(int timeOut) {
		Configure.driver.manage().timeouts().pageLoadTimeout(timeOut, TimeUnit.SECONDS);
		ExpectedCondition<Boolean> pageLoadCondition = new
                ExpectedCondition<Boolean>() {
                    public Boolean apply(WebDriver driver) {
                        return ((JavascriptExecutor)driver).executeScript("return document.readyState").equals("complete");
                    }
                };
        wait.until(pageLoadCondition);
        wait.withTimeout(timeOutPageLoad,TimeUnit.SECONDS);
	}		
		
	/**
	 * Wait pageload with param timeout
	 */
	public static void waitPageLoad() {
		Configure.driver.manage().timeouts().pageLoadTimeout(timeOutElement, TimeUnit.SECONDS);
		
	}			
		
	/**
	 * Wait element display with timeout default
	 */	
	public static void waitElementDisplay() {
		Configure.driver.manage().timeouts().implicitlyWait(timeOutElement, TimeUnit.SECONDS);
	}	
		
	/**
	 * Wait element display with param timeout
	 * @param timeOut
	 */
	public static void waitElementDisplay(int timeOut) {
		Configure.driver.manage().timeouts().implicitlyWait(timeOut, TimeUnit.SECONDS);
	}	
		
	/**
	 * Wait with condition and timeout
	 * @param timeOut
	 * @param condition
	 */
	@SuppressWarnings("unchecked")
	public static void waitCondition(int timeOut,Object condition) {
		Configure.wait.withTimeout(timeOut, TimeUnit.SECONDS);
		Configure.wait.until( (Function<? super WebDriver, ExpectedConditions>) condition);
	} 	 
		
}
