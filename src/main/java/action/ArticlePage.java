package action;

import org.openqa.selenium.By;
import interfaces.Interfaces;
import common.Configure;
import common.Constant;

public class ArticlePage extends Action{
	ArticleNewPage page = new ArticleNewPage();
	
	/**
	 * read Element At Articles Page xml file
	 * @param Tag
	 * @param value
	 * @return
	 */
	public By readElementAtArticlesPage(String Tag, String ...value ) {
		return readElement("ArticlesPage", Tag, value);
	}
	
	/**
	 * click button New
	 */
	public void clickBtnNew() {
		click( readElementAtArticlesPage(Interfaces.ArticlesPage.btnNew));
	}
	
	/**
	 * click button search
	 */
	public void clickBtnSearch() {
		click( readElementAtArticlesPage(Interfaces.ArticlesPage.btnSearch));
	}
	
	/**
	 * click button clean to upload page
	 */
	public void clickBtnClear() {
		click( readElementAtArticlesPage(Interfaces.ArticlesPage.btnClear));
	}
	
	/**
	 * click button edit
	 */
	public void clickBtnEdit() {
		click( readElementAtArticlesPage(Interfaces.ArticlesPage.menuManageArticle,Interfaces.ArticlesPage.edit));
	}
	
	/**
	 * click button check-in
	 */
	public void clickBtnCheckin() {
		click( readElementAtArticlesPage(Interfaces.ArticlesPage.menuManageArticle,Interfaces.ArticlesPage.checkIn));
	}
	
	/**
	 * click at icon next 1 page
	 */
	public void clickIconNext() {
		click( readElementAtArticlesPage(Interfaces.ArticlesPage.iconNextPage));
	}
	
	/**
	 * click button Public 
	 */
	public void clickBtnNext() {
		click( readElementAtArticlesPage(Interfaces.ArticlesPage.menuManageArticle, Constant.tc003Article.btnPublish));
	}
	
	/**
	 * click button archive
	 */
	public void clickBtnArchive(){
		click( readElementAtArticlesPage(Interfaces.ArticlesPage.menuManageArticle, Constant.tc005Article.btnArchive));
	}
	
	/**
	 * click button trash
	 */
	public void clickBtnTrash(){
		click( readElementAtArticlesPage(Interfaces.ArticlesPage.menuManageArticle, Interfaces.ArticlesPage.Trash));
	}
	
	/**
	 * click checkbox all
	 */
	public void clickAll() {
		click ( readElementAtArticlesPage(Interfaces.ArticlesPage.checkboxAll));
	}
	
	/**
	 * click button unpublic 
	 */
	public void clickBtnUnpublic() {
		click( readElementAtArticlesPage(Interfaces.ArticlesPage.menuManageArticle, Interfaces.ArticlesPage.btnUnpublish));
	}
	
	/**
	 * click button public 
	 */
	public void clickBtnPublic() {
		click( readElementAtArticlesPage(Interfaces.ArticlesPage.menuManageArticle, Interfaces.ArticlesPage.btnPublish));
	}
	
	/**
	 * click button help 
	 */
	public void clickBtnHelp() {
		click( readElementAtArticlesPage(Interfaces.ArticlesPage.menuManageArticle, Interfaces.ArticlesPage.btnHelp));
	}
	
	/**
	 * click button search tools
	 */
	public void clickBtnSearchTools() {
		click( readElementAtArticlesPage(Interfaces.ArticlesPage.btnSearchTools));
	}
	
	/**
	 * click select status 
	 */
	public void clickSelectStatus() {
		click( readElementAtArticlesPage(Interfaces.ArticlesPage.filedSelectOfSearchTools,Interfaces.ArticlesPage.status));
	}
	
	/**
	 * click choose filed at down list status
	 * @param Filed
	 */
	public void clickFiled(String Filed) {
		click( readElementAtArticlesPage(Interfaces.ArticlesPage.filedOfSelectStatus, Filed));
	}
	
