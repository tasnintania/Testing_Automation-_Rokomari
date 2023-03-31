package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class rokomariHumayunAhmedNextPage extends basepage {
	
	
	public By HOVER_BOOK = By.xpath("//div[@title='জীবনকৃষ্ণ মেমোরিয়াল হাইস্কুল হুমায়ূন আহমেদ']//div[contains(@class,'book-list-wrapper')]");
	public By ADD_TO_CART_BUTTON = By.xpath("//div[@title='জীবনকৃষ্ণ মেমোরিয়াল হাইস্কুল হুমায়ূন আহমেদ']//div[1]//div[2]//button[1]");
	public By CART_ICON = By.xpath("//a[@id='js-cart-menu']//*[name()='svg']");
	
	
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
