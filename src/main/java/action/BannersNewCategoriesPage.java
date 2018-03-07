package action;

import org.openqa.selenium.By;

import interfaces.Interfaces;

public class BannersNewCategoriesPage extends Action{
 
	/**
	 * read Element At Articles Page xml file
	 * @param Tag
	 * @param value
	 * @return
	 */
	public By readElementAtNewCategoriesPage(String Tag, String ...value ) {
		return readElement("BannersNewCategoriesPage", Tag, value);
	}
	
	/**
	 * click button save and close
	 */
	public void clickBtnSaveAndClose() {
		click(readElementAtNewCategoriesPage(Interfaces.BannersNewCategoriesPage.bttMenuTop, Interfaces.BannersNewCategoriesPage.bttSaveAndClose));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void enterTitleCategories(String Title) {
		sendkey(readElementAtNewCategoriesPage(Interfaces.BannersNewCategoriesPage.txbTitleCategories), Title);
	}
}
