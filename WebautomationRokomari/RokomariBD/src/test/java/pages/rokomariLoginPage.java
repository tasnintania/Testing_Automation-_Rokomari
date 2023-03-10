package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class rokomariLoginPage extends basepage {
	
	public String LOGIN_PAGE_URL = "https://www.rokomari.com/login";
	public By SIGNIN_BUTTON_FIELD = By.xpath("//a[normalize-space()='Sign in']");
	public By EMAIL_INPUT_FIELD = By.xpath("//input[@id='j_username']");
	public By PASSWORD_INPUT_FIELD = By.xpath("//input[@id='j_password']");
	public By SIGNIN_BUTTON = By.xpath("//button[normalize-space()='Sign In']");
	
	
	public void doLogin(String email, String password) {
		getdriver().get(LOGIN_PAGE_URL);
		writeTextOnElement(EMAIL_INPUT_FIELD, email);
		writeTextOnElement(PASSWORD_INPUT_FIELD, password);
	}
	
	public void clickLogin() {
		
		WebElement email = getElement(EMAIL_INPUT_FIELD);
		JavascriptExecutor js= (JavascriptExecutor)getdriver();
		js.executeScript("arguments[0].scrollIntoView()", email);
		clickOnElement(SIGNIN_BUTTON);	
	}

}
