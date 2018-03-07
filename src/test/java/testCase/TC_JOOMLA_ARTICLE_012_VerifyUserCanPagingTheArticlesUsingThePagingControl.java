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

public class TC_JOOMLA_ARTICLE_012_VerifyUserCanPagingTheArticlesUsingThePagingControl extends Action {

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
	  
	  Log.info("Step 6: Select '5' item of the 'Display' dropdown list at the footer section of the article table");
	  article.selectNumberArticle(Constant.tc012Article.Five);
	  
	  Log.info(" Verify poit : Verify the articles is sorted by ID in ascending order");
	  verifyTrue(article.checkNumberArticle(Constant.tc012Article.Five));
	  
	  Log.info("Step 6: Select 'All' item of the 'Display' dropdown list at the footer section of the article table");
	  article.selectNumberArticle(Constant.tc012Article.All);;
	  
	  Log.info(" Verify poit : the article is saved successfully");
	  verifyTrue(article.checkAllArticle());
  }
  
  @AfterMethod
  public void afterMethod() {
	 home.closeBrowser();
  }
  

}
