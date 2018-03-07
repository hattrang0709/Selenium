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

public class TC_JOOMLA_ARTICLE_013_VerifyUserCanAddImageToArticleContent extends Action {

	HomePage home ;
	LoginPage login;
	Configure configure; 
	Logger Log = Logger.getLogger("TCLoginPage");
	ArticlePage article = new ArticlePage();
	ControlPanelPage control = new ControlPanelPage();
	ArticleNewPage page = new ArticleNewPage();
	
	
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
	  page.enterTitle(Constant.tc013Article.Title);
	  
	  Log.info("Step 8: Select an item from the 'Category' dropdown list");
	  page.selectCategoryInCategory(Constant.tc013Article.Category);
	    
	  Log.info("Step 9: Enter value on 'Article Text' text area");
	  page.enterAtArticleText(Constant.tc013Article.Content);
	  
	  Log.info("Step 10: Click on 'Image' button");
	  page.clickMenuTextArticle(Constant.tc013Article.Image);
	  
	  Log.info("Step 11: Select 'powered_by.pnj' image from the 'Image' dialog");
	  page.clickImage(Constant.tc014Article.NameImage);
	    
	  Log.info("Step 12: Click on 'Insert' button");
	  page.clickBtnInsert();
	  
	  Log.info("Step 13: Click on 'Save & Close' icon of the top right toolbar");
	  page.clickBtnSaveAndClose();
	  
	  Log.info(" Verify poit : the article is saved successfully");
	  verifyTrue(article.messageSaveSuccessDisplay());
	  verifyTrue(article.articleNameDisplay(Constant.tc013Article.Title));
  }
  
  @AfterMethod
  public void afterMethod() {
	 home.closeBrowser();
  }
  

}
