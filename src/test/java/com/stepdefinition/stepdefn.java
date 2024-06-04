package com.stepdefinition;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.demo.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepdefn extends BaseClass{
	WebDriver driver;

@Given("User is on the OMR branch Hotel Page")
public void user_is_on_the_OMR_branch_Hotel_Page() throws FileNotFoundException, IOException {
	browserLaunch(getPropertyFileValue("browser"));
	
}

@When("User login {string},{string}")
public void user_login(String string, String string2) {
	
	
    
}

@Then("User should verify success message after login {string}")
public void user_should_verify_success_message_after_login(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}


	

}
