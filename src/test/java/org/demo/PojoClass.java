package org.demo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoClass extends BaseClass{
	public PojoClass() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
private WebElement txtUser;
	@FindBy(id="password")
private WebElement txtpass;
	@FindBy(id="login")
	private WebElement login;
	@FindBy(id="location")
	private WebElement location;
	@FindBy(id="hotels")
	private WebElement hotels;
	@FindBy(id="room_type")
private WebElement roomType;
	@FindBy(id="room_nos")
	private WebElement room;
	@FindBy(id="datepick_in")
	private WebElement dateCheckIn;	
	@FindBy(id="datepick_out")
	private WebElement dateCheckOut;
	@FindBy(id="adult_room")
	private WebElement adultsPerRoom;
	@FindBy(id="Submit")
	private WebElement search;
	@FindBy(id="radiobutton_0")
	private WebElement radio;
	@FindBy(id="continue")
	private WebElement con;
	@FindBy(id="first_name")
	private WebElement name;
	@FindBy(id="last_name")
	private WebElement lastname;
	@FindBy(id="address")
	private WebElement address;
	@FindBy(id="cc_num")
	private WebElement ccNo;
	@FindBy(id="cc_type")
	private WebElement ccType;
	@FindBy(id="cc_exp_month")
	private WebElement expMonth;
	@FindBy(id="cc_exp_year")
	private WebElement expYear;
	@FindBy(id="cc_cvv")
	private WebElement CVVNo;
	@FindBy(id="book_now")
	private WebElement book;
	@FindBy(xpath="//input[@id='order_no']")
	private WebElement order;
	//get the elements
public WebElement gettxtUser() {
	return txtUser;
	}
public WebElement gettxtpass() {
	return txtpass;
}
public WebElement getlogin() {
	return login;
}
public WebElement getlocation() {
	return location;
}
public WebElement gethotels() {
	return hotels;
}
public WebElement getroomType() {
	return roomType;
}
public WebElement getroom() {
	return room;
}
public WebElement getdateCheckIn() {
	return dateCheckIn;
}
public WebElement getdateCheckOut() {
	return dateCheckOut;
}
public WebElement getadultsPerRoom() {
	return adultsPerRoom;
}
public WebElement getsearch() {
	return search;
}
public WebElement getradio() {
	return radio;
}
public WebElement getcon() {
	return con;
}
public WebElement getname() {
	return name;
}
public WebElement getlastname() {
	return lastname;
}
public WebElement getaddress() {
	return address;
}
public WebElement getccNo() {
	return ccNo;
}
public WebElement getccType() {
	return ccType;
}
public WebElement getexpMonth() {
	return expMonth;
}
public WebElement getexpYear() {
	return expYear;
}
public WebElement getCVVNo() {
	return CVVNo;
}
public WebElement getbook() {
	return book;
}
public WebElement getorder() {
	return order;
}


}