	/**
	 * click on header id 
	 */
	public void clickHeaderID() {
		click( readElementAtArticlesPage(Interfaces.ArticlesPage.txtHeaderID));
	}
	
	/**
	 * enter textbox search
	 * @param Name
	 */
	public void enterTextBoxSearch(String Name) {
		sendkey( readElementAtArticlesPage(Interfaces.ArticlesPage.txbSearch), Name);
	}
	
	/**
	 *  check Message Success Display
	 * @return
	 */
	public boolean messageSaveSuccessDisplay() {
		String text = getText(readElementAtArticlesPage(Interfaces.ArticlesPage.txtMessage));
		if(text.equals(Interfaces.ArticlesPage.messageSave)) {
			return true;
		}
		else
			return false;
	}
	
	/**
	 * diplay message article Checkin success 
	 */
	public boolean isMessageArticleCheckInDisplay() {
		String text = getText( readElementAtArticlesPage(Interfaces.ArticlesPage.txtMessage));
		if(text.equals(Interfaces.ArticlesPage.messageArticleCheckIn)) {
			return true;
		}
		else
			return false;
	}
	
	/**
	 * diplay message article public success
	 * @return
	 */
	public boolean isMessageArticlePublicDisplay() {
		String text = getText( readElementAtArticlesPage(Interfaces.ArticlesPage.txtMessage));
		if(text.equals(Interfaces.ArticlesPage.messageArticlePublish)) {
			return true;
		}
		else
			return false;
	}
	
	/**
	 * diplay message article inpublic success
	 * @return
	 */
	public boolean isMessageArticleUnPublicDisplay() {
		String text = getText( readElementAtArticlesPage(Interfaces.ArticlesPage.txtMessage));
		if(text.equals(Interfaces.ArticlesPage.messageArticleUnpublish)) {
			return true;
		}
		else
			return false;
	}
	
	/**
	 * diplay message article unfeatured 
	 * @return
	 */
	public boolean isMessageArticleUnFeaturedDisplay() {
		return isElementDisplay(readElementAtArticlesPage(Interfaces.ArticlesPage.txtMessageSuccess, Interfaces.ArticlesPage.messageArticleUnFeatured));
	}
	
	/**
	 * diplay message article featured 
	 * @return
	 */
	public boolean isMessageArticleFeaturedDisplay() {
		String text = getText( readElementAtArticlesPage(Interfaces.ArticlesPage.txtMessage));
		if(text.equals(Interfaces.ArticlesPage.messageArticleFeatured)) {
			return true;
		}
		else
			return false;
	}
	
	/**
	 * diplay message article archived success
	 * @return
	 */
	public boolean isMessageArticleArchivedDisplay() {
		String text = getText( readElementAtArticlesPage(Interfaces.ArticlesPage.txtMessage));
		if(text.equals(Interfaces.ArticlesPage.messageArticleArchved)) {
			return true;
		}
		else
			return false;
	}
	
	/**
	 * diplay message article Trash success
	 * @return
	 */
	public boolean isMessageArticleTrashDisplay() {
		String text = getText( readElementAtArticlesPage(Interfaces.ArticlesPage.txtMessage));
		if(text.equals(Interfaces.ArticlesPage.messageArticleTrash)) {
			return true;
		}
		else
			return false;
	}
	
	/**
	 * check article with name display 
	 * @param Title
	 * @return
	 */
	public boolean articleNameDisplay(String Title) {
		enterTextBoxSearch(Title);
		clickBtnSearch();	
		boolean result =isElementDisplay(readElementAtArticlesPage(Interfaces.ArticlesPage.txtNameDislays, Title));
		enterTextBoxSearch("");
		clickBtnSearch();
		return result;
	}
	
	/**
	 * check article name display
	 * @param Title
	 * @return
	 */
	public boolean isArticleNameDisplay(String Title) {
		return isElementDisplay(readElementAtArticlesPage(Interfaces.ArticlesPage.txtNameDislays, Title));
	}
	
