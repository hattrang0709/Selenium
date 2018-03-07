package action;

import org.openqa.selenium.By;

import common.Configure;
import interfaces.Interfaces;

public class BannersNewPage extends Action{
	/**
	 * read Element At Articles Page xml file
	 * @param Tag
	 * @param value
	 * @return
	 */
	public By readElementAtBannersNewPage(String Tag, String ...value ) {
		return readElement("BannersNewPage", Tag, value);
	}
	
	/**
	 * click category
	 */
	public void clickCategory() {
		click(readElementAtBannersNewPage(Interfaces.BannersNewPage.dlCategory));
	}
	
	/**
	 * click filed of category
	 * @param Filed
	 */
	public void clickFiledOfCategory(String Filed) {
		click(readElementAtBannersNewPage(Interfaces.BannersNewPage.filesDownListCategory,Filed));
	}
	
	/**
	 * click tab
	 * @param Tab
	 */
	public void clickTab(String Tab) {
		scrollUpPage();
		click(readElementAtBannersNewPage(Interfaces.BannersNewPage.tabOfNew,Tab));
	}
	
	/**
	 * click txb clients
	 */
	public void clickTxbClients() {
		click(readElementAtBannersNewPage(Interfaces.BannersNewPage.txbClients));
	}
	
	/**
	 * click filed clients
	 * @param Client
	 */
	public void clickFiledClients(String Client) {
		click(readElementAtBannersNewPage(Interfaces.BannersNewPage.filedsDownListClient, Client));
	}
	
	/**
	 * click button save and close
	 */
	public void clickBtnSaveAndClose() {
		click(readElementAtBannersNewPage(Interfaces.BannersNewPage.btnMenuTop, Interfaces.BannersNewPage.bttSaveAndClose));
	}
	
	/**
	 * click button save
	 */
	public void clickBtnSave() {
		click(readElementAtBannersNewPage(Interfaces.BannersNewPage.btnSave));
	}
	
	/**
	 * click button save and new
	 */
	public void clickBtnSaveAndNew() {
		click(readElementAtBannersNewPage(Interfaces.BannersNewPage.btnMenuTop, Interfaces.BannersNewPage.bttSaveAndNew));
	}
	
	/**
	 * click button Help
	 */
	public void clickBtnHelp() {
		click(readElementAtBannersNewPage(Interfaces.BannersNewPage.btnMenuTop, Interfaces.BannersNewPage.bttHelp));
	}
	
	/**
	 * click list box status
	 */
	public void clickListboxStatus() {
		click(readElementAtBannersNewPage(Interfaces.BannersNewPage.lbStatus ));
	}
	
	/**
	 * click filed status
	 */
	public void clickFiledStatus(String Status) {
		click(readElementAtBannersNewPage(Interfaces.BannersNewPage.filedsDownListStatus, Status));
	}
	
	
	/**
	 * enter Text box name Banners
	 * @param Name
	 */
	public void enterTxbNameBanners(String Name) {
		sendkey(readElementAtBannersNewPage(Interfaces.BannersNewPage.txtNameBanners), Name);
	}
	
	
	/**
	 * select filed of down list category 
	 * @param Filed
	 */
	public void selectFiledOfDownListCategory(String Filed) {
		clickCategory();
		clickFiledOfCategory(Filed);
	}
	
	/**
	 * select filed of down list clients
	 * @param Filed
	 */
	public void selectFiledOfDownListClient(String Clients) {
		clickTxbClients();
		clickFiledClients(Clients);
	}
	
	/**
	 * select filed of down list status
	 * @param Filed
	 */
	public void selectFiledOfDownListStatus(String Status) {
		clickListboxStatus();
		clickFiledStatus(Status);
		
	}
	
	
	/**
	 * check  message saved successfully
	 */
	public boolean checkMessageSavedSuccessfully() {
		String text = getText(readElementAtBannersNewPage(Interfaces.BannersNewPage.txtMessage));
		if(text.equals(Interfaces.BannersNewPage.messageSavedBanners)) {
			return true;
		}
		else
			return false;
	}
	
	/**
	 * check  message  not saved successfully
	 */
	public boolean checkMessageNotSavedSuccessfully() {
		String text = getText(readElementAtBannersNewPage(Interfaces.BannersNewPage.txtMessageNotSave));
		if(text.equals(Interfaces.BannersNewPage.txtNotSave)) {
			return true;
		}
		else
			return false;
	}
	
	/**
	 * check at banners new page
	 * @return
	 */
	public boolean checkAtBannersNewPage() {
		String s= Configure.driver.getTitle();
		if(s.equals("Banners: Edit - joomla - Administration"))
			return true;
		else
			return false;
	}
	
	/**
	 * check at color red at text box Name
	 * @return
	 */
	public boolean checkRedTxbName() {
		String color = getColor(readElementAtBannersNewPage(Interfaces.BannersNewPage.txtNameBanners));
		if(color.equals("rgba(242, 222, 222, 1)"))
			return true;
		else
			return false;
	}
	
	/**
	 * check new banners scress dislpay
	 * @return
	 */
	public boolean isNewBannersScreenDisplay() {
		boolean r=  Configure.driver.getTitle().contains("Banners: New");
		switchBack() ;
		return r;
	}
	
	/**
	 * check edit banners screen dislay
	 * @return
	 */
	public boolean isEditBannersScreenDisplay() {
		boolean r=  Configure.driver.getTitle().contains("Banners: Edit");
		switchBack() ;
		return r;
	}
	
	/**
	 * check help screen diplay
	 * @return
	 */
	public boolean isHelpScreenDisplay() {
		toPopUp();
		boolean r=  Configure.driver.getTitle().contains("Joomla! Help Screens");
		switchBack() ;
		return r;
	}
}
