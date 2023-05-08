package TestCases;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;


import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import CommonActions.BaseTest;
import PageObject.LoginPage;
import PageObject.OrderPage;
import Utils.TestData;
import junit.framework.Assert;

public class E2E_OrderTest extends BaseTest {

	Utils.ExtentListeners e=new Utils.ExtentListeners();
	public OrderPage order;
	public LoginPage lpage;
	TestData tdata ;
	String expected="Welcome jitendra4555";
	String expProduct="Samsung galaxy s6";

	@Test
	public void placeOrder() throws Exception
	{
		tdata =new TestData();
		lpage=new LoginPage(driver);

		//	click on login
		lpage.getLogIn().click();

		// enter username
		lpage.getUsername().click();
		lpage.getUsername().sendKeys(tdata.userName);

		//enter password
		lpage.getPassword().click();
		lpage.getPassword().sendKeys(tdata.password);

		//click on sign in
		lpage.getClickOnLogIn().click();
		
		
		Thread.sleep(3000);
		//for assertion 
		String actual=lpage.getName().getText();
		Assert.assertEquals(actual,expected);
		e.test.log(Status.INFO,"Login successfully");
//		JavascriptExecutor js= (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,200)");
	//click onmonitor 
		order=new OrderPage(driver);
		//order.getMonitor().click();
	
		//click on Apple Monitor
		order.getSamsung().click();
		
		//click on add to cart
		order.getAddToCart().click();
		
		Thread.sleep(2000);
		Alert alt=driver.switchTo().alert();
		alt.accept();
		
		//click on cart
		order.getCart().click();
		//place order
		
		Thread.sleep(2000);
		String actualCartProduct=order.getCartProduct().getText();
		Assert.assertEquals(expProduct,actualCartProduct);
		e.test.log(Status.INFO,"product verified successfully");
		order.getPlaceOrder().click();
		order.getName().sendKeys(tdata.name);
		order.getCountry().sendKeys(tdata.country);
		order.getCity().sendKeys(tdata.city);
		order.getCard().sendKeys(tdata.credit_card);
		order.getMonth().sendKeys(tdata.month);
		order.getYear().sendKeys(tdata.year);
		e.test.log(Status.INFO,"All Data Entered");
		//click on purchase
		order.getPurchase().click();
		Thread.sleep(2000);
		order.getOk().click();
		Thread.sleep(2000);
		//click on LogOut
		order.getLogOut().click();
		e.test.log(Status.INFO,"LogOut successfully");
		
		
	}

}
