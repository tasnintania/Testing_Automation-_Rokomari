package testcases;

import org.testng.annotations.Test;

import io.qameta.allure.Description;
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
	
	@Test (description = "TestPages")
	@Description("TestPages from Allure")
	 public void TestPages() throws InterruptedException {
		
		HomePage.clickHomepage();
		LoginPage.doLogin("17181203037@cse.bubt.edu.bd", "tania4675@8");
		LoginPage.clickLogin();
		LoginPage.takeScreenShot("Login Successfully");
		HomePage.clickAuthorsfield();
		HomePage.clickHumayunAhmed();
		CartPage.takeScreenShot("Click Humayun Ahmed");
		HumayunAhmedPage.clickCheckBox1();;
		HumayunAhmedPage.clickCheckBox2();
		HumayunAhmedPage.clickNextPage();
		HumayunAhmedNextPage.clickBookHover();
		HumayunAhmedNextPage.clickCartButton();
		HumayunAhmedNextPage.clickCarticon();;
		CartPage.clickPlaceOrderButton();
		CartPage.takeScreenShot("Click Place Order");
		ShippingPage.fillInfo();
		
	}

}
