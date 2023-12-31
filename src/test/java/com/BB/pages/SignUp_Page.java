package com.BB.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.BB.utils.SeWrappers;

public class SignUp_Page extends SeWrappers{
	
	@FindBy(xpath ="//div[@class='country-selection']//h4[contains(text(),'United States')]")
	public WebElement US; 
	public void clickUSpage() {
		actionsDoubleclickElement(US);
	}
	
	@FindBy(xpath="//button[@id='account-menu-account-button']//*[name()='svg']")
	public WebElement accButton; 
	public void clickAccButton() {
		clickElement(accButton);
	}

	@FindBy(xpath="//a[text()='Create Account']")
	public WebElement createAcc; 
	public void clickCreateAcc() {
		//waitforelementExplicitwait(createAccButton, 10);
		clickElement(createAcc);
	}

	@FindBy(xpath="//input[@id='firstName']")
	public WebElement firstName;
	public void enterFirstname(String myname) {
		waitforelementExplicitwait(firstName, 5);
		typeText(firstName, myname);
	}

	@FindBy(xpath="//input[@id='lastName']")
	public WebElement lastName;
	public void enterLastname(String mylastname) {
		typeText(lastName, mylastname);
	}

	@FindBy(xpath="//input[@id='email']")
	public WebElement email; 
	public void enteremail(String myemail) {
		typeText(email, myemail);
	}
	
	@FindBy(xpath="//span[@class='c-toggle-slider c-toggle-round']")
	public WebElement toggle;
	public void clicktoggle() {
		clickElement(toggle);
	}
	
	@FindBy(xpath="//input[@id='fld-p1']")
	public WebElement pwd; 
	public void enterpassword(String mypwd) {
		waitforelementExplicitwait(pwd, 10);
		typeText(pwd, mypwd);
	}
	
	@FindBy(xpath="//input[@id='reenterPassword']")
	public WebElement repwd;
	public void enterCopassword(String myCpwd) {
		typeText(repwd,myCpwd);
	}
	
	@FindBy(xpath="//input[@id='phone']")
	public WebElement phnum;
	public void enterPhonenum(String num) {
		typeText(phnum, num);
	}
	
	@FindBy(xpath="//button[text()='Create an Account']")
	WebElement clickcreateacc2;
	public void clickCreateAccfinish() {
		clickElement(clickcreateacc2);
	}
	
}
