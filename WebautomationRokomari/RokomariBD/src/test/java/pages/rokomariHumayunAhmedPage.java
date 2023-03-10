package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class rokomariHumayunAhmedPage extends basepage {
	
	public By CHECKBOX_1 = By.xpath("//label[contains(text(),'সমকালীন উপন্যাস')]");
	public By CHECKBOX_2 = By.xpath("//label[contains(text(),'রচনা সংকলন ও সমগ্র')]");
	public By POP_UP_MESSAGE = By.xpath("//button[@class='close']");
	public By NEXT_BUTTON = By.xpath("//a[normalize-space()='Next']");

	
	public void clickPopUpMessage() {	
	        clickOnElement(POP_UP_MESSAGE);		
	}

	public void clickChecktwoBox() {
		
		clickOnElement(CHECKBOX_1);
		clickOnElement(CHECKBOX_2);
	}	
	
	
	
	public void clickNextPage() {
		
		WebElement nextPage = getElement(NEXT_BUTTON);
		JavascriptExecutor js= (JavascriptExecutor)getdriver();
		js.executeScript("arguments[0].scrollIntoView()", nextPage);
		WebDriverWait wait= new WebDriverWait(getdriver(), Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(NEXT_BUTTON));
		nextPage.click();
	}	

}
