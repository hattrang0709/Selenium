package testCase;

import org.testng.annotations.Test;
import action.Action;
import action.BannersCategoriesPage;
import action.BannersClientsPage;
import action.BannersEditPage;
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

public class TC_JOOMLA_BANNERS_017_VerifyThatUserCanAccessBannerClientsPageWhileBrowsingBannerPage extends Action {

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
	BannersEditPage editBanners = new BannersEditPage();
	
	
  
  @Parameters({"browser","timeout","url"})
  @BeforeMethod
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
	  
	  Log.info("Step 4: Select Components -> Banners -> Banners");
	  control.navigateToMenuPage(Constant.pageName.goToBanners);
	  
	  Log.info("Step 5: Click 'Clients' link in the left top ");
	  banner.clickMenuLeftClient();
	  
	  Log.info(" Verify point : 'Client' page displays");
	  verifyTrue(clients.isClientScreenDisplay());
	  
  }
  
  @AfterMethod
  public void afterMethod() {
	 home.closeBrowser();
  }
 
}
