package action;

import org.openqa.selenium.By;
import interfaces.Interfaces;

public class ArticleNewPage extends Action {
	
	/**
	 * read Element at Article New Page xml file
	 * @param Tag
	 * @param value
	 * @return
	 */
	public By readElementAtArticlesNewPage(String Tag, String ...value ) {
		return readElement("ArticlesNewPage", Tag, value);
	}
	
	/**
	 * enter title in the article new page
	 * @param Title
	 */
	public void enterTitle(String Title) {
		sendkey(readElementAtArticlesNewPage(Interfaces.ArticlesNewPage.txtTitle), Title);
	}
	
	/**
	 *  enter category in the article new page
	 * @param Category
	 */
	public void enterCategory(String Category) {
		sendkey(readElementAtArticlesNewPage(Interfaces.ArticlesNewPage.lbCategory), Category);
	}
	
	/**
	 * click at article text in the article new page
	 */
	public void clickArticleText() {
		switchToFrame(readElementAtArticlesNewPage(Interfaces.ArticlesNewPage.iframeTxbArticle));
		click(readElementAtArticlesNewPage(Interfaces.ArticlesNewPage.txtArticle));
		switchBack();
	}
	
	/**
	 * click button on menu text article
	 * @param Button
	 */
	public void clickMenuTextArticle(String Button) {
		click( readElementAtArticlesNewPage(Interfaces.ArticlesNewPage.menuTextArticle, Button));
	}
	
	/**
	 * click button save
	 */
	public void clickBtnSave() {
		click( readElementAtArticlesNewPage(Interfaces.ArticlesNewPage.btnSave));
	}
	
	/**
	 * click Access
	 */
	public void clickAccessArticle() {
		click( readElementAtArticlesNewPage(Interfaces.ArticlesNewPage.lbAccess));
	}
	
	/**
	 * select a filed at access down list
	 * @param Access
	 */
	public void selectFiledDownListAccess(String Access) {
		
		click( readElementAtArticlesNewPage(Interfaces.ArticlesNewPage.filedInDownListAccess, Access));
	}
	
	/**
	 * click access and select a filed at access down list
	 * @param Access
	 */
	public void selecAccesstDownList(String Access) {
		clickAccessArticle();
		selectFiledDownListAccess(Access);
	}
	
	/**
	 *  click at button save and close in the article new page
	 */
	public void clickBtnSaveAndClose() {
		click( readElementAtArticlesNewPage(Interfaces.ArticlesNewPage.menuNewArticle, Interfaces.ArticlesNewPage.btnSaveAndClose));
	}
	
	/**
	 * click at button save and new in the article new page
	 */
	public void clickBtnSaveAndNew() {
		click( readElementAtArticlesNewPage(Interfaces.ArticlesNewPage.menuNewArticle, Interfaces.ArticlesNewPage.btnSaveAndNew));
	}
	
	
	/**
	 * click at category text box in the article new page
	 */
	public void clickCategory() {
		click( readElementAtArticlesNewPage(Interfaces.ArticlesNewPage.lbCategory));
	}
	
	/**
	 * click button close 
	 */
	public void clickBtnClose() {
		click( readElementAtArticlesNewPage(Interfaces.ArticlesNewPage.menuNewArticle, Interfaces.ArticlesNewPage.btnClose));
	}
	
	/**
	 * Select Samr-data ai Category down list
	 * 
	 * @param Category
	 */
	public void selectCategory(String Category) {
		click( readElementAtArticlesNewPage(Interfaces.ArticlesNewPage.filedInDownListCateory,Category));
	}
	
	/**
	 * 
	 * seclect filed in category
	 * @param Category
	 */
	public void selectCategoryInCategory(String Category) {
		clickCategory();
		selectCategory(Category);
	}
	
	
	/**
	 * click select Status to seen down list Status
	 */
	public void clickStatusArticle() {
		click( readElementAtArticlesNewPage(Interfaces.ArticlesNewPage.lbStatus));
	}
	/**
	 * 
	 *click choose status wwith item 
	 * @param item
	 */
	public void clickChooseStatus(String item) {
		click( readElementAtArticlesNewPage(Interfaces.ArticlesNewPage.filedInDownListStatus, item));
	}
	
