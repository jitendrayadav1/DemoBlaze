package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver ldriver;
	public String actualUser="DemoUser123";
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	//click on log in
	@FindBy(id="login2") WebElement logIn;
	
	public WebElement getLogIn() {
		return logIn;
	}
	
	//Enter username 
	//loginusername
	
	@FindBy(id="loginusername") WebElement username;
	public WebElement getUsername() {
		return username;
	}
	public WebElement getPassword() {
		return password;
	}

	@FindBy(id="loginpassword") WebElement password;
	
	//click on LogIn Button
	@FindBy(xpath="(//button[@class='btn btn-primary'])[3]") WebElement clickOnLogIn;
	public WebElement getClickOnLogIn() {
		return clickOnLogIn;
	}
	
	
	//for assertion
	@FindBy(id="nameofuser") WebElement name;
	public WebElement getName() {
		return name;
	}
	
}
