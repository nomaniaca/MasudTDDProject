package Myntra.PageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyntraWishlistElements {
	
	@FindBy(xpath="//a[@data-group='men']")
	public WebElement menMenu;

	@FindBy(xpath="//*[@id=\"desktop-header-cnt\"]")
	public WebElement tShirt;
	
	@FindBy(xpath="//*[@id=\"desktopSearchResults\"]/div[2]/section/ul/li[1]/div[3]/span")
	public WebElement wishlistBtn;
	
	@FindBy(xpath="//span[@class='myntraweb-sprite desktop-iconWishlist sprites-headerWishlist']")
	public WebElement wishlistIcon;
}
