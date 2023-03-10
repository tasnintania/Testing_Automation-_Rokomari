package testcases;

import org.testng.annotations.Test;

import pages.rokomariCartPage;
import pages.rokomariHomePage;
import pages.rokomariHumayunAhmedNextPage;
import pages.rokomariHumayunAhmedPage;
import pages.rokomariLoginPage;
import pages.rokomariShippingPage;
import utilities.DriverSetUp;

public class Testallpages extends DriverSetUp {
	
	rokomariLoginPage LoginPage = new rokomariLoginPage();
	rokomariHomePage HomePage = new rokomariHomePage() ;
	rokomariHumayunAhmedPage HumayunAhmedPage = new rokomariHumayunAhmedPage();
	rokomariHumayunAhmedNextPage HumayunAhmedNextPage = new rokomariHumayunAhmedNextPage();
	rokomariCartPage CartPage = new rokomariCartPage();
	rokomariShippingPage ShippingPage = new rokomariShippingPage();
	
	@Test
	 public void TestPages() {
		
//		LoginPage.doLogin("tania.cse281@gmail.com", "tania4675@8");
//		LoginPage.clickLogin();
		
		HomePage.clickPopUpmessage();;
		HomePage.clickAuthorsfield();
		HomePage.clickHumayunAhmed();
		HumayunAhmedPage.clickPopUpMessage();
		
//		HumayunAhmedPage.clickChecktwoBox();
//		HumayunAhmedPage.clickNextPage();
//		
//		HumayunAhmedNextPage.clickPopUpfield();
//		HumayunAhmedNextPage.clickBookHover();
//		HumayunAhmedNextPage.clickBookHover();
//		HumayunAhmedNextPage.clickCartButton();
//		CartPage.clickPlaceOrder();
//		ShippingPage.doLogin("1738508254");
//		ShippingPage.sendOTP();
		
	}

}
