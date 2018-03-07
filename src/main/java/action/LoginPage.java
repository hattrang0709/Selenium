package action;

import org.openqa.selenium.By;
import interfaces.Interfaces;

public class LoginPage extends Action  {
	
	/**
	 * read Element At LoginPage xml files
	 * @param Tag
	 * @param value
	 * @return
	 */
	public By readElementAtLoginPage(String Tag, String ...value ) {
		return readElement("LoginPage", Tag, value);
	}
	
	/**
	 * enter filer username of login page
	 * @param UserName
	 */
	public void enterUserLogin(String UserName) {
		sendkey(readElementAtLoginPage(Interfaces.LoginPage.txbIdUser), UserName);
	}
	
	/**
	 * enter filer pass of login page
	 * @param Pass
	 */
	public void enterPassLogin(String Pass) {
		sendkey(readElementAtLoginPage(Interfaces.LoginPage.txbPass), Pass);
	}
	
	public void loginAccount(String UserName, String Pass) {
		enterUserLogin(UserName);
		enterPassLogin(Pass);
	}
	
	/**)
	 * click button longin of login page
	 */
	public void clickBtnLogin() {
		click(readElementAtLoginPage( Interfaces.LoginPage.btnLogin));
	}
	

	/**
	 *  click button at login page with xpath address
	 * @param UserName
	 * @param Pass
	 */
	public void loginPage(String UserName, String Pass ) {
		enterUserLogin(UserName);
		enterPassLogin(Pass);
		clickBtnLogin();
	}
	
	/**
	 *  check text box EnployeeID display
	 * @return
	 */
	public boolean isEmloyeeIDTextBoxDisplay() {
		return isElementDisplay(readElementAtLoginPage(Interfaces.LoginPage.txbIdUser));
	}
	
	/**
	 *  check text box pass display
	 * @return
	 */
	public boolean isPassTextBoxDiasplay() {
		return isElementDisplay(readElementAtLoginPage(Interfaces.LoginPage.txbPass));
	}
	
	/**
	 *  check button Login display
	 * @return
	 */
	public boolean isLoginButtonDisplay() {
		return isElementDisplay(readElementAtLoginPage(Interfaces.LoginPage.btnLogin));
	}
	
	/**
	 *  check user profile display
	 * @return
	 */
	public boolean isUserProfileDisplay() {
		return isElementDisplay(readElementAtLoginPage( Interfaces.LoginPage.btnUserProfile));
	}
	
	/**
	 *  check logout button display
	 * @return
	 */
	public boolean isLogoutButtonDisplay() {
		return isElementDisplay(readElementAtLoginPage(Interfaces.LoginPage.btnLogout));
	}
	
}
