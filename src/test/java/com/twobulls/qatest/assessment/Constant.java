package com.twobulls.qatest.assessment;

public abstract class Constant {
	
	/**
	 * Web driver configuration
	 * @author vanvong
	 *
	 */
	 public static class Config {
	  
		 public static final String WEBDRIVER_CHROME_DRIVER = "webdriver.chrome.driver";

		 public static final String WEBDRIVER_CHROME_DRIVER_PATH = "chromedriver";
	  
	 }
	 
	 /**
	  * Constant for Google elements
	  * @author vanvong
	  *
	  */
	 public static class GoogleElement {
		 
		 public static final String GOOGLE_URL = "https://www.google.com.au";
			
		 public static final String WIKI_QA_URL = "https://en.wikipedia.org/wiki/Quality_assurance";
	  
	     public static final String SEARCH_ID = "lst-ib";
	     
	     public static final String QUALITY_ASSURANCE = "Quality assurance - Wikipedia";
	 }
	 
	 /**
	  * Constant for Magento elements
	  * @author vanvong
	  *
	  */
	 public static class MagentoElement {
			
			public static final String BASE_URL = "http://enterprise-demo.user.magentotrial.com/";
			
			public static final String EMAIL = "test@pixafy.com";
			
			public static final String PASSWORD = "123456";
			
			public static final String LOGIN_OR_CREATE_ACCOUNT_TITLE = "Login or Create an Account";
			
			public static final String ERROR_MESSAGE_CSS_SELECTOR = ".page-title > h1:nth-child(1)";
			
			public static final String EMAIL_ID = "email";
			
			public static final String PASSWORD_ID = "pass";
			
			public static final String LOGIN_ID = "send2";
			
			public static final String MY_ACCOUNT_LINK_TEXT = "MY ACCOUNT";
	 }
  
}
