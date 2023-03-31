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
	public By POP_UP = By.xpath("//span[@aria-hidden='true']");
	public By NEXT_BUTTON = By.xpath("//a[normalize-space()='Next']");

	public void clickCheckBox1() throws InterruptedException {
	    WebElement checkbox1 = getElement(CHECKBOX_1);
	    JavascriptExecutor js= (JavascriptExecutor)getdriver();
	    js.executeScript("arguments[0].scrollIntoView()", checkbox1);
	    WebDriverWait wait = new WebDriverWait(getdriver(), Duration.ofSeconds(30));
	    wait.until(ExpectedConditions.elementToBeClickable(CHECKBOX_1));
	    js.executeScript("arguments[0].click();", checkbox1);
	    Thread.sleep(1000);
	}

	public void clickCheckBox2() throws InterruptedException {
	    WebElement checkbox2 = getElement(CHECKBOX_2);
	    JavascriptExecutor js= (JavascriptExecutor)getdriver();
	    js.executeScript("arguments[0].scrollIntoView()", checkbox2);
	    WebDriverWait wait = new WebDriverWait(getdriver(), Duration.ofSeconds(30));
	    wait.until(ExpectedConditions.elementToBeClickable(CHECKBOX_2));
	    js.executeScript("arguments[0].click();", checkbox2);
	    Thread.sleep(1000);
	}
	
	
	
	public void clickNextPage() throws InterruptedException {
		
		WebElement nextPage = getElement(NEXT_BUTTON);
		JavascriptExecutor js= (JavascriptExecutor)getdriver();
		js.executeScript("arguments[0].scrollIntoView()", nextPage);
		WebDriverWait wait= new WebDriverWait(getdriver(), Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(NEXT_BUTTON));
		Thread.sleep(2000);
		nextPage.click();
		
	}	

}
