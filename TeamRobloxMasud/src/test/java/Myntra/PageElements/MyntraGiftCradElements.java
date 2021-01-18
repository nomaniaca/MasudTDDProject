package Myntra.PageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyntraGiftCradElements {
	
	@FindBy(xpath = "//span[@class='myntraweb-sprite desktop-iconUser sprites-headerUser']")
	public WebElement profile;
	
	@FindBy(xpath = "//a[contains(text(),'Gift Cards')]")
	public WebElement giftCard;
	
	@FindBy(xpath = "//button[contains(text(),'SEND GIFT CARD')]")
	public WebElement sendGiftCardBtn;
	
	@FindBy(xpath = "//div[contains(text(),'Birthday')]")
	public WebElement BirthdayBtn;
	
	@FindBy(xpath = "//button[contains(text(),'NEXT')]")
	public WebElement NextBtn;

	@FindBy(xpath = "//input[@class='form-control mobileNumberInput']")
	public WebElement phonenumber;

	@FindBy(xpath = "//div[@class='submitBottomOption']")
	public WebElement continueBtn;

	@FindBy(xpath = "//*[@id=\"reactPageContent\"]/div/div[3]/span")
	public WebElement passwordBtn;

	@FindBy(xpath = "//input[@class='form-control has-feedback']")
	public WebElement password;

	@FindBy(xpath = "//button[contains(text(),'LOGIN')]")
	public WebElement LoginBtn;
	
	@FindBy(xpath = "//*[@id=\"mountRoot\"]/div/div/div/div[3]/div/div[1]/div[4]")   //div[@data-amount='3000']
	public WebElement Chooseamount;
	
	@FindBy(xpath = "//input[@id='email']")
	public WebElement email;
	
	@FindBy(xpath = "//input[@id='to']")
	public WebElement name;
	
	@FindBy(xpath = "//button[contains(text(),'Show Preview')]")
	public WebElement showPreview;
	
}
