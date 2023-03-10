package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class rokomariShippingPage extends basepage {
	
	public By PHONE_NUMBER_FIELD = By.xpath("//input[@id='phone-number']");
	public By SEND_OTP= By.xpath("//input[@id='send-otp']");


	public void doLogin(String phonenumber) {
		writeTextOnElement(PHONE_NUMBER_FIELD, phonenumber);
		clickOnElement(PHONE_NUMBER_FIELD);
	}
	
	public void sendOTP() {
		Actions action = new Actions(getdriver());
		action.moveToElement(getElement(SEND_OTP)).build().perform();
		clickOnElement(SEND_OTP);
	}

}
