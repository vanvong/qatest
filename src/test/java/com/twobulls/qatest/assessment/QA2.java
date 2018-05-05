package com.twobulls.qatest.assessment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class QA2 {
	
	private WebDriver driver;
	
	@Test
	public void testLogin() {
		driver.get(Constant.MagentoElement.BASE_URL);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		WebElement myAccountURL = driver.findElement(By.partialLinkText(Constant.MagentoElement.MY_ACCOUNT_LINK_TEXT));
		myAccountURL.click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		WebElement txtEmail = driver.findElement(By.id(Constant.MagentoElement.EMAIL));
		WebElement txtPassword = driver.findElement(By.id(Constant.MagentoElement.PASSWORD_ID));
		WebElement btnLogin = driver.findElement(By.id(Constant.MagentoElement.LOGIN_ID));
		
		txtEmail.sendKeys(Constant.MagentoElement.EMAIL);
		txtPassword.sendKeys(Constant.MagentoElement.PASSWORD);
		btnLogin.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement errorMsg = driver.findElement(By.cssSelector(Constant.MagentoElement.ERROR_MESSAGE_CSS_SELECTOR));
		String errorMsgText = errorMsg.getText();
		Assert.assertEquals(errorMsgText, Constant.MagentoElement.LOGIN_OR_CREATE_ACCOUNT_TITLE);
	}
	
	@BeforeTest
	public void beforeTest() {
		System.setProperty(Constant.Config.WEBDRIVER_CHROME_DRIVER,Constant.Config.WEBDRIVER_CHROME_DRIVER_PATH);
		driver = new ChromeDriver();
	}
	
	@AfterTest
	public void afterTest() {
		driver.quit();
	}
}
