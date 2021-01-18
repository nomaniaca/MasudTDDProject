package Myntra.PageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyntraUpdateAccountInfoElements {

	@FindBy(xpath = "//span[@class='myntraweb-sprite desktop-iconUser sprites-headerUser']")
	public WebElement profile;

	@FindBy(xpath = "//div[contains(text(),'Edit Profile')]")
	public WebElement editProfile;

	@FindBy(xpath = "//form[@class='profileEdit-smartForm']/div/div[2]")
	public WebElement email;

	@FindBy(xpath = "//*[@id=\"mountRoot\"]/div/div/div[3]/div/form/div/div[7]/button")
	public WebElement savedetails;

}
