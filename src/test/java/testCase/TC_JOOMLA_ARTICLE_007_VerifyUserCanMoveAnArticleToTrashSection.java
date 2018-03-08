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

public class TC_JOOMLA_ARTICLE_007_VerifyUserCanMoveAnArticleToTrashSection extends Action {

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
	  page.enterTitle(Constant.tc007Article.Title);
	  
	  Log.info("Step 8: Select an item from the 'Category' dropdown list");
	  page.selectCategoryInCategory(Constant.tc007Article.Category);
	    
	  Log.info("Step 9: Select 'Published' item from 'Status' dropdown list");
	  page.selectItemStatus(Constant.tc007Article.StatusPublish);
	  
	  Log.info("Step 10: Enter value on 'Article Text' text area");
	  page.enterAtArticleText(Constant.tc007Article.Content);
	 
	  Log.info("Step 11: Click on 'Save & Close' icon of the top right toolbar");
	  page.clickBtnSaveAndClose();
	  
	  Log.info(" Verify point : Verify the article is saved successfully");
	  control.verifyTrue(article.messageSaveSuccessDisplay());
	  control.verifyTrue(article.articleNameDisplay(Constant.tc007Article.Title));
	  
	  Log.info("Step 13: Check on the recently added article's checkbox");
	  article.checkOnCheckBox(Constant.tc007Article.Title);
	  
	  Log.info("Step 13: Click on 'Trash' icon of the top right toolbar");
	  article.clickBtnTrash();
	  
	  Log.info(" Verify point : Verify the confirm message is displayed");
	  verifyTrue(article.isMessageArticleTrashDisplay());

	  Log.info("Step 15: Select 'Trash' item of 'Status' dropdown list");
	  article.selectFiliedOfSearchTools(Constant.tc007Article.Trash);
	  
	  Log.info(" Verify point : Verify the archived article is displayed on the table grid");
	  control.verifyTrue(article.articleNameDisplay(Constant.tc007Article.Title));
	 
  }
  
  @AfterMethod
  public void afterMethod() {
	home.closeBrowser();
  }
  

}

