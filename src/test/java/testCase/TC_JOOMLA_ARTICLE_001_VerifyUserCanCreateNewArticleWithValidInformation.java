package testCase;

import org.testng.annotations.Test;
import action.Action;
import action.ArticleNewPage;
import action.ArticlePage;
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

public class TC_JOOMLA_ARTICLE_001_VerifyUserCanCreateNewArticleWithValidInformation extends Action {

	HomePage home ;
	LoginPage login;
	Configure configure; 
	Logger Log = Logger.getLogger("TCLoginPage");
	ArticlePage article = new ArticlePage();
	ControlPanelPage control = new ControlPanelPage();
	ArticleNewPage newArticle = new ArticleNewPage();
	
	
  @BeforeMethod
  @Parameters({"browser","timeout","url"})
  public void beforeMethod(String browser, String timeout, String url) {
	  configure = new Configure();
	  Reporter.log("Browser Opened");
	  configure.setUp(browser,timeout,url);
	  login = new LoginPage();
	  home = new HomePage();
  }
  
  @Test
  public void Login() {
	  Log.info("Step 1: Navigate to the URL to Joomla Login page");
	  home.goHomePage(Configure.url);
	  
	  Log.info("Step 2: Enter valid username into Username field");
	  login.enterUserLogin(Constant.loginData.UserName);
	  
	  Log.info("Step 3: Enter valid username into Password field");
	  login.enterPassLogin(Constant.loginData.pass);
	  
	  Log.info("Step 4: Click on 'Log in' button");
	  login.clickBtnLogin();
	  
	  Log.info("Step 5: Select Content->Articles");
	  control.navigateToMenu(Constant.pageName.goToArticle);
	  
	  Log.info("Step 6: Click on 'New' icon of the top right toolbar");
	  article.clickBtnNew();
	  
	  Log.info("Step 7: Enter a title on 'Title' text field");
	  newArticle.enterTitle(Constant.tc001Article.Title);
	  
	  Log.info("Step 8: Select an item from the 'Category' dropdown list");
	  newArticle.selectCategoryInCategory(Constant.tc001Article.Category);
	    
	  Log.info("Step 9: Enter value on 'Article Text' text area");
	  newArticle.enterAtArticleText(Constant.tc001Article.Content);
	  
	  Log.info("Step 10: Click on 'Save & Close' icon of the top right toolbar");
	  newArticle.clickBtnSaveAndClose();
	  
	  Log.info(" Verify point : The article is saved successfully");
	  verifyTrue(article.messageSaveSuccessDisplay());
	  verifyTrue(article.articleNameDisplay(Constant.tc001Article.Title));
  }
  
  @AfterMethod
  public void afterMethod() {
	 home.closeBrowser();
  }
  

}
