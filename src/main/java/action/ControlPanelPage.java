package action;

import org.openqa.selenium.By;

import common.Configure;
import interfaces.Interfaces;

public class ControlPanelPage extends Action{
	
	/**
	 * read element at Control Panel Page xml file
	 * @param Tag
	 * @param value
	 * @return
	 */
	public By readElementAtControlPanelPage(String Tag, String ...value ) {
		return readElement("ControlPanelPage", Tag, value);
	}
	
	/**
	 *  click Content menu
	 */
	public void clickContent() {
		click(readElementAtControlPanelPage(Interfaces.ControlPanelPage.menuControlPanel,Interfaces.ControlPanelPage.contentMenu));
	}
	
	/**
	 *  click Components at tools bar
	 */
	public void clickComponents() {
		click(readElementAtControlPanelPage(Interfaces.ControlPanelPage.menuControlPanel, Interfaces.ControlPanelPage.components));
	}
	
	/**
	 *  click Articles in Components
	 */
	public void clickArticles() {
		click(readElementAtControlPanelPage(Interfaces.ControlPanelPage.dlMenu,Interfaces.ControlPanelPage.article));
	}
	
	/**
	 *  click Banner at banners
	 */
	public void clickAddBanners() {
		click(readElementAtControlPanelPage(Interfaces.ControlPanelPage.addBanner));
	}
	
	/**
	 * select a 1 menu and choose a filed at down list of its
	 * @param s
	 */
	public void navigateToMenu(String s) {// 2 level
		String[] a= s.split("->");
		String s1=a[0];
		String s2=a[1];
		//focus(readElementAtControlPanelPage(Interfaces.ControlPanelPage.menuControlPanel,s1)));
		click(readElementAtControlPanelPage(Interfaces.ControlPanelPage.menuControlPanel,s1));
		//focus(readElementAtControlPanelPage(Interfaces.ControlPanelPage.dlMenu,s2)));
		click(readElementAtControlPanelPage(Interfaces.ControlPanelPage.dlMenu,s2));	
	}
	
	/**
	 * select a 1 menu and choose a filed at down list of its
	 * @param s
	 */
	public void navigateToMenuPage(String s) {// 3 level
		if(Configure.browser.equals("ie")) {
			String[] a= s.split("->");
			String s1=a[0];
			String s2=a[1];
			String s3=a[2];
			click(readElementAtControlPanelPage(Interfaces.ControlPanelPage.menuControlPanel,s1));
			focus(readElementAtControlPanelPage(Interfaces.ControlPanelPage.dlMenu,s2));
			Configure.driver.get(getLink(readElementAtControlPanelPage(Interfaces.ControlPanelPage.menuLeft1,s3)));
		}
		else {
			String[] a= s.split("->");
			String s1=a[0];
			String s2=a[1];
	    	String s3=a[2];
			click(readElementAtControlPanelPage(Interfaces.ControlPanelPage.menuControlPanel,s1));
			sleepPage(1000);
			focus(readElementAtControlPanelPage(Interfaces.ControlPanelPage.dlMenu,s2));
			sleepPage(1000);
			click(readElementAtControlPanelPage(Interfaces.ControlPanelPage.menuLeft,s3));
		}
	}
}
