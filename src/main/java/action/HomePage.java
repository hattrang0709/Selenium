package action;

import org.openqa.selenium.By;
import common.Configure;

public class HomePage extends Action {
	/**
	 * go to page follow url 
	 * @param url
	 */
	public void goHomePage (String url){
		Configure.waitPageLoad(10);
		Configure.driver.get(url);
    }
	
	/**
	 *  go to login page
	 * @param btnGoLoginPage
	 */
	public void goLoginPage(By btnGoLoginPage) {
		click(btnGoLoginPage);
	}
	
	/**
	 * go to register page
	 * @param btnGoRegisterPage
	 */
	public void goRegisterPage(By btnGoRegisterPage) {
		click(btnGoRegisterPage);
	}
	
	/**
	 *  out to page 
	 * @param btnLogoutPage
	 */
	public void goLogoutPage(By btnLogoutPage) {
		click(btnLogoutPage);
	}
	
	/**
	 *  close home page
	 */
	public void closeHomePage() {
		Configure.driver.close();
	}
	
	/**
	 * close browser
	 */
	public void closeBrowser() {
		Configure.driver.quit();
	}
	
	/**
	 * read element at home page xml
	 * @param Tag
	 * @param value
	 * @return
	 */
	public By readElementAtHomePage(String Tag, String ...value ) {
		return readElement("HomePage", Tag, value);
	}
}

