package PageObject;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class OrderPage {
	WebDriver ldriver;
	
	public OrderPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}

	//click on Monitor
	@FindBy(xpath="//div[@class='col-lg-3']//div//a[4]") WebElement monitor;

	public WebElement getMonitor() {
		return monitor;
	}
	
	//click on Apple Monitor
	@FindBy(xpath="(//div[@class='card-block'])[1] //h4//a") WebElement samsung;

	public WebElement getSamsung() {
		return samsung;
	}
	
	//click on add to cart Button
	@FindBy(xpath="//div[@class='row']/div/a") WebElement addToCart;

	public WebElement getAddToCart() {
		return addToCart;
	}
	
	//assert on product name 
	@FindBy(xpath="//tbody//tr[@class='success']//td[2]") WebElement cartProduct;
	
	
	public WebElement getCartProduct() {
		return cartProduct;
	}

	//click on cart
	@FindBy(id="cartur") WebElement cart;
	public WebElement getCart() {
		return cart;
	}
	//click on place order
	@FindBy(xpath="//button[@class='btn btn-success']") WebElement placeOrder;

	public WebElement getPlaceOrder() {
		return placeOrder;
	}
	//click on name
@FindBy(id="name") WebElement name;

public WebElement getName() {
	return name;
}

public WebElement getCountry() {
	return country;
}
public WebElement getCity() {
	return city;
}
public WebElement getCard() {
	return card;
}
public WebElement getMonth() {
	return month;
}
public WebElement getYear() {
	return year;
}

@FindBy(id="country") WebElement country;
@FindBy(id="city") WebElement city;
@FindBy(id="card") WebElement card;
@FindBy(id="month") WebElement month;
@FindBy(id="year") WebElement year;


//click on purchase
@FindBy(xpath="(//button[@class='btn btn-primary'])[3]") WebElement purchase;

public WebElement getPurchase() {
	return purchase;
}

//click on OK
@FindBy(xpath="//button[@class='confirm btn btn-lg btn-primary']") WebElement ok;

public WebElement getOk() {
	return ok;
}
//click on logOut 
@FindBy(id="logout2") WebElement logOut;

public WebElement getLogOut() {
	return logOut;
}



}
