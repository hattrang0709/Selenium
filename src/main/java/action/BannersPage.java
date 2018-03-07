package action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import common.Configure;
import interfaces.Interfaces;

public class BannersPage extends Action {

	/**
	 * read Element At Articles Page xml file
	 * @param Tag
	 * @param value
	 * @return
	 */
	public By readElementAtBannersPage(String Tag, String ...value ) {
		return readElement("BannersPage", Tag, value);
	}
	
	/**
	 * click button new
	 */
	public void clickBtnNew() {
		click(readElementAtBannersPage(Interfaces.BannersPage.menuTopPage, Interfaces.BannersPage.btnNew));
	}
	
	/**
	 * click icon search
	 */
	public void clickIconSearch() {
		click(readElementAtBannersPage(Interfaces.BannersPage.iconSearch));
	}
	
	/**
	 * click text box dislay
	 */
	public void clickTxbNumberDisplay() {
		isElementDisplay(readElementAtBannersPage(Interfaces.BannersPage.txbNumberDisplay));
		click(readElementAtBannersPage(Interfaces.BannersPage.txbNumberDisplay));
	}
	
	/**
	 * click text box search
	 */
	public void clickTxbSearch() {
		click(readElementAtBannersPage(Interfaces.BannersPage.txbSearch));
	}
	
	/**
	 * click check box
	 * @param Name
	 */
	public void clickCheckBox(String Name) {
		click(readElementAtBannersPage(Interfaces.BannersPage.txbCheckbox, Name));
	}
	
	/**
	 * click icon status
	 * @param Name
	 * @param Icon
	 */
	public void clickIconStatus(String Name, String Icon) {
		click(readElementAtBannersPage(Interfaces.BannersPage.checkStatus, Name, Icon));
	}
	
	/**
	 * click button inpublish
	 */
	public void clickBtnUnpublish() {
		click(readElementAtBannersPage(Interfaces.BannersPage.menuTopPage,Interfaces.BannersPage.BtnUnpublish));
	}
	
	/**
	 * click button archite
	 */
	public void clickBtnArchite() {
		click(readElementAtBannersPage(Interfaces.BannersPage.menuTopPage,Interfaces.BannersPage.BtnArchive));
	}
	
	/**
	 * click button trash
	 */
	public void clickBtnTrash() {
		click(readElementAtBannersPage(Interfaces.BannersPage.menuTopPage,Interfaces.BannersPage.BtnTrash));
	}
	
	/**
	 * click button cancel
	 */
	public void clickBtnCancel() {
		click(readElementAtBannersPage(Interfaces.BannersPage.menuTopPage,Interfaces.BannersPage.BtnTrash));
	}
	
	/**
	 * click button search tools
	 */
	public void clickBtnSearchTools() {
		click(readElementAtBannersPage(Interfaces.BannersPage.btnSearchTool));
	}
	
	/**
	 * click button select status
	 */
	public void clickBtnSelectStatus() {
		click(readElementAtBannersPage(Interfaces.BannersPage.selectFiled, Interfaces.BannersPage.Status));
	}
	
	
	
	/**
	 * click button select client
	 */
	public void clickBtnSelectSClient() {
		click(readElementAtBannersPage(Interfaces.BannersPage.selectFiled, Interfaces.BannersPage.Client));
	}
	
	/**
	 * click button category
	 */
	public void clickBtnSelectCategory() {
		click(readElementAtBannersPage(Interfaces.BannersPage.selectFiled, Interfaces.BannersPage.Category));
	}
	
	/**
	 * click down list select status
	 * @param Filed
	 */
	public void clickDownListSelectStatus(String Filed) {
		click(readElementAtBannersPage(Interfaces.BannersPage.dlSelectStatus,Filed));
	}
	
	/**
	 * click down list select client
	 * @param Filed
	 */
	public void clickDownListSelectClient(String Filed) {
		click(readElementAtBannersPage(Interfaces.BannersPage.dlSelectClient,Filed));
	}
	
	/**
	 * click down list select category
	 * @param Filed
	 */
	public void clickDownListSelectCategory(String Filed) {
		click(readElementAtBannersPage(Interfaces.BannersPage.dlSelectCategory,Filed));
	}
	
	/**
	 * click button help
	 */
	public void clickBtnHelp() {
		click(readElementAtBannersPage(Interfaces.BannersPage.btnHelp));
	}
	
	/**
	 * click button clean
	 */
	public void clickBtnClean() {
		click(readElementAtBannersPage(Interfaces.BannersPage.btnClear));
	}
	
	/**
	 * click button check-in
	 */
	public void clickBtnCheckIn() {
		click(readElementAtBannersPage(Interfaces.BannersPage.menuTopPage,Interfaces.BannersPage.BtnCheckIn));
	}
	
