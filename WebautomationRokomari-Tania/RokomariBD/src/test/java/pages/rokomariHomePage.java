package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class rokomariHomePage extends basepage {
	
	public String HOME_PAGE_URL = "https://www.rokomari.com";
	public By AUTHORS_FIELD = By.xpath("//a[@id='js--authors']");
	public By HUMAYUN_AHMED_FIELD = By.xpath("//a[contains(text(),'হুমায়ূন আহমেদ')]");
	public By POP_UP_MESSAGE = By.xpath("//div[@id='js--entry-popup']//i[@class='ion-close-round']");
	
	public void clickHomepage() {
		getdriver().get(HOME_PAGE_URL);

		
	}
	public void clickAuthorsfield() {
		Actions action = new Actions(getdriver());
		action.moveToElement(getElement(AUTHORS_FIELD)).build().perform();
		
	}
	
	public void clickHumayunAhmed() {
		Actions action = new Actions(getdriver());
		action.moveToElement(getElement(HUMAYUN_AHMED_FIELD)).build().perform();
		clickOnElement(HUMAYUN_AHMED_FIELD);
		
	}

}