	/**
	 * select status and choose item
	 * @param item
	 */
	public void selectItemStatus(String item) {
		clickStatusArticle();
		clickChooseStatus(item);
		
	}
	
	/**
	 * enter at article text in the article new page
	 * @param Content
	 */
	public void enterArticleText(String Content) {
		switchToFrame( readElementAtArticlesNewPage(Interfaces.ArticlesNewPage.iframeTxbArticle));
		sendkey(readElementAtArticlesNewPage(Interfaces.ArticlesNewPage.txtArticle),Content);
		
		switchBack();
	}
	
	/**
	 * enter in article text at article new 
	 * @param Content
	 */
	public void enterAtArticleText(String Content) {
		clickArticleText();
		enterArticleText(Content);
		scrollUpPage();
	}
	
	/**
	 * diplay message Save Success
	 * @return
	 */
	public boolean messageSaveSuccessDisplay() {
		String text = getText( readElementAtArticlesNewPage(Interfaces.ArticlesNewPage.txtMassage));
		if(text.equals(Interfaces.ArticlesNewPage.txtMessageSave)) {
			return true;
		}
		else
			return false;
	}
	
	/**
	 * click image after click image button
	 * @param Name
	 */
	public void clickImage(String Name) {
		System.out.println(readElementAtArticlesNewPage(Interfaces.ArticlesNewPage.iframeImageName));
		focus(readElementAtArticlesNewPage(Interfaces.ArticlesNewPage.iframeImageName));
		click(readElementAtArticlesNewPage(Interfaces.ArticlesNewPage.iframeImageName));
		focus(readElementAtArticlesNewPage(Interfaces.ArticlesNewPage.iframeImageName));
		click(readElementAtArticlesNewPage(Interfaces.ArticlesNewPage.iframeImageName));
		switchToFrame(readElementAtArticlesNewPage(Interfaces.ArticlesNewPage.iframeImageName));
		
		System.out.println(readElementAtArticlesNewPage(Interfaces.ArticlesNewPage.iframeImageName2));
		focus(readElementAtArticlesNewPage(Interfaces.ArticlesNewPage.iframeImageName2));
		focus(readElementAtArticlesNewPage(Interfaces.ArticlesNewPage.iframeImageName2));
		switchToFrame(readElementAtArticlesNewPage(Interfaces.ArticlesNewPage.iframeImageName2));
		
		System.out.println(readElementAtArticlesNewPage(Interfaces.ArticlesNewPage.imageName, Name));
		click(readElementAtArticlesNewPage(Interfaces.ArticlesNewPage.imageName, Name));
		switchBack();
		scrollUpPage();
	}
	
//	public void imageInsert(String title) {
//		focus(readElement(Elements.ArticlesNewPage.ifImage));
//		click(readElement(Elements.ArticlesNewPage.ifImage));
//		focus(readElement(Elements.ArticlesNewPage.ifImage));
//		click(readElement(Elements.ArticlesNewPage.ifImage));
//		swithTo.frame(readElement(Elements.ArticlesNewPage.ifImage));
//		
//		swithTo.Default();
//		
//		focus(readElement(Elements.ArticlesNewPage.ifImage));
//		click(readElement(Elements.ArticlesNewPage.ifImage));
//		focus(readElement(Elements.ArticlesNewPage.ifImage));
//		click(readElement(Elements.ArticlesNewPage.ifImage));
//		swithTo.frame(readElement(Elements.ArticlesNewPage.ifImage));
//
//		
//		focus(readElement(Elements.ArticlesNewPage.fsUpload));
//		swithTo.frame(readElement(Elements.ArticlesNewPage.fsUpload));
//		
//		click(readElement(Elements.ArticlesNewPage.selectImage,title));
//		swithTo.Default();
//	}
	
	/**
	 * click button insert after click image
	 */
	public void clickBtnInsert() {
		focus( readElementAtArticlesNewPage(Interfaces.ArticlesNewPage.iframeImageName));
		switchToFrame( readElementAtArticlesNewPage(Interfaces.ArticlesNewPage.iframeImageName));
		
		focus( readElementAtArticlesNewPage(Interfaces.ArticlesNewPage.btnInsert));
		click( readElementAtArticlesNewPage(Interfaces.ArticlesNewPage.btnInsert));
		switchBack();
	}
	
}
