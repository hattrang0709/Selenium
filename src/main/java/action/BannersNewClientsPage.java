package action;

import org.openqa.selenium.By;

import interfaces.Interfaces;

public class BannersNewClientsPage extends Action{

	/**
	 * read Element At Articles Page xml file
	 * @param Tag
	 * @param value
	 * @return
	 */
	public By readElementAtNewClientsPage(String Tag, String ...value ) {
		return readElement("BannersNewClientsPage", Tag, value);
	} 
	
	/**
	 * click button save and close
	 */
	public void clickBtnSaveAndClose() {
		click(readElementAtNewClientsPage(Interfaces.BannersNewClientsPage.bttMenuTop, Interfaces.BannersNewClientsPage.bttSaveAndClose));
	}
	
	
	
	/**
	 * enter client name
	 * @param Name
	 */
	public void enterClientName(String Name) {
		sendkey(readElementAtNewClientsPage(Interfaces.BannersNewClientsPage.txbClientsName), Name);
	}
	
	/**
	 * enter contact name
	 * @param Name
	 */
	public void enterContactName(String Name) {
		sendkey(readElementAtNewClientsPage(Interfaces.BannersNewClientsPage.txbContactName), Name);
	}
	
	/**
	 * enter contact email
	 * @param Name
	 */
	public void enterContactEmail(String Email) {
		sendkey(readElementAtNewClientsPage(Interfaces.BannersNewClientsPage.txbContactEmail), Email);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
