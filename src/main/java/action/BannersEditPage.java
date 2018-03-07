package action;

import org.openqa.selenium.By;

import interfaces.Interfaces;

public class BannersEditPage  extends Action {
 
	public By readElementAtBannersEditPage(String Tag, String ...value ) {
		return readElement("BannersEditPage", Tag, value);
	}
	
	/**
	 * click button save and copy
	 */
	public void clickBtnSaveAsCopy() {
		click(readElementAtBannersEditPage(Interfaces.BannersEditPage.menuTopPage,Interfaces.BannersEditPage.bttSaveAsCopy));
	}
	
	/**
	 * click button close
	 */
	public void clickBtnClose() {
		click(readElementAtBannersEditPage(Interfaces.BannersEditPage.menuTopPage,Interfaces.BannersEditPage.bttClose));
	}
	
	
	/**
	 * check message saved successfully
	 */
	public boolean checkMessageSavedSuccessfully() {
		return isElementDisplay(readElementAtBannersEditPage(Interfaces.BannersEditPage.txtMessageDisplay,Interfaces.BannersEditPage.messageSavedBanners));
	}
	
}
