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

public class TC_JOOMLA_ARTICLE_014_VerifyusercanChangeTheOrderOofArticlesUsingTheOrderingColumn extends Action {

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
	  page.enterTitle(Constant.tc014Article.Title);
	  
	  Log.info("Step 8: Select an item from the 'Category' dropdown list");
	  page.selectCategoryInCategory(Constant.tc014Article.Category);
	    
	  Log.info("Step 9: Enter value on 'Article Text' text area");
	  page.enterAtArticleText(Constant.tc014Article.Content);
	  
	  Log.info("Step 10: Click on 'Save & Close' icon of the top right toolbar");
	  page.clickBtnSaveAndClose();
	  
	  Log.info(" Verify point : the article is saved successfully");
	  verifyTrue(article.messageSaveSuccessDisplay());
	  verifyTrue(article.articleNameDisplay(Constant.tc014Article.Title));
	  
	  Log.info("Step 12: Select Content->Articles");
	  control.navigateToMenu(Constant.pageName.goToArticle);
	  
	  Log.info("Step 13: Click on 'New' icon of the top right toolbar");
	  article.clickBtnNew();
	  
	  Log.info("Step 14: Enter a title on 'Title' text field");
	  page.enterTitle(Constant.tc014Article.Title2);
	  
	  Log.info("Step 15: Select an item from the 'Category' dropdown list");
	  page.selectCategoryInCategory(Constant.tc014Article.Category);
	    
	  Log.info("Step 16: Enter value on 'Article Text' text area");
	  page.enterAtArticleText(Constant.tc014Article.Content);
	  
	  Log.info("Step 17: Click on 'Save & Close' icon of the top right toolbar");
	  page.clickBtnSaveAndClose();
	  
	  Log.info(" Verify point : the article is saved successfully");
	  verifyTrue(article.messageSaveSuccessDisplay());
	  verifyTrue(article.articleNameDisplay(Constant.tc014Article.Title2));
	  
	  Log.info("Step 19: Click on the Header link of Ordering column");
	  article.clickIconOrdering();
	  
	  Log.info("Step 20: Click on down arrow in Ordering column of the selected article");
	  article.clickIconDownOrdering();
	  
	  Log.info(" Verify point :Verify the first article changes its position with the second article");
	  verifyTrue(article.checkChangePosition(Constant.tc014Article.Title, Constant.tc014Article.Title2));
  }
  
  @AfterMethod
  public void afterMethod() {
	 home.closeBrowser();
  }
  

}