	/**
	 * click text box number display
	 */
	public void clickTxbNumberDisplay(String Number) {
		click(readElementAtBannersPage(Interfaces.BannersPage.dlNumberDisplay, Number));
	}
	
	/**
	 * click the header ID
	 */
	public void clickHeaderID() {
		isElementDisplay(readElementAtBannersPage(Interfaces.BannersPage.txtHearderId));
		click(readElementAtBannersPage(Interfaces.BannersPage.txtHearderId));
	}
	
	/**
	 * click menu left Client
	 */
	public void clickMenuLeftClient() {
		click(readElementAtBannersPage(Interfaces.BannersPage.menuLeft,Interfaces.BannersPage.Client ));
	}
	
	
	/**
	 * enter text box search
	 * @param Name
	 */
	public void enterTxbSearch(String Name) {
		sendkey(readElementAtBannersPage(Interfaces.BannersPage.txbSearch), Name);
	}
	
	/**
	 * enter text box Number display
	 * @param Number
	 */
	public void enterTxbNumberDisplay(String Number) {
		sendkey(readElementAtBannersPage(Interfaces.BannersPage.txbInputNumberDisplay), Number);
		sendkey(readElementAtBannersPage(Interfaces.BannersPage.txbInputNumberDisplay), Keys.ENTER);
		System.out.println(4);
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
	 * select Txb number dislays
	 * @param Number
	 */
	public void selectTxbNumberDisplay(String Number) {
		clickTxbNumberDisplay();
		enterTxbNumberDisplay(Number);
	}
	
	/**
	 * select all number display
	 */
	public void selectAllNumberDisplay() {
		enterTxbNumberDisplay(Interfaces.BannersPage.NumberAll);
	}
	
	/**
	 * select filed of down list status
	 * @param Filed
	 */
	public void selectFiledOfDownListStatus(String Filed) {
		clickBtnSearchTools();
		clickBtnSelectStatus();
		clickDownListSelectStatus(Filed);
	}
	
	/**
	 * select filed of down list client
	 * @param Filed
	 */
	public void selectFiledOfDownListClient(String Filed) {
		clickBtnClean();
		clickBtnSearchTools();
		clickBtnSelectSClient();
		clickDownListSelectClient(Filed);
	}
	
	/**
	 * select filed of down list category
	 * @param Filed
	 */
	public void selectFiledOfDownListCategory(String Filed) {
		clickBtnSelectCategory();
		clickDownListSelectCategory(Filed);
	}
	
	/**
	 * select all text box number display
	 * @param Filed
	 */
	public void selectAllTxbNumberDisplay() {
		enterTxbNumberDisplay(Interfaces.BannersPage.NumberAll);
	}
	
	
	/**
	 * check banners created
	 * @param Name
	 * @return
	 */
	public boolean checkBannersCreated(String Name) {
		enterTxbSearch(Name);
		clickIconSearch();
		return isElementDisplay(readElementAtBannersPage(Interfaces.BannersPage.txtNameBannersDisplay, Name));
	}
	
	/**
	 * check banners replace
	 * @param Name1
	 * @param Name2
	 * @return
	 */
	public boolean checkBannersReplaced(String Name1, String Name2) {
		 boolean re1 = checkBannersCreated(Name1);
		 boolean re2 = checkBannersCreated(Name2);
		 if(re1 == true && re2 == true)
			 return true;
		 else
			 return false;
	}
	
	/**
	 * check icon status
	 * @param Name
	 * @param Icon
	 * @return
	 */
	public boolean checkIconStatus(String Name, String Icon) {
		return isElementDisplay(readElementAtBannersPage(Interfaces.BannersPage.checkStatus, Name, Icon));
	}
	
	/**
	 * check message saved successfully
	 * @return
	 */
	public boolean checkMessageSavedSuccessfully() {
		String text = getText(readElementAtBannersPage(Interfaces.BannersPage.txtMessage));
		if(text.equals(Interfaces.BannersPage.messageSavedBanners)) {
			return true;
		}
		else
			return false;
	}
	
	/**
	 * check message cahnged unpublish successfully
	 * @return
	 */
	public boolean checkMessageChangedUnpublishSuccessfully() {
		String text = getText(readElementAtBannersPage(Interfaces.BannersPage.txtMessage));
		if(text.equals(Interfaces.BannersPage.messageChangedUnpublish)) {
			return true;
		}
		else
			return false;
	}
	
	/**
	 * check message archited successfully
	 * @return
	 */
	public boolean checkMessageArchited() {
		String text = getText(readElementAtBannersPage(Interfaces.BannersPage.txtMessage));
		if(text.equals(Interfaces.BannersPage.messageArchited)) {
			return true;
		}
		else
			return false;
	}
	
	/**
	 * check message trashed successfully
	 * @return
	 */
	public boolean checkMessageTrashed() {
		String text = getText(readElementAtBannersPage(Interfaces.BannersPage.txtMessage));
		if(text.equals(Interfaces.BannersPage.messageTrashed)) {
			return true;
		}
		else
			return false;
	}
	
	/**
	 * check message Checked in successfully
	 * @return
	 */
	public boolean checkMessageCheckedIn() {
		String text = getText(readElementAtBannersPage(Interfaces.BannersPage.txtMessage));
		if(text.equals(Interfaces.BannersPage.messageCheckIn)) {
			return true;
		}
		else
			return false;
	}
	
	/**
	 * check banners created wwith 3 : name , actegory, client
	 * @param Name
	 * @param Category
	 * @param Client
	 * @return
	 */
	public boolean checkBannersCreated(String Name, String Category, String Client) {
		clickTxbSearch();
		enterTxbSearch(Name);
		clickIconSearch();
		boolean resulf = true;
		resulf = isElementDisplay(readElementAtBannersPage(Interfaces.BannersPage.checkNameBanners, Name)) &&
				 isElementDisplay(readElementAtBannersPage(Interfaces.BannersPage.checkCategory ,Name , Category)) &&
				 isElementDisplay(readElementAtBannersPage(Interfaces.BannersPage.checkCliend ,Name , Client));
	    return resulf;
	}
	
	/**
	 * check banners created with 3 : name , actegory, client, status
	 * @param Name
	 * @param Category
	 * @param Client
	 * @param Status
	 * @return
	 */
	public boolean checkBannersCreated(String Name, String Category, String Client , String Status) {
		clickTxbSearch();
		enterTxbSearch(Name);
		clickIconSearch();
		boolean resulf = true;
		resulf = isElementDisplay(readElementAtBannersPage(Interfaces.BannersPage.checkNameBanners, Name)) &&
				 isElementDisplay(readElementAtBannersPage(Interfaces.BannersPage.checkCategory ,Name , Category)) &&
				 isElementDisplay(readElementAtBannersPage(Interfaces.BannersPage.checkCliend ,Name , Client))&&
				 isElementDisplay(readElementAtBannersPage(Interfaces.BannersPage.checkStatus ,Name , Status));
	    return resulf;
	}
	
	/**
	 * check icon lock
	 * @param Name
	 * @return
	 */
	public boolean checkIconLock(String Name) {
		enterTxbSearch(Name);
		clickIconSearch();
		return isElementDisplay(readElementAtBannersPage(Interfaces.BannersPage.checkIconLock, Name));
	}
	
	/**
	 * check number banners at 1 page
	 * @param Number
	 * @return
	 */
	public boolean checkNumberBanners(String Number) {
		int num = count(readElementAtBannersPage(Interfaces.BannersPage.numberRow));
		int number= Integer.parseInt(Number);
		boolean result = true;
		if(num>number && isElementDisplay(readElementAtBannersPage(Interfaces.BannersPage.iconNextPage)) == false) {
			result=  false;
		}
		else {
			if(num == number && isElementDisplay(readElementAtBannersPage(Interfaces.BannersPage.iconNextPage))== true) {
				result= true;
			}
			if(num<number && isElementDisplay(readElementAtBannersPage(Interfaces.BannersPage.iconNextPage))== false)
				result= true;
		}	
		return result;
	}
	
	/**
	 * check Id banners increate
	 * @return
	 */
	public boolean checkIDIncreate() {
		clickTxbNumberDisplay();
		selectAllNumberDisplay();
		boolean result = true;
		int a=0,b=0;
		for(int i = 1; i<=count(readElementAtBannersPage(Interfaces.BannersPage.numberRow))-1;){
			int count = Integer.parseInt(read(readElementAtBannersPage(Interfaces.BannersPage.idBanners, ""+i)));
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
		clickTxbNumberDisplay();
		selectAllNumberDisplay();
		boolean result = true;
		int a=0, b=0;
		for(int i = 2; i<=count(readElementAtBannersPage(Interfaces.BannersPage.numberRow));)
		{
			int count = Integer.parseInt(read(readElementAtBannersPage(Interfaces.BannersPage.idBanners, ""+i)));
			a = count;
			b = count -1;
			if(a-b>=1) {
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
	 * check help sreen dislplay
	 * @return
	 */
	public boolean isHelpScreenDisplay() {
		toPopUp();
		boolean r=  Configure.driver.getTitle().contains("Joomla! Help Screens");
		switchBack() ;
		return r;
	}
}
