package com.ups.pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UpsTrackingPageElements {
	
	WebDriver driver;

	public UpsTrackingPageElements(WebDriver driver) {
	this.driver = driver;
	}

	public WebElement tracking() {
	WebElement tracking = driver.findElement(By.xpath("\"//*[@id=\\'ups-menuLinks1\\']\""));
	return tracking;
	}

	public WebElement trackPackage() {
	WebElement trackPackage = driver.findElement(By.xpath("//*[@id=\"ups-menuPanel1\"]/div/div[1]/ul/li[1]/a"));
	return trackPackage;
	}

	public WebElement trackBox() {
	WebElement trackNumber = driver.findElement(By.xpath("//*[@id=\"stApp_trackingNumber\"]"));
	return trackNumber;
	}

	public WebElement trackButton() {
	WebElement track = driver.findElement(By.id("stApp_btnTrack"));
	return track;
	}

	public WebElement tracErrorMsg() {
	WebElement error = driver.findElement(By.xpath("//*[@id=\"stApp_statusErrorText\"]"));
	return error;
	}

}
