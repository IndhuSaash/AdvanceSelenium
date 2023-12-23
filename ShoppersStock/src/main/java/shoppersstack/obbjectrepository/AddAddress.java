package shoppersstack.obbjectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import shoppersstack.baseclass.BaseClass;

public class AddAddress extends BaseClass	 {

	
	public AddAddress (WebDriver driver)
	{
	super ();
	
	}
	
	@FindBy(xpath="//ul[contains(@class,'MuiList-root MuiList')]/li[1]")
	private WebElement Profile_Button;
	
	public WebElement getProfile_Button() {
		return Profile_Button;
	}

	@FindBy(xpath ="//div[contains(text(),'My Addresses')]")
	private WebElement AddAddress_Button;


	public WebElement getAddAddress_Button() {
		return AddAddress_Button;
	}
	
	@FindBy(xpath="//button[contains(@class,'MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedi')]") 
	private WebElement AddAddress1;
	
	//@FindBy(xpath = "")


	public WebElement getAddAddress1() {
		return AddAddress1;
	}
	
	
	
	@FindBy(id="Name")
	private WebElement Name_field;

	public WebElement getName_field() {
		return Name_field;
	}
	
	
 @FindBy(id="House/Office Info")
 private WebElement House_button;

public WebElement getHouse_button() {
	return House_button;
}
 

@FindBy (id="Street Info")
private WebElement Streetinfo;

public WebElement getStreetinfo() {
	return Streetinfo;
}


@FindBy(id="Landmark")
private WebElement landmark;

public WebElement getLandmark() {
	return landmark;
}

@FindBy(id="Pincode")
private WebElement pincode;



public WebElement getPincode() {
	return pincode;
}

@FindBy (id="Phone Number")

private WebElement Phonenumber;


public WebElement getPhonenumber() {
	return Phonenumber;
}

@FindBy(id="Country")

private WebElement Country;


@FindBy(id="State")

private WebElement State;

@FindBy(id="City")

private WebElement City;

public WebElement getCountry() {
	return Country;
}

public void setCity(WebElement city) {
	City = city;
}

public WebElement getState() {
	return State;
}

public WebElement getCity() {
	return City;

}


}
