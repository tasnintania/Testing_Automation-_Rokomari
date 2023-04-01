package pages;

import java.io.ByteArrayInputStream;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.qameta.allure.Allure;
import utilities.DriverSetUp;

public class basepage extends DriverSetUp {
	
	public WebElement getElement(By locator) {
		return getdriver().findElement(locator);
	}
	
	public void clickOnElement(By locator) {
		getElement(locator).click();
	} 
	
	public void writeTextOnElement(By locator, String text) {
		getElement(locator).sendKeys(text);	
	}
	
	
	public void takeScreenShot(String name) {
		Allure.addAttachment(name, new ByteArrayInputStream(((TakesScreenshot)getdriver()).getScreenshotAs(OutputType.BYTES) ));
	}
	
	public List<WebElement> getVisibleElements(By locator) {
		WebDriverWait wait = new WebDriverWait(getdriver(), Duration.ofSeconds(20));
		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
		
	}

}
