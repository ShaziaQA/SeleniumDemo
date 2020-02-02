package com.tcs.gmail.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	
	
	public WebDriver driver;
	
	By account = By.xpath("//div[contains(text(),'Use another account')]");
	By email= By.cssSelector("[type='email']");
	By next = By.xpath("//span[@class='RveJvd snByac']");
	By password=By.cssSelector("[type='password']");
	By nextPassword = By.xpath("//span[contains(text(),'Next')]");
	
	
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	public WebElement getAccount() {
		return driver.findElement(account);
	}
	
	public WebElement getEmail() {
		return driver.findElement(email);
	}
	public WebElement getNext() {
		return driver.findElement(next);
	}
	public WebElement getPassword() {
		return driver.findElement(password);
	}
	public WebElement getNextPassword() {
		return driver.findElement(nextPassword);
	}
	
}
