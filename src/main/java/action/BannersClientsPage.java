package action;

import org.openqa.selenium.By;

import common.Configure;
import interfaces.Interfaces;

public class BannersClientsPage extends Action{

	/**
	 * read Element At Articles Page xml file
	 * @param Tag
	 * @param value
	 * @return
	 */
	public By readElementAtBannersClientsPage(String Tag, String ...value ) {
		return readElement("BannersClientsPage", Tag, value);
	}
	
	/**
	 * click button new
	 */
	public void clickBtnNew() {
		click(readElementAtBannersClientsPage(Interfaces.BannersClientsPage.menuTopPage, Interfaces.BannersClientsPage.btnNew));
	}
	
	/**
	 * click icon search
	 */
	public void clickIconSearch() {
		click(readElementAtBannersClientsPage(Interfaces.BannersClientsPage.iconSearch));
	}
	
	/**
	 * click text box number display
	 */
	public void clickTxbNumberDisplay() {
		click(readElementAtBannersClientsPage(Interfaces.BannersClientsPage.txbNumberDisplay));
	}
	
	/**
	 * check client screen display
	 */
	public boolean isClientScreenDisplay() {
		boolean r=  Configure.driver.getTitle().contains("Banners: Client");
		switchBack() ;
		return r;
	}
	
	/**
	 * enter text box search
	 * @param Name
	 */
	public void enterTxbSearch(String Name) {
		sendkey(readElementAtBannersClientsPage(Interfaces.BannersClientsPage.txbSearch), Name);
	}
	
	/**
	 * select number display
	 * @param Number
	 */
	public void selectNumberDisplay(String Number) {
		click(readElementAtBannersClientsPage(Interfaces.BannersClientsPage.dlNumberDisplay, Number));
	}
	
	/**
	 * check clients created
	 * @param Name
	 * @return
	 */
	public boolean checkClientsCreated(String Name) {
		enterTxbSearch(Name);
		clickIconSearch();
		return isElementDisplay(readElementAtBannersClientsPage(Interfaces.BannersClientsPage.txtNameClientDisplay, Name));
	}
	
	/**
	 * check message 
	 * @return
	 */
	public boolean checkMessageSavedSuccessfully() {
		String text = getText(readElementAtBannersClientsPage(Interfaces.BannersClientsPage.txtMessage));
		if(text.equals(Interfaces.BannersClientsPage.messageSavedClients)) {
			return true;
		}
		else
			return false;
	}
}
