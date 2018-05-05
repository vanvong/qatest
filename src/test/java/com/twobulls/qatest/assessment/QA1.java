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

public class QA1 {
	
	private WebDriver driver;
	
	@Test
	public void testQAURL() {
		driver.get(Constant.GoogleElement.GOOGLE_URL);
		WebElement txtSearch =  driver.findElement(By.id(Constant.GoogleElement.SEARCH_ID));
		txtSearch.sendKeys("QA");
		txtSearch.submit();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		WebElement QALink = driver.findElement(By.partialLinkText(Constant.GoogleElement.QUALITY_ASSURANCE));
		QALink.click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		String actualURL = driver.getCurrentUrl();
		Assert.assertEquals(actualURL, Constant.GoogleElement.WIKI_QA_URL);
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
