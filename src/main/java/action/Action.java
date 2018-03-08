package action;


import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Set;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import common.Configure;

public class Action extends Configure {
public WebElement e;
	
	/**
	 * find element
	 * @param Path
	 */
	public void findElement(By Path) {
		Configure.waitPageLoad(30);
		Configure.waitElementDisplay(10);
		Configure.waitCondition(10, ExpectedConditions.elementToBeClickable(Path));;
		e = Configure.driver.findElement(Path);
		if(!Configure.browser.equals("chrome")) {
			new Actions(Configure.driver).moveToElement(e).perform();
			Configure.waitCondition(10, ExpectedConditions.elementToBeClickable(Path));
		}
	}
	
	/**
	 * scroll up head page
	 */
	public void scrollUpPage() {
		JavascriptExecutor js = (JavascriptExecutor) Configure.driver;
		js.executeScript("window.scrollBy(0,-1000)");
	}
	
	/**
	 * scroll down page
	 */
	public void scrollDownPage() {
		JavascriptExecutor js = (JavascriptExecutor) Configure.driver;
		js.executeScript("window.scrollBy(0,1000)");
	}
	
	/**
	 * click button have path address 
	 * @param path
	 */
	public void click(By Path) {
		findElement(Path);
		try {
			e.click();
		}
		catch (Exception ee) {
			findElement(Path);
			scrollElement();
			focus(Path);
			e.click();
			// TODO: handle exception
		}
	}
	
	/**
	 * focus element
	 * @param Path
	 */
	public void focus(By Path) {
		findElement(Path);
		new Actions(Configure.driver).moveToElement(e).perform();
	}
	
	/**
	 * sendkeys field by name with value
	 * @param path
	 * @param value
	 */
	public void sendkey(By Path,String value) {
		findElement(Path);
		e.clear();
		e.sendKeys(value);
	} 
	
	/**
	 * sendkeys path with key 
	 * @param Path
	 * @param value
	 */
	public void sendkey(By Path,Keys value) {
		findElement(Path);
		e.clear();
		e.sendKeys(value);
	} 
	/**
	 * close browser
	 */
	public void close() {
		Configure.driver.close();
	}
	
	/**
	 * read field follow name
	 * @param field
	 * @return
	 */
	public String read(By Path){
		Configure.waitElementDisplay(10);
		e = Configure.driver.findElement(Path);
		return e.getText();
	}
	
	/**
	 * check element is display ?
	 * @param path
	 * @return
	 */
	public boolean isElementDisplay(By Path) {
		try {
			findElement(Path);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	/**
	 * verify that condition true 
	 * @param condition
	 * @return
	 */
	public boolean verifyTrue(boolean condition) {
		try {
			Assert.assertTrue(condition);
			return true;
		}catch (Exception e) {
			//sleepPage();
			return false;
		}
	}
	
	/**
	 * verify that condition false
	 * @param condition
	 * @return
	 */
	public boolean verifyFalse(boolean condition) {
		try {
			Assert.assertFalse(condition);
			return true;
		}catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	} 
	
	/**
	 * Scroll to element
	 */
	public void scrollElement() {
		((JavascriptExecutor) Configure.driver).executeScript("arguments[0].scrollIntoView();", e);
	}
	
	/**
	 * sleep at page
	 */
	public void sleepPage(int Number) {
		try {
			Thread.sleep(Number);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * switch to iframe with location
	 * @param location
	 */
	public void switchToFrame(By location) {
		e=Configure.driver.findElement(location);
		Configure.driver.switchTo().frame(e);
		
	}
	
	/**
	 * switch to iframe with index
	 * @param index
	 */
	public void switchToFrame(int index) {
		Configure.driver.switchTo().frame(index);
	}

	/**
	 * switch to iframe with name
	 * @param name
	 */
	public void switchToFrame(String name) {
		Configure.driver.switchTo().frame(name);
	}
	
	/**
	 * switch back driver after switch iframe
	 */
	public void switchBack() {
		Configure.driver.switchTo().defaultContent();
	}
	
	
	/**
	 * read element
	 * @param Location
	 * @param name
	 * @param var
	 * @return
	 */
	public By readElement(String Location,String name, String... var) {
		try {
			Document elementFile=readXmlFile("src/main/java/interfaces/"+Location+".xml");
			
			XPathFactory xPathFactory = XPathFactory.newInstance();
			XPath xpath = xPathFactory.newXPath();
			XPathExpression expr = xpath.compile("//Element[@name=\"" + name + "\"]");
			Element nNode = (Element) expr.evaluate(elementFile, XPathConstants.NODE);
			
			String content = nNode.getElementsByTagName("value").item(0).getTextContent();
			String type = nNode.getElementsByTagName("type").item(0).getTextContent();
			//String by = nNode.getElementsByTagName("By").item(0).getTextContent();
			for (int i = 0; i < var.length; i++) {
				content = content.replace("{" + i + "}", var[i]);
			}
	
			Class<?> classBy = Class.forName("org.openqa.selenium.By");
			Method method = classBy.getMethod(type, String.class);
			Object o = method.invoke(null, content);
			return (By) o;
			
		}catch (Exception e) {
			// TODO: handle exception
			return null;
		}
		
	}
	/**
	 *moved to page to popup
	 */
	public void toPopUp() {
		String subWindowHandler = null;
		Set<String> handles = Configure.driver.getWindowHandles(); // get all window handles
		Iterator<String> iterator = handles.iterator();
		while (iterator.hasNext()){
		    subWindowHandler = iterator.next();
		}
		Configure.driver.switchTo().window(subWindowHandler);
		Configure.waitPageLoad(30);
		try {
			Thread.sleep(3);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * get strong color
	 * @param Path
	 * @return
	 */
	public String getColor(By Path) {
		findElement(Path);
		return e.getCssValue("background-color");
	}
	
	/**
	 * 
	 * get string Link from css
	 * @param Path
	 * @return
	 */
	public String getLink(By Path) {
		e = Configure.driver.findElement(Path);
		return e.getAttribute("href");
	}
	
	/**
	 * get String text
	 * @param Path
	 * @return
	 */
	public String getText(By Path) {
		e = Configure.driver.findElement(Path);
		return e.getText();
	}
}