	/**
	 * check on at check box with title
	 * @param Title
	 */
	public void checkOnCheckBox(String Title) {
		while(true) {
			if(isElementDisplay(readElementAtArticlesPage(Interfaces.ArticlesPage.txtNameDislays, Title))) {
				click( readElementAtArticlesPage(Interfaces.ArticlesPage.txbCheckbox, Title));
				break;
			}
			if(!isElementDisplay(readElementAtArticlesPage(Interfaces.ArticlesPage.iconNextPage))) break;
			clickIconNext();
		}
	}
	
	/**
	 * check on at check box with title
	 * @param Title
	 */
	public void checkAtCheckBox(String Title) {
		while(true) {
			enterTextBoxSearch(Title);
			clickBtnSearch();	
			if(isElementDisplay(readElementAtArticlesPage(Interfaces.ArticlesPage.txtNameDislays, Title))) {
				focus( readElementAtArticlesPage(Interfaces.ArticlesPage.txbCheckbox, Title));
				click( readElementAtArticlesPage(Interfaces.ArticlesPage.txbCheckbox, Title));
				break;
			}
			if(!isElementDisplay(readElementAtArticlesPage(Interfaces.ArticlesPage.iconNextPage))) break;
			clickIconNext();
		}
	}
	
	/**
	 * delete with all in a page
	 */
	public void allDelete() {
		clickAll();
		clickBtnTrash();
	}
	
	/**
	 * display icon lock 
	 * @return
	 */
	public boolean isIconLockDisplay(String Title) {
		return isElementDisplay(readElementAtArticlesPage(Interfaces.ArticlesPage.iconLock, Title));
	}
	
	public boolean checkIconLockNoDisplay(String Title) {
		boolean a = isElementDisplay(readElementAtArticlesPage(Interfaces.ArticlesPage.iconLock, Title));
		if(a==true)
			return false;
		else
			return true;
	}
	
	/**
	 * display icon pulish
	 * @param Title
	 * @return
	 */
	public boolean isPublicIconDisplay(String Title) {
		return isElementDisplay(readElementAtArticlesPage(Interfaces.ArticlesPage.iconPublish,Title));
	}
	/**
	 * display icon unpublished
	 * @param Title
	 * @return
	 */
	public boolean isUnPublicIconDisplay(String Title) {
		return isElementDisplay(readElementAtArticlesPage(Interfaces.ArticlesPage.iconUnpublish,Title));
	}
	/**
	 * check popup with title display 
	 * @return
	 */
	public boolean isHelpScreenDisplay() {
		toPopUp();
		boolean r=  Configure.driver.getTitle().contains("Joomla! Help Screens");
		switchBack() ;
		return r;
	}
	
	
	/**
	 * click button search tools and select filed from down list of status
	 * @param Filed
	 */
	public void selectFiliedOfSearchTools(String Filed) {
		clickBtnSearchTools();
		clickSelectStatus();
		clickFiled(Filed);
	}
	
	/**
	 * select filed in search Tools 
	 * @param Filed
	 * @param Value
	 */
	public void selectFiledOfSearchTools(String Filed, String Value) {
		click( readElementAtArticlesPage(Interfaces.ArticlesPage.filterEnterFiledSearchTools, Filed));
		click( readElementAtArticlesPage(Interfaces.ArticlesPage.filterFiledDownList, Value));
	}
	
	/**
	 * select sattus in search Tools 
	 * @param Filed
	 * @param Value
	 */
	public void selectStatusOfSearchTools(String Filed, String Value) {
		clickBtnSearchTools();
		click( readElementAtArticlesPage(Interfaces.ArticlesPage.filterSelectStatusOfSearchTools, Filed));
		click( readElementAtArticlesPage(Interfaces.ArticlesPage.filterFiledDownList, Value));
	}
	
	/**
	 * click at number display
	 */
	public void clickTextBoxNumberDisplay() {
		isElementDisplay(readElementAtArticlesPage(Interfaces.ArticlesPage.numberDisplayInpage));
		click( readElementAtArticlesPage(Interfaces.ArticlesPage.numberDisplayInpage));
	}
	
