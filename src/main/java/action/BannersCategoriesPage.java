package action;

import org.openqa.selenium.By;

import interfaces.Interfaces;

public class BannersCategoriesPage extends Action{

	/**
	 * read Element At Articles Page xml file
	 * @param Tag
	 * @param value
	 * @return
	 */
	public By readElementAtCategoriesPage(String Tag, String ...value ) {
		return readElement("BannersCategoriesPage", Tag, value);
	}
	
	/**
	 * click icon search
	 */
	public void clickIconSearch() {
		click(readElementAtCategoriesPage(Interfaces.BannersClientsPage.iconSearch));
	}
	/**
	 * click button new
	 */
	public void clickBtnNew() {
		click(readElementAtCategoriesPage(Interfaces.BannersCategoriesPage.btnMenuTop, Interfaces.BannersCategoriesPage.btnNew));
	}
	/**
	 * click text box number display
	 */
	public void clickTxbNumberDisplay() {
		click(readElementAtCategoriesPage(Interfaces.BannersClientsPage.txbNumberDisplay));
	}
	
	/**
	 * enter text box search
	 * @param Name
	 */
	public void enterTxtSearch(String Name) {
		sendkey(readElementAtCategoriesPage(Interfaces.BannersCategoriesPage.txbSearch), Name);
	}
	
	/**
	 * select text box number display 
	 * @param Number
	 */
	public void selectTxbNumberDisplay(String Number) {
		click(readElementAtCategoriesPage(Interfaces.BannersCategoriesPage.dlNumberDisplay, Number));
	}
	
	/**
	 * check categori created
	 * @param Name
	 * @return
	 */
	public boolean checkCategoriesCreated(String Name) {
		enterTxtSearch(Name);
		clickIconSearch();
		return isElementDisplay(readElementAtCategoriesPage(Interfaces.BannersCategoriesPage.txbTitleCategoriesDisplay, Name));
	}
	
	/**
	 * check message saved successdully
	 * @return
	 */
	public boolean checkMessageSavedSuccessfully() {
		String text = getText(readElementAtCategoriesPage(Interfaces.BannersCategoriesPage.txtMessage));
		if(text.equals(Interfaces.BannersCategoriesPage.messageSavedCategories)) {
			return true;
		}
		else
			return false;
	}
	
}
