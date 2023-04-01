package pages;

import org.openqa.selenium.By;

public class rokomariCartPage extends basepage {
	
	public By PLACE_ORDER_BUTTON = By.xpath("//span[normalize-space()='Place Order']");
	
	
	
	public void clickPlaceOrderButton() {	
        clickOnElement(PLACE_ORDER_BUTTON);		
        
	}
	
}
