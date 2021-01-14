package Myntra.Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyntraSetUpDrivers {

	public static WebDriver chromeDriver;

	public static void myntraSetUpDrivers() {
		WebDriverManager.chromedriver().setup();
		chromeDriver = new ChromeDriver();
	}

	public static void quitChromeDriver() {
		chromeDriver.quit();
	}
}
