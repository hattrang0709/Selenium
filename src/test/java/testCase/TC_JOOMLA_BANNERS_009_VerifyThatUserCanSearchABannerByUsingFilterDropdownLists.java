package testCase;

import org.testng.annotations.Test;
import action.Action;
import action.BannersCategoriesPage;
import action.BannersClientsPage;
import action.BannersNewCategoriesPage;
import action.BannersNewClientsPage;
import action.BannersNewPage;
import action.BannersPage;
import action.ControlPanelPage;
import action.HomePage;
import action.LoginPage;
import common.Configure;
import common.Constant;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import java.util.logging.Logger;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;

public class TC_JOOMLA_BANNERS_009_VerifyThatUserCanSearchABannerByUsingFilterDropdownLists extends Action {

	HomePage home ;
	LoginPage login;
	Configure configure; 
	Logger Log = Logger.getLogger("TCLoginPage");
	ControlPanelPage control = new ControlPanelPage();
	BannersClientsPage clients = new BannersClientsPage();
	BannersNewClientsPage newClients = new BannersNewClientsPage();
	BannersCategoriesPage categories = new BannersCategoriesPage();
	BannersNewCategoriesPage newCategories = new BannersNewCategoriesPage();
	BannersNewPage newBanners = new BannersNewPage();
	BannersPage banner = new BannersPage();
	
	
  @BeforeMethod
  @Parameters({"browser","timeout","url"})
  public void beforeMethod(String browser, String timeout, String url) {
	  configure = new Configure();
	  Reporter.log("Browser Opened");
	  configure.setUp(browser,timeout,url);
	  login = new LoginPage();
	  home = new HomePage();
	  //Configure.waitPageLoad(Integer.parseInt(timeOutElement));
  }
  
  @Test
  public void Login() {
	  Log.info("Step 1: Navigate to the URL to Joomla Login page");
	  home.goHomePage(Configure.url);
	  
	  Log.info("Step 2: Login with User Name  and password ");
	  login.loginAccount(Constant.loginData.UserName, Constant.loginData.pass);
	  
	  Log.info("Step 3: Click on 'Log in' button");
	  login.clickBtnLogin();
	  
	  Log.info("Step 4: Select Components -> Banners -> Clients");
	  control.navigateToMenuPage(Constant.pageName.goToClients);
	  
	  Log.info("Step 5: Click 'New' button in the right top corner");
	  clients.clickBtnNew();
	  
	  Log.info("Step 6: Enter valid Client Name to Client Name textbox");
	  newClients.enterClientName(Constant.tc009Banners.ClientsName);
	  
	  Log.info("Step 7: Enter valid Contact Name to Contact Name textbox");
	  newClients.enterContactName(Constant.tc009Banners.ContactName);
	  
	  Log.info("Step 8: Enter valid Contact Email to Contact Email textbox");
	  newClients.enterContactEmail(Constant.tc009Banners.ContactEmail);
	    
	  Log.info("Step 9: Click 'Save & Close' button");
	  newClients.clickBtnSaveAndClose();
	  
	  Log.info(" Verify poit : A message : 'Client successfully saved' shows and new client is created");
	  verifyTrue(clients.checkMessageSavedSuccessfully());
	  verifyTrue(clients.checkClientsCreated(Constant.tc009Banners.ClientsName));
	  
	  Log.info("Step 11: Select Components -> Banners -> Categories");
	  control.navigateToMenuPage(Constant.pageName.goToCategories);
	  
	  Log.info("Step 12: Click 'New' button in the right top corner");
	  categories.clickBtnNew();
	  
	  Log.info("Step 13: Enter valid Category Name to Name textbox");
	  newCategories.enterTitleCategories(Constant.tc009Banners.CategoryName);
	  
	  Log.info("Step 14: Click 'Save & Close' button");
	  newCategories.clickBtnSaveAndClose();
	  
	  Log.info(" Verify poit : A message : 'Client successfully saved' shows and new client is created");
	  verifyTrue(categories.checkMessageSavedSuccessfully());
	  verifyTrue(categories.checkCategoriesCreated(Constant.tc009Banners.CategoryName));
	  
	  Log.info("Step 16: Select Components -> Banners -> Banners");
	  control.navigateToMenuPage(Constant.pageName.goToBanners);
	  
	  Log.info("Step 17: Click 'New' button in the right top corner");
	  banner.clickBtnNew();
	  
	  Log.info("Step 18: Enter valid Name to Name textbox");
	  newBanners.enterTxbNameBanners(Constant.tc009Banners.BannersName);
	  
	  Log.info("Step 19: Select a Category in Category dropdown list");
	  newBanners.selectFiledOfDownListCategory(Constant.tc009Banners.CategoryName);
	  
	  Log.info("Step 20: Select a Client in Client dropdown list");
	  newBanners.clickTab(Constant.tc002Banners.tab);
	  newBanners.selectFiledOfDownListClient(Constant.tc009Banners.ClientsName);
	  
	  Log.info("Step 21: Click 'Save & Close' button");
	  newBanners.clickBtnSaveAndClose();
	  
	  Log.info(" Verify poit : A message : 'Banners successfully saved' shows and new Banners is created");
	  verifyTrue(banner.checkMessageSavedSuccessfully());
	  verifyTrue(banner.checkBannersCreated(Constant.tc009Banners.BannersName));
	  
	  Log.info("Step 23: Select Client that banner belong to in 'Client' dropdown list");
	  banner.selectFiledOfDownListClient(Constant.tc009Banners.ClientsName);
	  
	  Log.info("Step 24: Select Category that banner belong to in 'Category' dropdown list");
	  banner.selectFiledOfDownListCategory(Constant.tc009Banners.CategoryName);
	  
	  Log.info(" Verify poit : Recently created banner displays");
	  verifyTrue(banner.checkBannersCreated(Constant.tc009Banners.BannersName));
  
  }
  
  @AfterMethod
  public void afterMethod() {
	 home.closeBrowser();
  }
 
}
