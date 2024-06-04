package org.demo;

import java.util.Date;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junit {
	
	static WebDriver driver;
	@BeforeClass
	public static void beforeclass() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
	}
	@AfterClass
	public static void Afterclass() {
		driver.quit();
		
	}
	@Before
	public void before() {
		Date d=new Date();
		System.out.println(d);
	}
	@AfterClass
	public static void After() {
		Date d=new Date();
		System.out.println(d);
		}
	
@Test
public  void login() {
	
	driver.findElement(By.id("email")).sendKeys("monishav415@gmai.com");
	driver.findElement(By.id("pass")).sendKeys("12345678");
	driver.findElement(By.id("u_0_5_on")).click();
	
}
	
}
