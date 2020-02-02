package com.tcs.gmail;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.tcs.gmail.PageObjects.LoginPage;

import Resources.Base;

public class HomePage extends Base {


	@Test
	public void basePage() throws IOException {
		driver=initialiseDriver();
	//	driver.get("https://www.gmail.com");
		String url=prop.getProperty("url");
				driver.get(url);
		
		LoginPage loginPage= new LoginPage(driver);
	//		loginPage.getAccount().click();
		loginPage.getEmail().sendKeys(prop.getProperty("username"));
		loginPage.getNext().click();
	//	driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver,20);
		WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
		loginPage.getPassword().sendKeys(prop.getProperty("password"));
		loginPage.getNextPassword().click();
		
		
		
		
		
		
		
		

	} 

}
