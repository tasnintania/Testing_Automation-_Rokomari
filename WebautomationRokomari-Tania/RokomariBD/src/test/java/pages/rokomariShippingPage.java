package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class rokomariShippingPage extends basepage {
	
	public By ALTERNATIVE_PHONE_FIELD = By.xpath("//fieldset[@class='group']//input[@id='phone2']");
	public By COUNTRY_FIELD = By.xpath("//select[@id='js--country']");
	public By SELECT_BANGLADESH = By.	cssSelector("select[id='js--country'] option[value='1']");
	public By CITY_FIELD = By.xpath("//select[@id='js--city']");
	public By SELECT_DHAKA = By.	cssSelector("option[data-lang-eng='Dhaka']");
	public By AREA_FIELD = By.xpath("//select[@id='js--area']");
	public By SELECT_MIRPUR = By.	cssSelector("option[value='62']");
	public By ADDRESS_FIELD = By.xpath("//fieldset[@class='mb-0']//textarea[@id='address']");
	public By PAYMENT_METHOD = By.xpath("//label[@for='cod']");
	public By CHECK_ICON = By.xpath("//label[contains(text(),'এই শর্তগুলো মেনে অর্ডার প্রদান করছি।')]");
	
	
	
	public void fillInfo() throws InterruptedException {	
		
	    clickOnElement(ALTERNATIVE_PHONE_FIELD);	
	    writeTextOnElement(ALTERNATIVE_PHONE_FIELD, "01609583248");
	    
	    clickOnElement(COUNTRY_FIELD);	
	    clickOnElement(SELECT_BANGLADESH);	
	    
	    clickOnElement(CITY_FIELD);
	    clickOnElement(SELECT_DHAKA);
	    
	    clickOnElement(AREA_FIELD);	
	    clickOnElement(SELECT_MIRPUR);	
	    
	    clickOnElement(ADDRESS_FIELD);	
	    writeTextOnElement(ADDRESS_FIELD, "Road No-14, Block-D,Mirpur-6");

	    WebElement paymentMethodRadioButton = getElement(PAYMENT_METHOD);
	    JavascriptExecutor jsExecutor = (JavascriptExecutor) getdriver();
	    jsExecutor.executeScript("arguments[0].click();", paymentMethodRadioButton);
	    Thread.sleep(2000); 
	  
	    WebElement element = getElement(CHECK_ICON);
	    JavascriptExecutor executor = (JavascriptExecutor) getdriver();
	    executor.executeScript("arguments[0].click();", element);
	    Thread.sleep(2000); 
	}

}
