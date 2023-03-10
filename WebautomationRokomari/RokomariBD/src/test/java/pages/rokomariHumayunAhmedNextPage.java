package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class rokomariHumayunAhmedNextPage extends basepage {
	
	
	public String NEXT_PAGE_URL = "https://www.rokomari.com/book/author/1/humayun-ahmed?ref=mm_p0&page=2";
	public By HOVER_BOOK = By.xpath("//div[@title='লীলাবতী হুমায়ূন আহমেদ']//div[contains(@class,'book-list-wrapper')]");
	public By ADD_TO_CART_BUTTON = By.xpath("//div[@title='লীলাবতী হুমায়ূন আহমেদ']//div[1]//div[2]//button[1]");
	public By CART_ICON = By.xpath("//a[@id='js-cart-menu']//*[name()='svg']");
	public By POP_UP_MESSAGE = By.xpath("//div[@id='js--entry-popup']//i[@class='ion-close-round']");
	
	
	public void clickPopUpfield() {	
		getdriver().get(NEXT_PAGE_URL);
	    clickOnElement(POP_UP_MESSAGE);		
	}
	
	
	public void clickBookHover() {
		Actions action = new Actions(getdriver());
		action.moveToElement(getElement(HOVER_BOOK)).build().perform();
	}
	
	
	public void clickCartButton() {
		Actions action = new Actions(getdriver());
		action.moveToElement(getElement(ADD_TO_CART_BUTTON)).build().perform();
		clickOnElement(ADD_TO_CART_BUTTON);
	}
	
	
	public void clickCarticon() {	
        clickOnElement(CART_ICON);		
	}	

}
