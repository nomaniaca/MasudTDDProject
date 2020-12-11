package com.ups.pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UpsShippingPageElements {
	
	WebDriver driver = null;

	public UpsShippingPageElements(WebDriver driver) {
	this.driver = driver;
	}

	public WebElement cookieButton() {
	WebElement cookie = driver.findElement(By.className("close_btn_thick"));
	return cookie;
	}

	public WebElement shippingButton() {
	WebElement dropdown = driver.findElement(By.xpath("//a[@id='ups-menuLinks2']"));
	return dropdown;
	}

	public WebElement createShipment() {
	WebElement createShipment = driver.findElement(By.xpath("//*[@id=\"ups-menuPanel2\"]/div/div[1]/ul/li[1]/a"));
	return createShipment;
	}

	public WebElement name() {
	WebElement name = driver.findElement(By.xpath("//*[@id=\"origin-cac_companyOrName\"]"));
	return name;
	}

	public WebElement contactName() {
	WebElement contactName = driver.findElement(By.xpath("//*[@id=\"origin-cac_contactName\"]"));
	return contactName;
	}

	public WebElement address() {
	WebElement address = driver.findElement(By.xpath("//*[@id=\"origin-cac_singleLineAddress\"]"));
	return address;
	}

	public WebElement email() {
	WebElement email = driver.findElement(By.xpath("//*[@id=\"origin-cac_email\"]"));
	return email;
	}

	public WebElement phone() {
	WebElement phone = driver.findElement(By.xpath("//*[@id=\"origin-cac_phone\"]"));
	return phone;
	}

	public WebElement checkBox() {
	WebElement checkBox = driver.findElement(By.xpath(
	"//*[@id=\"ups-main\"]/div[9]/app/ng-component/div/div/div/div/ng-component/section/origin/agent-wrapper/section/div[2]/shared-field/div/div/label"));
	return checkBox;
	}

	public WebElement continueButton() {
	WebElement continueButton = driver.findElement(By.xpath("//*[@id=\"nbsBackForwardNavigationContinueButton\"]"));
	return continueButton;
	}

}