	/**
	 * choose number article in page
	 * @param Value
	 */
	public void clickNumberDisplay(String Value) {
		click( readElementAtArticlesPage(Interfaces.ArticlesPage.chooseNumberDislpay,Value));
	}
	
	/**
	 * choose all article in page
	 */
	public void clickAllDisplay() {
		clickNumberDisplay(Interfaces.ArticlesPage.All);
	}
	
	/**
	 * count 
	 * @param Path
	 * @return
	 */
	public int count(By Path) {
		int numberRow = Configure.driver.findElements(Path).size();
		return numberRow;
	}
	
	/**
	 * check icon public in row
	 * @param row
	 * @param Icon
	 * @return
	 */
	public boolean isIconPublishInRow(int row, String Icon) {
		return isElementDisplay(readElementAtArticlesPage(Interfaces.ArticlesPage.checkIconPublish, ""+row, Icon));
	}
	
	/**
	 * check name category in row 
	 * @param row
	 * @param Catogory
	 * @return
	 */
	public boolean isNameCategoryInRow(int row, String Catogory ) {
		return isElementDisplay(readElementAtArticlesPage(Interfaces.ArticlesPage.checkNameCategory, ""+row, Catogory ));
	}
	
	/**
	 * check name access in row
	 * @param row
	 * @param Access
	 * @return
	 */
	public boolean isNameAccessInRow(int row, String Access) {
		return isElementDisplay(readElementAtArticlesPage(Interfaces.ArticlesPage.checkNameAccess, ""+row, Access));
	}
	
	/**
	 * check article have name and access 
	 * @param Title
	 * @param Access
	 * @return
	 */
	public boolean isFiledNameAccess(String Title, String Access) {
		return isElementDisplay(readElementAtArticlesPage(Interfaces.ArticlesPage.filedAccessArticle, Title, Access));
	}
	
	
	/**
	 * check name author in row
	 * @param row
	 * @param Author
	 * @return
	 */
	public boolean isNameAuthorInRow(int row, String Author) {
		return isElementDisplay(readElementAtArticlesPage(Interfaces.ArticlesPage.checkNameAuthor, ""+row, Author));
	}
	
	/**
	 * ckeck btn search tools
	 * @param Icon
	 * @param Catogory
	 * @param Access
	 * @param Author
	 * @return
	 */
	public boolean checkbtnSearchTools(String Icon, String Catogory,String Access ,String Author) {
		clickTextBoxNumberDisplay();
		clickAllDisplay();
		boolean result = true;
		for(int row=1;row<=count( readElementAtArticlesPage(Interfaces.ArticlesPage.numberRow));)
		{
			result =   isIconPublishInRow(row, Icon )
					&& isNameCategoryInRow(row, Catogory) 
					&& isNameAccessInRow(row, Access) 
					&& isNameAuthorInRow(row, Author);
			if(result== true)
				row++;
			else
				break;
		}
		return result;
	}
	
	/**
	 * check id create
	 * @return
	 */
	public boolean checkIDIncreate() {
		clickTextBoxNumberDisplay();
		clickAllDisplay();
		boolean result = true;
		int a=0,b=0;
		for(int i = 1; i<=count(readElementAtArticlesPage(Interfaces.ArticlesPage.numberRow))-1;){
			int count = Integer.parseInt(read(readElementAtArticlesPage(Interfaces.ArticlesPage.idArticle, ""+i)));
			if(a==0)
				a = count;
			else a=b;
				b = count +1;
				if(b-a>=1) {
					result= true;
					i++;
				}
				else {
					result = false;
					break;
				}
		}
		return result;
	}
	
