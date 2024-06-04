package org.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Task8Pojo extends base1 {
	public Task8Pojo() {
		PageFactory.initElements(driver, this);
		
		
	}
	@FindBy(id="email")
	private WebElement textUser;

@FindBy(id="pass")
private WebElement textPass;

@FindBy(xpath="//button[text()='Login']")
private WebElement login;

@FindBy(id="state")
private WebElement State;
@FindBy(xpath="//span[text()='Select City']")
private WebElement city;
@FindBy(xpath="//li[text()='Coimbatore']")
private WebElement cityname;
@FindBy(xpath="//textarea[@class='select2-search__field']")
private WebElement roomType;
@FindBy(xpath="//li[text()='Luxury']")
private WebElement Type;
@FindBy(xpath="//input[@class='form-control from hasDatepicker']")
private WebElement checkinDate;
@FindBy(xpath="//a[text()='20']")
private WebElement fromDate;
@FindBy(xpath="//input[@class='form-control to hasDatepicker']")
private WebElement checkOut;
@FindBy(xpath="//a[text()='26']")
private WebElement toDate;
@FindBy(id="no_rooms")
private WebElement noofRooms;
@FindBy(id="no_adults")
private WebElement noAdults;
@FindBy(id="no_child")
private WebElement noChild;
@FindBy(id="no_adults")
private WebElement nooAdults;
@FindBy(id="searchBtn")
private WebElement search;

@FindBy(xpath="//h5[text()='Hilton Studio']")
private WebElement hotel;
@FindBy(xpath="//a[text()='Continue'])[1]")
private WebElement Continue;

@FindBy(xpath="//input[@id='own']")
private WebElement myselfRadio;


@FindBy(id="user_title")
private WebElement title;
@FindBy(id="first_name")
private WebElement firstname;
@FindBy(id="last_name")
private WebElement lastname;
@FindBy(id="user_phone")
private WebElement phone;
@FindBy(id="user_email")
private WebElement email;
@FindBy(id="gst_registration")
private WebElement gst;
@FindBy(id="company_name")
private WebElement companyname;
@FindBy(id="company_address")
private WebElement cAddress;
@FindBy(id="step1next")
private WebElement next;
@FindBy(id="late")
private WebElement late;

@FindBy(id="other_request")
private WebElement req;
@FindBy(id="step2next")
private WebElement step2;
@FindBy(xpath="//h5[text()='Credit/Debit/ATM Card']")
private WebElement payment;
@FindBy(id="payment_type")
private WebElement paymentType;
@FindBy(id="card_type")
private WebElement cardType;
@FindBy(id="card_no")
private WebElement cardNo;
@FindBy(id="card_name")
private WebElement cardName;
@FindBy(id="submitBtn")
private WebElement submit;
@FindBy(id="card_year")
private WebElement year;
@FindBy(id="cvv")
private WebElement cvv;
@FindBy(id="submitBtn")
private WebElement subBtn;
@FindBy(xpath="//h2[@class='couppon-code']")
private WebElement orderId;
@FindBy(xpath="//button[text()='My Booking']")
private WebElement booking;




































































