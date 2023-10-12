package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLoginPage {
	//DECLARATION
	//address of email text field
	@FindBy(id="email")
	private WebElement emailTF;
	//ADdRESS OF PASSWord
	@FindBy(id="pass")
	private WebElement passwordTF;
	//address of login
	@FindBy(xpath="//button[@name='login']")
	private WebElement loginBtn;
	
	
	//initialization
	public FacebookLoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	//utialization
	//getter for all private web element
	public WebElement getEmailTF() {
		return emailTF;
	}
	public WebElement getPasswordTF() {
		return passwordTF;
	}
	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
	//BBusiness libraries
	public void emailTextField(String data) {
		emailTF.sendKeys(data);
	}
	public void passwordTextField(String data) {
		passwordTF.sendKeys(data);	
	}
	public void loginButton() {
		loginBtn.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