	/**
	 * check id create
	 * @return
	 */
	public boolean checkIDCreate() {
		clickTextBoxNumberDisplay();
		clickAllDisplay();
		boolean result = true;
		for(int i = 1; i<=count(readElementAtArticlesPage(Interfaces.ArticlesPage.numberRow))-1;)
		{
			int count = Integer.parseInt(read(readElementAtArticlesPage(Interfaces.ArticlesPage.idArticle, ""+i)));
			int a = count;
			int b = count -1;
			if(a-b>=1){
				result= true;
				i++;
			}
			else {
				result = false;
				break;
				}
		
		}
		return result;
	}
	
	/**
	 * select number article display on page
	 * @param Value
	 */
	public void selectNumberArticle( String Value) {
		clickTextBoxNumberDisplay();
		clickNumberDisplay(Value);
	}
	
	/**
	 * check number article in the page
	 * @param Number
	 * @return
	 */
	public boolean checkNumberArticle(String Number) {
		int number= Integer.parseInt(Number);
		boolean result = false;
		while(isElementDisplay(readElementAtArticlesPage(Interfaces.ArticlesPage.iconNextPage)) == true) {
			int num = count(readElementAtArticlesPage(Interfaces.ArticlesPage.numberRow));
			if(num == number) {
				result = true;
				click(readElementAtArticlesPage(Interfaces.ArticlesPage.iconNextPage));
			}
			if(num<number ) {
				result= true;
				break;
			}
		}	
		return result;
	}
	
	/**
	 * check all article display on page
	 * @return
	 */
	public boolean checkAllArticle() {
		if(isElementDisplay(readElementAtArticlesPage(Interfaces.ArticlesPage.iconNextPage))==false)
			return true;
		else
			return false;
	}

	/**
	 * click icon ordering
	 */
	public void clickIconOrdering() {
		click(readElementAtArticlesPage(Interfaces.ArticlesPage.iconOrdering));
	}
	
	/**
	 * click icon down ordering after click icon ordering
	 */
	public void clickIconDownOrdering() {
		click(readElementAtArticlesPage(Interfaces.ArticlesPage.iconOrdering));
	}
	
	/**
	 * click icon publish on status
	 * @param Title
	 */
	public void clickIconPulish(String Title) {
		click( readElementAtArticlesPage(Interfaces.ArticlesPage.iconPublish, Title));
	}
	
	/**
	 * click icon unpublish on status
	 * @param Title
	 */
	public void clickIconUnPulish(String Title) {
		click( readElementAtArticlesPage(Interfaces.ArticlesPage.iconUnpublish, Title));
	}
	
	/**
	 * click icon featured on status
	 * @param Title
	 */
	public void clickIconFeature(String Title) {
		click( readElementAtArticlesPage(Interfaces.ArticlesPage.iconFearuted, Title));
	}
	
	/**
	 * click icon unfeatured on status
	 * @param Title
	 */
	public void clickIconUnFeature(String Title) {
		click( readElementAtArticlesPage(Interfaces.ArticlesPage.iconUnFearute, Title));
	}
	
	/**
	 * check is icon feature display
	 * @param Title
	 * @return
	 */
	public boolean isIconFeaturedDisplay(String Title) {
		return isElementDisplay(readElementAtArticlesPage(Interfaces.ArticlesPage.iconFearuted, Title));
	}
	
	/**
	 * check is icon unfeature display
	 * @param Title
	 * @return
	 */
	public boolean isIconUnFeaturedDisplay(String Title) {
		return isElementDisplay(readElementAtArticlesPage(Interfaces.ArticlesPage.iconUnFearute, Title));
	}
	
	/**
	 * check position changed
	 * @param Title1
	 * @param Title2
	 * @return
	 */
	public boolean checkChangePosition(String Title1, String Title2) {
		clickTextBoxNumberDisplay();
		clickAllDisplay();
		int a = count( readElementAtArticlesPage(Interfaces.ArticlesPage.position, Title1))+1 ;
		int b = count( readElementAtArticlesPage(Interfaces.ArticlesPage.position, Title2))+1 ;
		if(a<b) {
			return true;
		}
		else
			return false;
	}
}
